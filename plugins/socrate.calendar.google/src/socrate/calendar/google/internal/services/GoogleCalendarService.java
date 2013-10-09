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

package socrate.calendar.google.internal.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.osgi.framework.BundleContext;

import socrate.calendar.ActualCalendar;
import socrate.calendar.DayOfTheWeek;
import socrate.calendar.services.CalendarService;
import socrate.calendar.util.DateTimeService;
import socrate.calendar.util.DateTimeService.DateInterval;

import com.google.gdata.client.calendar.CalendarQuery;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.util.ServiceException;



/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public class GoogleCalendarService implements CalendarService {

	private static final String FILE = "config.properties";

	// The base URL for a user's calendar metafeed (needs a username appended).
	private static final String METAFEED_URL_BASE = "https://www.google.com/calendar/feeds/";

	// The string to add to the user's metafeedUrl to access the event feed for
	// their primary calendar.
	private static final String EVENT_FEED_URL_SUFFIX = "/private/full";

	// The URL for the event feed of the specified user's primary calendar.
	// (e.g. http://www.googe.com/feeds/calendar/jdoe@gmail.com/private/full)
	private static URL eventFeedUrl = null;

	private DateTimeService dateTimeService;

	private com.google.gdata.client.calendar.CalendarService calendarClient;


	public void activate(BundleContext context) throws IOException, ServiceException {
		Properties props = new Properties();
		URL resource = context.getBundle().getResource(FILE);
		InputStream in;
		in = resource.openStream();
		props.load(in);
		calendarClient = new com.google.gdata.client.calendar.CalendarService("socrate");
		String userName = props.getProperty("login");
		String userPassword = props.getProperty("password");

		// Create the necessary URL objects.
		eventFeedUrl = new URL(METAFEED_URL_BASE + userName + EVENT_FEED_URL_SUFFIX);
		calendarClient.setUserCredentials(userName, userPassword);
	}

	/**
	 * @param dateTimeService the dateTimeService to set
	 */
	public void setDateTimeService(DateTimeService dateTimeService) {
		this.dateTimeService = dateTimeService;
	}

	/**
	 * {@inheritDoc}
	 * @see socrate.calendar.services.CalendarService#activitiesOfWeek(int)
	 */
	public ActualCalendar activitiesOfWeek(int weekNumber) {
		ActualCalendar result = new ActualCalendar();
		for (DayOfTheWeek dayOfTheWeek : DayOfTheWeek.values()) {
			DateInterval interval = dateTimeService.dayOfWeek(weekNumber, dayOfTheWeek);
			try {
				for (CalendarEventEntry event : eventOfInterval(interval)) {
					result.addActivity(dayOfTheWeek, new GoogleActivity(event));
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	private List<CalendarEventEntry> eventOfInterval(DateInterval interval) throws IOException, ServiceException {
	    // Send the request and receive the response:
	    CalendarQuery myQuery = new CalendarQuery(eventFeedUrl);
	    myQuery.setMinimumStartTime(new DateTime(interval.start()));
	    myQuery.setMaximumStartTime(new DateTime(interval.end()));

	    // Send the request and receive the response:
	    CalendarEventFeed resultEventFeed = calendarClient.query(myQuery, CalendarEventFeed.class);
	    return resultEventFeed.getEntries();
	}

}
