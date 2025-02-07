/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.film.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.film.stages.services.model.FilmApplicationRegister;
import com.nbp.film.stages.services.service.FilmApplicationRegisterLocalServiceUtil;
import com.nbp.film.stages.services.service.base.FilmApplicationRegisterLocalServiceBaseImpl;

import java.sql.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.film.stages.services.model.FilmApplicationRegister", service = AopService.class)
public class FilmApplicationRegisterLocalServiceImpl extends FilmApplicationRegisterLocalServiceBaseImpl {
	public FilmApplicationRegister getApplicationRegisterBy_CI(String caseId) {
		return filmApplicationRegisterPersistence.fetchBygetFilmByCI(caseId);
	}

	public FilmApplicationRegister updateFilmApplicationRegister(String caseId, String nameOfApplicant,
			Date registrationDate, String filmRegistrationNumber, String titleOfProductionOrProject,
			Date dateOfRegistrationPermitIssued, String productionCompany, String technicalFormatOfProduction,
			String OriginOfProductionCompany, String permitsRequired, String shootLocationInJamaica,
			Date preProductionDate, Date productionStartDate, String proposedDateOfArrival, String portOfEntry,
			Date proposedDateOfDeparture, String fullProductionBudget, String expectedBudgetSpendInJA,
			String numberOFForeignCrewHired, String numberJamaicaCrewHired, String valueOfBondWaiver,
			String customsBroker, String localProductionManagerOrFixer) {

		FilmApplicationRegister filmApplicationRegister = null;
		try {
			filmApplicationRegister = getApplicationRegisterBy_CI(caseId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(filmApplicationRegister)) {
			filmApplicationRegister.setNameOfApplicant(nameOfApplicant);
			filmApplicationRegister.setRegistrationDate(registrationDate);
			filmApplicationRegister.setFilmRegistrationNum(filmRegistrationNumber);
			filmApplicationRegister.setTitleOfProduction(titleOfProductionOrProject);
			filmApplicationRegister.setDateOfIssued(dateOfRegistrationPermitIssued);
			filmApplicationRegister.setProductionCompany(productionCompany);
			filmApplicationRegister.setTechnicalFormOfProd(technicalFormatOfProduction);
			filmApplicationRegister.setOriginOfProdCom(OriginOfProductionCompany);
			filmApplicationRegister.setPermitsRequired(permitsRequired);
			filmApplicationRegister.setShootLocationInJamaica(shootLocationInJamaica);
			filmApplicationRegister.setPreProductionDate(preProductionDate);
			filmApplicationRegister.setProductionStartDate(productionStartDate);
			filmApplicationRegister.setProposedDateOfArrival(proposedDateOfArrival);
			filmApplicationRegister.setPortOfEntry(portOfEntry);
			filmApplicationRegister.setProposedDateOfDeparture(proposedDateOfDeparture);
			filmApplicationRegister.setFullProductionBudget(fullProductionBudget);
			filmApplicationRegister.setExpectedBudgetSpendInJA(expectedBudgetSpendInJA);
			filmApplicationRegister.setNumberOFForeignCrewHired(numberOFForeignCrewHired);
			filmApplicationRegister.setNumberJamaicaCrewHired(numberJamaicaCrewHired);
			filmApplicationRegister.setValueOfBondWaiver(valueOfBondWaiver);
			filmApplicationRegister.setCustomsBroker(customsBroker);
			filmApplicationRegister.setLocalProductionManagerOrFixer(localProductionManagerOrFixer);
			FilmApplicationRegisterLocalServiceUtil.updateFilmApplicationRegister(filmApplicationRegister);
		} else {
			try {
				filmApplicationRegister = createFilmApplicationRegister(CounterLocalServiceUtil.increment());
				filmApplicationRegister.setCaseId(caseId);
				filmApplicationRegister.setNameOfApplicant(nameOfApplicant);
				filmApplicationRegister.setRegistrationDate(registrationDate);
				filmApplicationRegister.setFilmRegistrationNum(filmRegistrationNumber);
				filmApplicationRegister.setTitleOfProduction(titleOfProductionOrProject);
				filmApplicationRegister.setDateOfIssued(dateOfRegistrationPermitIssued);
				filmApplicationRegister.setProductionCompany(productionCompany);
				filmApplicationRegister.setTechnicalFormOfProd(technicalFormatOfProduction);
				filmApplicationRegister.setOriginOfProdCom(OriginOfProductionCompany);
				filmApplicationRegister.setPermitsRequired(permitsRequired);
				filmApplicationRegister.setShootLocationInJamaica(shootLocationInJamaica);
				filmApplicationRegister.setPreProductionDate(preProductionDate);
				filmApplicationRegister.setProductionStartDate(productionStartDate);
				filmApplicationRegister.setProposedDateOfArrival(proposedDateOfArrival);
				filmApplicationRegister.setPortOfEntry(portOfEntry);
				filmApplicationRegister.setProposedDateOfDeparture(proposedDateOfDeparture);
				filmApplicationRegister.setFullProductionBudget(fullProductionBudget);
				filmApplicationRegister.setExpectedBudgetSpendInJA(expectedBudgetSpendInJA);
				filmApplicationRegister.setNumberOFForeignCrewHired(numberOFForeignCrewHired);
				filmApplicationRegister.setNumberJamaicaCrewHired(numberJamaicaCrewHired);
				filmApplicationRegister.setValueOfBondWaiver(valueOfBondWaiver);
				filmApplicationRegister.setCustomsBroker(customsBroker);
				filmApplicationRegister.setLocalProductionManagerOrFixer(localProductionManagerOrFixer);
				FilmApplicationRegisterLocalServiceUtil.updateFilmApplicationRegister(filmApplicationRegister);
			} catch (Exception e) {
			}
		}
		return filmApplicationRegister;
	}
}