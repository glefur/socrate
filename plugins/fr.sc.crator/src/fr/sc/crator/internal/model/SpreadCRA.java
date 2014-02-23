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

import org.apache.poi.ss.usermodel.Sheet;

import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAWeek;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class SpreadCRA implements CRA {

	private final String path;
	private final Sheet sourceSheet;
	private CRAWeek week;

	public SpreadCRA(String source, Sheet sourceSheet) {
		this.path = source;
		this.sourceSheet = sourceSheet;
		this.week = new CRAWeek();
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.model.CRA#getSource()
	 */
	@Override
	public String getSource() {
		return path;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.model.CRA#getWeek()
	 */
	@Override
	public CRAWeek getWeek() {
		return week;
	}

	/**
	 * @return the sourceSheet
	 */
	public Sheet getSheet() {
		return sourceSheet;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CRA - CRA created from the SpreadSheet\n");
		return sb.append(week).toString();
	}
		
}
