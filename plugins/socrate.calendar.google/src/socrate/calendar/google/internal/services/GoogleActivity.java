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

import socrate.calendar.Activity;

import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.extensions.When;



/**
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 *
 */
public class GoogleActivity implements Activity {

	private CalendarEventEntry event;

	public GoogleActivity(CalendarEventEntry event) {
		this.event = event;
	}
	
	/**
	 * {@inheritDoc}
	 * @see socrate.calendar.Activity#getTitle()
	 */
	@Override
	public String getTitle() {
		return event.getTitle().getPlainText();
	}

	/**
	 * {@inheritDoc}
	 * @see socrate.calendar.Activity#getStartTime()
	 */
	@Override
	public long getStartTime() {
		When when = event.getTimes().get(0);
		return when.getStartTime().getValue();
	}
	
}
