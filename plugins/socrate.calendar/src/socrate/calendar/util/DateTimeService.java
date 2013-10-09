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

package socrate.calendar.util;

import java.util.Date;

import socrate.calendar.services.CalendarService.DayOfTheWeek;



/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public interface DateTimeService {

	public DateInterval dayOfWeek(int weekNumber, DayOfTheWeek day);
	
	public static final class DateInterval {
		
		private final Date start;
		private final Date end;
		
		public DateInterval(Date start, Date end) {
			this.start = start;
			this.end = end;
		}

		public Date start() {
			return start;
		}

		public Date end() {
			return end;
		}
		
	}
}
