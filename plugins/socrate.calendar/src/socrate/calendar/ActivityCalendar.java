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

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import socrate.calendar.CalendarService.DayOfTheWeek;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class ActivityCalendar {

	private Map<DayOfTheWeek, List<Activity>> calendar;

	public ActivityCalendar() {
		calendar = Maps.newHashMap();
	}
	
	/**
	 * Returns the activities of the given day.
	 * @param day the {@link DayOfTheWeek}.
	 * @return the {@link List} of {@link Activity}ies of the given day.
	 */
	public List<Activity> activitiesOfTheDay(DayOfTheWeek day) {
		List<Activity> activities = calendar.get(day);
		if (activities == null) {
			return Collections.EMPTY_LIST;
		} else {
			return activities;
		}
	}
	
	/**
	 * Adds an activity at the given day.
	 * @param day {@link DayOfTheWeek} when to add the activity.
	 * @param activity {@link Activity} to add.
	 */
	public void addActivity(DayOfTheWeek day, Activity activity) {
		List<Activity> activities = calendar.get(day);
		if (activities == null) {
			activities = Lists.newArrayList();
			calendar.put(day, activities);
		}
		activities.add(activity);
	}


	/**
	 * Adds a list of activities at the given day.
	 * @param day {@link DayOfTheWeek} when to add the activity.
	 * @param activities the {@link Activity}ies to add.
	 */
	public void addActivities(DayOfTheWeek day, List<Activity> activities) {
		List<Activity> currentActivities = calendar.get(day);
		if (currentActivities == null) {
			calendar.put(day, activities);
		} else {
			currentActivities.addAll(activities);
		}
	}

	/**
	 * Removes an activity at the given day.
	 * @param day {@link DayOfTheWeek} when to remove the activity.
	 * @param activity {@link Activity} to remove.
	 */
	public void removeActivity(DayOfTheWeek day, Activity activity) {
		List<Activity> activities = calendar.get(day);
		if (activities != null) {
			activities.remove(activity);
		}
	}


	/**
	 * Removes a list of activities at the given day.
	 * @param day {@link DayOfTheWeek} when to remove the activity.
	 * @param activities the {@link Activity}ies to remove.
	 */
	public void removeActivities(DayOfTheWeek day, List<Activity> activities) {
		List<Activity> currentActivities = calendar.get(day);
		if (currentActivities != null) {
			currentActivities.removeAll(activities);
		}
	}
}
