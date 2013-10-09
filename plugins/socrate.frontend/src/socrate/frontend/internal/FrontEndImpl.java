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

package socrate.frontend.internal;

import socrate.calendar.ActualActivity;
import socrate.calendar.ActualCalendar;
import socrate.calendar.DayOfTheWeek;
import socrate.calendar.services.CalendarService;

/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public class FrontEndImpl {

	private CalendarService calendarService;

	/**
	 * @param calendarService the calendarService to set
	 */
	public void setCalendarService(CalendarService calendarService) {
		this.calendarService = calendarService;
	}
	
	public void activate() {
		System.out.println("Activated! Service " + calendarService);
		ActualCalendar activitiesOfWeek = calendarService.activitiesOfWeek(41);
		for (DayOfTheWeek day : DayOfTheWeek.values()) {
			System.out.println("On " + day);
			for (ActualActivity activity : activitiesOfWeek.activitiesOfTheDay(day)) {
				System.out.println("\tAt " + activity.getStartTime() + " " + activity.getTitle());
			}
		}
	}
	
}
