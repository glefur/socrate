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

import java.util.Collection;

import com.google.common.collect.Lists;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public final class CRADay {

	private final int day;
	private Collection<Work> works;

	/**
	 * @param day
	 */
	public CRADay(int day) {
		this.day = day;
		this.works = Lists.newArrayList();
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * @return the total load of the day.
	 */
	public double totalLoad() {
		double load = 0;
		for (Work work : works) {
			load += work.getLoad();
		}
		return load;
	}
	
	/**
	 * Add a work in the day.
	 * @param load load of work.
	 * @param task the Task.
	 */
	public void addWork(double load, Task task) {
		Work work = new Work(load, task);
		works.add(work);
	}

	/**
	 * @return the works
	 */
	public Collection<Work> getWorks() {
		return works;
	}
	
	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Day ").append(day).append(":\n");
		for (Work work : works) {
			sb.append(work).append('\n');
		}
		return sb.toString();
	}
	
}
