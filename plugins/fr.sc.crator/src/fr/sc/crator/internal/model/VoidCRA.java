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
package fr.sc.crator.internal.model;

import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAWeek;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class VoidCRA implements CRA {

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.model.CRA#getSource()
	 */
	@Override
	public String getSource() {
		return "No Source";
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.model.CRA#getWeek()
	 */
	@Override
	public CRAWeek getWeek() {
		return new CRAWeek();
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CRA - Void CRA";
	}

}
