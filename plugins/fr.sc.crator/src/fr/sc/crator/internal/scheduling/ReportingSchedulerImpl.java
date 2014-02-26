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
package fr.sc.crator.internal.scheduling;

import java.util.Calendar;
import java.util.List;

import com.google.common.collect.Lists;

import fr.sc.crator.logging.CRAtorLogger;
import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.scheduling.ReportingScheduler;
import fr.sc.crator.storage.CRAStorageHandler;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class ReportingSchedulerImpl implements ReportingScheduler {

	private CRAtorLogger cratorLogger;
	private CRAStorageHandler storageHandler;
	
	private String craDirectory = "/home/glefur/CRA/Tests";
	
	/**
	 * @param storageHandler the storageHandler to set
	 */
	public void setStorageHandler(CRAStorageHandler storageHandler) {
		this.storageHandler = storageHandler;
	}

	/**
	 * @param cratorLogger the cratorLogger to set
	 */
	public void setCratorLogger(CRAtorLogger cratorLogger) {
		this.cratorLogger = cratorLogger;
	}

	/**
	 * @param craDirectory the craDirectory to set
	 */
	public void setCRADirectory(String craDirectory) {
		this.craDirectory = craDirectory;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.scheduling.ReportingScheduler#craToFillIn()
	 */
	@Override
	public List<CRA> craToFillIn(CRAtor crator) {
		cratorLogger.log(CRAtorLogger.LOG_DEBUG, "Computing CRA to fill in...");
		List<CRA> result = Lists.newArrayList();
		int weekToCheck = getWeekOfTheYear() - 1;
		while (weekToCheck > 0) {
			cratorLogger.log(CRAtorLogger.LOG_DEBUG, "Analyzing CRA of week " + weekToCheck);
			CRA cra = storageHandler.readCRA(crator, weekToCheck, craPathForWeek(weekToCheck));
			if (!cra.craFilled()) {
				cratorLogger.log(CRAtorLogger.LOG_DEBUG, "Adding CRA of week " + weekToCheck + " to list of CRA to fill in");
				crator.getCras().add(cra);
				result.add(cra);
				weekToCheck--;
			} else {
				cratorLogger.log(CRAtorLogger.LOG_DEBUG, "End of list of CRA to fill in");				
				return result;
			}
		}
		return result;
	}
	
	private int getWeekOfTheYear() {
		return Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
	}
	
	private String craPathForWeek(int weekNumber) {
		StringBuilder path = new StringBuilder(craDirectory).append("/S");
		if (weekNumber < 10) {
			path.append('0');
		}
		path.append(weekNumber).append("/CRA Prev S");
		if (weekNumber < 10) {
			path.append('0');
		}
		path.append(weekNumber).append(" GLF.xls");		
		return path.toString();
	}

}
