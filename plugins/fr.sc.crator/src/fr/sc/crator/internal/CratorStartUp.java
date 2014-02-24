/*
s * Copyright (c) 2013 Goulwen Le Fur <goulwen .lefur at gmail.com>. 
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
package fr.sc.crator.internal;

import java.util.List;

import fr.sc.crator.StartUp;
import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.populating.CRAPopulatingPolicy;
import fr.sc.crator.scheduling.ReportingScheduler;
import fr.sc.crator.storage.CRAStorageHandler;


/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public class CratorStartUp implements StartUp {

	private ReportingScheduler reportingScheduler;
	private CRAStorageHandler storageHandler;
	private CRAPopulatingPolicy populatingPolicy;
	
	/**
	 * @param reportingScheduler the reportingScheduler to set
	 */
	public void setReportingScheduler(ReportingScheduler reportingScheduler) {
		this.reportingScheduler = reportingScheduler;
	}

	/**
	 * @param storageHandler the storageHandler to set
	 */
	public void setStorageHandler(CRAStorageHandler storageHandler) {
		this.storageHandler = storageHandler;
	}

	/**
	 * @param populatingPolicy the populatingPolicy to set
	 */
	public void setPopulatingPolicy(CRAPopulatingPolicy populatingPolicy) {
		this.populatingPolicy = populatingPolicy;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.sc.crator.StartUp#startup()
	 */
	public void startup() {
		CRAtor crator = loadCRAtor();
		List<CRA> craToFillIn = reportingScheduler.craToFillIn(crator);
		for (CRA cra : craToFillIn) {
			populatingPolicy.populateCRA(cra);
			storageHandler.writeCRA(cra);			
		}
		
	}
	
	private CRAtor loadCRAtor() {
		return CratorFactory.eINSTANCE.createCRAtor();
	}
	
}
