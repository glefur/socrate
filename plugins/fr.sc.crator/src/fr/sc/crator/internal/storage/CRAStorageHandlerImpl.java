/*
 * Copyright (c) 2014 Goulwen Le Fur <goulwen .lefur at gmail.com>. 
 * 
 * This file is part of the Crator application.
 * 
 * Crator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Crator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Crator.  If not, see <http ://www.gnu.org/licenses/>.
 */
package fr.sc.crator.internal.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Maps;

import fr.sc.crator.logging.CRAtorLogger;
import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRADay;
import fr.sc.crator.model.CRAWeek;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.model.SpreadCRA;
import fr.sc.crator.model.Task;
import fr.sc.crator.model.VoidCRA;
import fr.sc.crator.model.Work;
import fr.sc.crator.storage.CRAStorageHandler;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class CRAStorageHandlerImpl implements CRAStorageHandler {

	private static final String EMPTY_STRING = "";
	private static final int STARTING_ROW_NUMBER = 7;
	private static final int CODE_CELL_NUMBER = 2;
	private static final int TITLE_CELL_NUMBER = 3;
	private static final int DAY_CELL_OFFSET = 4;
	
	private CRAtorLogger logger;
	
	/**
	 * @param logger the logger to set
	 */
	public void setLogger(CRAtorLogger logger) {
		this.logger = logger;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.storage.CRAStorageHandler#readCRA(fr.sc.crator.model.CRAtor, int, java.lang.String)
	 */
	@Override
	public CRA readCRA(CRAtor crator, int weekNumber, String source) {
		try {
			FileInputStream file = new FileInputStream(new File(source));
			logger.log(CRAtorLogger.LOG_DEBUG, "Trying to read file " + source);
			Workbook wb = WorkbookFactory.create(file);
			file.close();
			Sheet sheet = wb.getSheetAt(0);
			logger.log(CRAtorLogger.LOG_DEBUG, "Instanciating a SpreadCRA");
			SpreadCRA cra = CratorFactory.eINSTANCE.createSpreadCRA();
			cra.setSheet(sheet);
			cra.setSource(source);
			cra.setWeekNumber(weekNumber);
			CRAWeek week = CratorFactory.eINSTANCE.createCRAWeek();
			double workedDay = sheet.getRow(1).getCell(1).getNumericCellValue();
			week.setWorkedLoad(workedDay);
			cra.setWeek(week);
			logger.log(CRAtorLogger.LOG_DEBUG, "Loading existing data");
			loadWeek(crator, cra);
			return cra;
		} catch (InvalidFormatException e) {
			logger.log(CRAtorLogger.LOG_ERROR, "An error occured during loading CRA of " + source + " file. Error: " + e.getMessage());
		} catch (IOException e) {
			logger.log(CRAtorLogger.LOG_ERROR, "An error occured during loading CRA of " + source + " file. Error: " + e.getMessage());
		}
		VoidCRA result = CratorFactory.eINSTANCE.createVoidCRA();
		crator.getCras().add(result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.storage.CRAStorageHandler#writeCRA(fr.sc.crator.model.CRA)
	 */
	@Override
	public void writeCRA(CRA cra) {
		if (cra instanceof SpreadCRA) {
			FileOutputStream out;
			try {
				SpreadCRA spreadCRA = (SpreadCRA) cra;
				logger.log(CRAtorLogger.LOG_DEBUG, "Updating data of CRA " + spreadCRA.getSource());
				updateSheet(spreadCRA);
				logger.log(CRAtorLogger.LOG_DEBUG, "Writing CRA to " + spreadCRA.getSource() + " file");
				out = new FileOutputStream(spreadCRA.getSource());
				spreadCRA.getSheet().getWorkbook().write(out);
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void loadWeek(CRAtor crator, SpreadCRA cra) {
		int currentRow = STARTING_ROW_NUMBER;
		Row row = cra.getSheet().getRow(currentRow);
		Cell codeCell = row.getCell(CODE_CELL_NUMBER);
		String code = codeCell.getStringCellValue();
		while (code != null && !EMPTY_STRING.equals(code)) {
			Cell titleCell = row.getCell(TITLE_CELL_NUMBER);
			String title = titleCell.getStringCellValue();
			Task task = crator.getTask(code);
			if (task == null) {
				task = CratorFactory.eINSTANCE.createTask();
				task.setCode(code);
				task.setDescription(title);
				crator.getTasks().add(task);
			}
			for (int i = Calendar.MONDAY; i <= Calendar.FRIDAY; i++) {
				Cell loadCell = row.getCell(DAY_CELL_OFFSET + i);
				double load = loadCell.getNumericCellValue();
				if (load > 0) {
					Work work = CratorFactory.eINSTANCE.createWork();
					work.setLoad(load);
					work.setTask(task);
					cra.getWeek().getDay(i).getWorks().add(work);
				}
			}
			currentRow++;
			row = cra.getSheet().getRow(currentRow);
			codeCell = row.getCell(CODE_CELL_NUMBER);
			code = codeCell.getStringCellValue();
		}
	}
	
	private void updateSheet(SpreadCRA cra) {
		Map<String, Integer> codeRowAssociationMap = Maps.newHashMap();
		int currentRowIndex = STARTING_ROW_NUMBER;
		for (int i = Calendar.MONDAY; i <= Calendar.FRIDAY; i++) {
			CRADay day = cra.getWeek().getDay(i);
			for (Work work : day.getWorks()) {
				String code = work.getTask().getCode();
				Integer rowIndex = codeRowAssociationMap.get(code);
				Row row;
				if (rowIndex == null) {
					rowIndex = new Integer(currentRowIndex);
					codeRowAssociationMap.put(code, rowIndex);
					currentRowIndex++;
					row = cra.getSheet().getRow(rowIndex);
					row.getCell(CODE_CELL_NUMBER).setCellValue(code);
					row.getCell(TITLE_CELL_NUMBER).setCellValue(work.getTask().getDescription());
				} else {
					row = cra.getSheet().getRow(rowIndex);
				}
				row.getCell(DAY_CELL_OFFSET + i).setCellValue(work.getLoad());
			}
		}
	}

}
