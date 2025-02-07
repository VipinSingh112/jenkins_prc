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
import com.nbp.film.stages.services.exception.NoSuchFilmFullRegistrationException;
import com.nbp.film.stages.services.model.FilmFullRegistration;
import com.nbp.film.stages.services.service.FilmFullRegistrationLocalServiceUtil;
import com.nbp.film.stages.services.service.base.FilmFullRegistrationLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.film.stages.services.model.FilmFullRegistration", service = AopService.class)
public class FilmFullRegistrationLocalServiceImpl extends FilmFullRegistrationLocalServiceBaseImpl {
	public FilmFullRegistration getPharmaFullLIcense(String caseId) throws NoSuchFilmFullRegistrationException {
		return filmFullRegistrationPersistence.findBygetFilmFullRegistrationBy_CI(caseId);
	}
	public FilmFullRegistration getPharmaFullLIcense_By_RN(String registrationNUmber) throws NoSuchFilmFullRegistrationException {
		return filmFullRegistrationPersistence.findBygetFilmFullRegistrationBy_RN(registrationNUmber);
	}

	public FilmFullRegistration updateFilmFullRegistration(String caseId, String duration, String nameofapplicant,
			String productionType, String registrationNumber, Date dateofRegistrationPermit, String productionTitle,
			Date productionDateFrom, Date productionDateTo, String termsAndConditions) {

		FilmFullRegistration filmFullRegistration = null;
		try {
			filmFullRegistration = getPharmaFullLIcense(caseId);
		} catch (NoSuchFilmFullRegistrationException e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(filmFullRegistration)) {
			filmFullRegistration.setNameOfApplicant(nameofapplicant);
			filmFullRegistration.setProductionType(productionType);
			filmFullRegistration.setDuration(duration);
			filmFullRegistration.setRegistrationNumber(registrationNumber);
			filmFullRegistration.setDateOfIssued(dateofRegistrationPermit);
			filmFullRegistration.setProductionTitle(productionTitle);
			filmFullRegistration.setProductionDateFrom(productionDateFrom);
			filmFullRegistration.setProductionDateTo(productionDateTo);
			filmFullRegistration.setTermsAndConditions(termsAndConditions);
			FilmFullRegistrationLocalServiceUtil.updateFilmFullRegistration(filmFullRegistration);
		} else {
			try {
				filmFullRegistration=createFilmFullRegistration(CounterLocalServiceUtil.increment());
			filmFullRegistration.setNameOfApplicant(nameofapplicant);
			filmFullRegistration.setProductionType(productionType);
			filmFullRegistration.setDuration(duration);
			filmFullRegistration.setCaseId(caseId);
			filmFullRegistration.setRegistrationNumber(registrationNumber);
			filmFullRegistration.setDateOfIssued(dateofRegistrationPermit);
			filmFullRegistration.setProductionTitle(productionTitle);
			filmFullRegistration.setProductionDateFrom(productionDateFrom);
			filmFullRegistration.setProductionDateTo(productionDateTo);
			filmFullRegistration.setTermsAndConditions(termsAndConditions);
			FilmFullRegistrationLocalServiceUtil.updateFilmFullRegistration(filmFullRegistration);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return filmFullRegistration;

	}

	@Override
	public FilmFullRegistration updateFilmFullRegistration(String caseId, String nameofapplicant, String productionType,
			String registrationNumber, Date dateofRegistrationPermit, String productionTitle, Date productionDateFrom,
			Date productionDateTo, String termsAndConditions) {
		// TODO Auto-generated method stub
		return null;
	}
}