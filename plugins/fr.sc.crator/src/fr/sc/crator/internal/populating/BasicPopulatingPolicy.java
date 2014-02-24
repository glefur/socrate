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
package fr.sc.crator.internal.populating;

import java.util.Calendar;

import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRADay;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.model.Task;
import fr.sc.crator.model.Work;
import fr.sc.crator.populating.CRAPopulatingPolicy;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class BasicPopulatingPolicy implements CRAPopulatingPolicy {

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.populating.CRAPopulatingPolicy#populateCRA(fr.sc.crator.model.model.CRA)
	 */
	@Override
	public void populateCRA(CRA cra) {
		Task task =cra.getCrator().getTask("OBEO-AVV-DVRS");
		if (task == null) {
			task = CratorFactory.eINSTANCE.createTask();
			task.setCode("OBEO-AVV-DVRS");
			task.setDescription("AVV Divers");
		}
		for (int day = Calendar.MONDAY; day <= Calendar.FRIDAY; day++) {
			CRADay workDay = cra.getWeek().getDay(day);
			double totalLoad = workDay.totalLoad();
			if (totalLoad < 1) {
				Work work = CratorFactory.eINSTANCE.createWork();
				work.setLoad(1 - totalLoad);
				work.setTask(task);
				workDay.getWorks().add(work);
			}
		}
	}

}
