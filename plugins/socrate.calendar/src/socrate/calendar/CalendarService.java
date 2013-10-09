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
package socrate.calendar;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public interface CalendarService {

	/**
	 * Returns all the activities performed during the given week.
	 * @param weekNumber the number of the requested week.
	 * @return the associated list of {@link Activity}ies.
	 */
	Map<DayOfTheWeek, List<Activity>> activitiesOfWeek(int weekNumber);
	
	public enum DayOfTheWeek {
		
		MONDAY(Calendar.MONDAY),
		TUESDAY(Calendar.TUESDAY),
		WEDNESDAY(Calendar.WEDNESDAY),
		THURSDAY(Calendar.THURSDAY),
		FRIDAY(Calendar.FRIDAY);
		
		private int day;
		
		private DayOfTheWeek(int day) {
			this.day = day;
		}

		/**
		 * @return the day
		 */
		public int getDay() {
			return day;
		}

		/**
		 * {@inheritDoc}
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			switch (day) {
			case Calendar.MONDAY:
				return "Monday";
			case Calendar.TUESDAY:
				return "Tuesday";
			case Calendar.WEDNESDAY:
				return "Wednesday";
			case Calendar.THURSDAY:
				return "Thursday";
			case Calendar.FRIDAY:
				return "Friday";
			default:
				return "Otherday";
			}
		}
	}
	
}
