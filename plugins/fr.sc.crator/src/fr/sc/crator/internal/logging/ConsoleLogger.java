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
package fr.sc.crator.internal.logging;

import fr.sc.crator.logging.CRAtorLogger;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class ConsoleLogger implements CRAtorLogger {

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.logging.CRAtorLogger#log(int, java.lang.String)
	 */
	@Override
	public void log(int level, String message) {
		StringBuilder msg = new StringBuilder("[");
		msg.append(level2String(level));
		msg.append("] ");
		msg.append(message);
		System.out.println(msg.toString());
	}

	
	private String level2String(int level) {
		switch (level) {
		case LOG_DEBUG:
			return "DEBUG";
		case LOG_WARNING:
			return "WARNING";
		case LOG_ERROR:
			return "ERROR";
		default:
			return "INFO";
		}
	}
}
