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

package socrate.calendar.internal.util;

import java.util.Calendar;
import java.util.Date;

import socrate.calendar.CalendarService.DayOfTheWeek;
import socrate.calendar.util.DateTimeService;



/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public class DateTimeServiceImpl implements DateTimeService {

	/**
	 * @param weekNumber
	 * @return
	 */
	public DateInterval dayOfWeek(int weekNumber, DayOfTheWeek day) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, weekNumber);
		cal.set(Calendar.DAY_OF_WEEK, day.getDay());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		Date start = cal.getTime();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		Date end = cal.getTime();
		return new DateInterval(start, end);
	}
	
	
}
