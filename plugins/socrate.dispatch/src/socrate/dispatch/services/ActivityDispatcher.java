/*
 * Copyright (c) 2013 Goulwen Le Fur <goulwen .lefur at gmail.com>. 
 * 
 * This file is part of the SoCrate application.
 * 
 * SoCrate is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SoCrate is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with SoCrate.  If not, see <http ://www.gnu.org/licenses/>.
 */
package socrate.dispatch.services;

import socrate.calendar.ActualCalendar;
import socrate.dispatch.ReportingCalendar;

/**
 * Interface for services dispatching the calendar activities.
 * 
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public interface ActivityDispatcher {

	/**
	 * Converts an {@link ActualCalendar} into a {@link ReportingCalendar}.
	 * @param actualCalendar the calendar to convert.
	 * @return the reported version of the input calendar.
	 */
	ReportingCalendar convertToReportCalendar(ActualCalendar actualCalendar);
	
	
}
