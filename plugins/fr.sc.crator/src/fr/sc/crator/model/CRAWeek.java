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
package fr.sc.crator.model;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class CRAWeek {

	private Map<Integer, CRADay> days;

	/**
	 * 
	 */
	public CRAWeek() {
		days = Maps.newHashMap();
	}

	/**
	 * Returns the {@link CRADay} for the given day.
	 * @param day the expected day.
	 * @return the associated {@link CRADay}.
	 */
	public final CRADay getDay(int day) {
		CRADay craDay = days.get(day);
		if (craDay == null) {
			craDay = new CRADay(day);
			days.put(day, craDay);
		}
		return craDay;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= 6; i++) {
			sb.append(getDay(i));
		}
		return sb.toString();
	}

}
