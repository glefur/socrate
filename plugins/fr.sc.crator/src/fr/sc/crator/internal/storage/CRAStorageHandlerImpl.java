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
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Maps;

import fr.sc.crator.internal.model.SpreadCRA;
import fr.sc.crator.internal.model.VoidCRA;
import fr.sc.crator.logging.CRAtorLogger;
import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRADay;
import fr.sc.crator.model.Task;
import fr.sc.crator.model.Work;
import fr.sc.crator.storage.CRAStorageHandler;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class CRAStorageHandlerImpl implements CRAStorageHandler {

	private static final String EMPTY_STRING = "";
	private static final int STARTING_ROW_NUMBER = 7;
	private static final int ENDING_ROW_NUMBER = 20;
	private static final int CODE_CELL_NUMBER = 2;
	private static final int TITLE_CELL_NUMBER = 3;
	private static final int DAY_CELL_OFFSET = 4;
	private static final int TOTALLOAD_CELL_NUMBER = 11;
	
	private CRAtorLogger logger;
	
	/**
	 * @param logger the logger to set
	 */
	public void setLogger(CRAtorLogger logger) {
		this.logger = logger;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.storage.CRAStorageHandler#readCRA(java.lang.String)
	 */
	@Override
	public CRA readCRA(String source) {
		try {
			FileInputStream file = new FileInputStream(new File(source));
			logger.log(CRAtorLogger.LOG_DEBUG, "Trying to read file " + source);
			Workbook wb = WorkbookFactory.create(file);
			file.close();
			Sheet s = wb.getSheetAt(0);
			logger.log(CRAtorLogger.LOG_DEBUG, "Instanciating a SpreadCRA");
			SpreadCRA cra = new SpreadCRA(source, s);
			logger.log(CRAtorLogger.LOG_DEBUG, "Loading existing data");
			loadWeek(cra);
			return cra;
		} catch (InvalidFormatException e) {
			logger.log(CRAtorLogger.LOG_ERROR, "An error occured during loading CRA of " + source + " file. Error: " + e.getMessage());
		} catch (IOException e) {
			logger.log(CRAtorLogger.LOG_ERROR, "An error occured during loading CRA of " + source + " file. Error: " + e.getMessage());
		}
		return new VoidCRA();
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

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.storage.CRAStorageHandler#isFilled(fr.sc.crator.model.CRA)
	 */
	@Override
	public boolean isFilled(CRA cra) {
		if (cra instanceof SpreadCRA) {
			Sheet sheet = ((SpreadCRA) cra).getSheet();
			double workedDay = sheet.getRow(1).getCell(1).getNumericCellValue();
			logger.log(CRAtorLogger.LOG_DEBUG, "Worked days:" + workedDay);
			double totalWork = 0;
			FormulaEvaluator evaluator = sheet.getWorkbook().getCreationHelper().createFormulaEvaluator();
			for (int rowNumber = STARTING_ROW_NUMBER; rowNumber < ENDING_ROW_NUMBER; rowNumber++) {
				Row row = sheet.getRow(rowNumber);
				Cell cell = row.getCell(TOTALLOAD_CELL_NUMBER);
				CellValue cellEvaluation = evaluator.evaluate(cell);
				totalWork += cellEvaluation.getNumberValue();
			}
			logger.log(CRAtorLogger.LOG_DEBUG, "Total work:" + totalWork);			
			boolean result = totalWork >= workedDay;
			logger.log(CRAtorLogger.LOG_DEBUG, "CRA " + cra.getSource() + " filled ? " + result);			
			return result;
		}
		return true;
	}

	private void loadWeek(SpreadCRA cra) {
		int currentRow = STARTING_ROW_NUMBER;
		Row row = cra.getSheet().getRow(currentRow);
		Cell codeCell = row.getCell(CODE_CELL_NUMBER);
		String code = codeCell.getStringCellValue();
		while (code != null && !EMPTY_STRING.equals(code)) {
			Cell titleCell = row.getCell(TITLE_CELL_NUMBER);
			String title = titleCell.getStringCellValue();
			Task task = new Task(code, title);
			for (int i = Calendar.MONDAY; i <= Calendar.FRIDAY; i++) {
				Cell loadCell = row.getCell(DAY_CELL_OFFSET + i);
				double load = loadCell.getNumericCellValue();
				if (load > 0) {
					cra.getWeek().getDay(i).addWork(load, task);
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
