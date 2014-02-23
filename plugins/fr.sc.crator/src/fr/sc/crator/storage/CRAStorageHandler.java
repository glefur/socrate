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
package fr.sc.crator.storage;

import fr.sc.crator.model.CRA;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public interface CRAStorageHandler {

	/**
	 * Read the specified CRA.
	 * @param source of the CRA to read.
	 */
	CRA readCRA(String source);
	
	/**
	 * @param cra
	 */
	void writeCRA(CRA cra);
	
	/**
	 * Defines if the given is already filled.
	 * @param cra the {@link CRA} to check.
	 * @return <code>true</code> if the {@link CRA} is already filled.
	 */
	boolean isFilled(CRA cra);
	
}
