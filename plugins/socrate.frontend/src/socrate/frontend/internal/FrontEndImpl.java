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

import java.util.List;
import java.util.Map;

import socrate.calendar.Activity;
import socrate.calendar.CalendarService;
import socrate.calendar.CalendarService.DayOfTheWeek;



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
		Map<DayOfTheWeek, List<Activity>> activitiesOfWeek = calendarService.activitiesOfWeek(41);
		for (DayOfTheWeek day : activitiesOfWeek.keySet()) {
			System.out.println("On " + day);
			List<Activity> activities = activitiesOfWeek.get(day);
			for (Activity activity : activities) {
				System.out.println("\tAt " + activity.getStartTime() + " " + activity.getTitle());
			}
		}
	}
	
}
