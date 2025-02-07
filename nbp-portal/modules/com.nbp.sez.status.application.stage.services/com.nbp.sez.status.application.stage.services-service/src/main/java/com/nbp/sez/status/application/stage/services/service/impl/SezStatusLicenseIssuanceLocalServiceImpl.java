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

package com.nbp.sez.status.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusLicenseIssuanceException;
import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusLicenseIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance",
	service = AopService.class
)
public class SezStatusLicenseIssuanceLocalServiceImpl
	extends SezStatusLicenseIssuanceLocalServiceBaseImpl {
	public SezStatusLicenseIssuance getSezStatus_License_Issuance_By_Id(String caseId) throws NoSuchSezStatusLicenseIssuanceException {
		return sezStatusLicenseIssuancePersistence.findBygetSezStatus_License_Issuance_By_CI(caseId);
	}
	public SezStatusLicenseIssuance updateSezStatus_License_Issuance(String caseId,Date dateOfLicenseIssued,Date dateOfLicenseExpiration,long licenceFileEntryId) {
		SezStatusLicenseIssuance  issuance=null;
		try {
			issuance=sezStatusLicenseIssuancePersistence.findBygetSezStatus_License_Issuance_By_CI(caseId);
		} catch (Exception e) {
		}
		if (issuance==null) {
			issuance=sezStatusLicenseIssuancePersistence.create(CounterLocalServiceUtil.increment());
		}
		issuance.setCaseId(caseId);
		issuance.setDateOfLicenseExpiration(dateOfLicenseExpiration);
		issuance.setDateOfLicIssuance(dateOfLicenseIssued);
		issuance.setDocLicFileEntryId(licenceFileEntryId);
		sezStatusLicenseIssuancePersistence.update(issuance);
		return issuance;
		
		
	}
	public SezStatusLicenseIssuance updateSezStatus_License_Issuance_(String caseId,String nameOfApplicant,String licenseNumber,String sezStatus,Date dateOfLicenseIssued,Date dateOfLicenseExpiration,long licenceFileEntryId) {
		SezStatusLicenseIssuance  issuance=null;
		try {
			issuance=sezStatusLicenseIssuancePersistence.findBygetSezStatus_License_Issuance_By_CI(caseId);
		} catch (Exception e) {
		}
		if (issuance==null) {
			issuance=sezStatusLicenseIssuancePersistence.create(CounterLocalServiceUtil.increment());
		}
		issuance.setCaseId(caseId);
		issuance.setLicenceNumber(licenseNumber);
		issuance.setNameOfApplicant(nameOfApplicant);
		issuance.setSezStatus(sezStatus);
		issuance.setDateOfLicenseExpiration(dateOfLicenseExpiration);
		issuance.setDateOfLicIssuance(dateOfLicenseIssued);
		issuance.setDocLicFileEntryId(licenceFileEntryId);
		sezStatusLicenseIssuancePersistence.update(issuance);
		return issuance;
		
		
	}
	public SezStatusLicenseIssuance updateSezStatus_License_(String caseId,String nameOfApplicant,String licenseNumber,String sezStatus,Date dateOfLicenseIssued,Date dateOfLicenseExpiration,long licenceFileEntryId,String sezDeveloperNumber) {
		SezStatusLicenseIssuance  issuance=null;
		try {
			issuance=sezStatusLicenseIssuancePersistence.findBygetSezStatus_License_Issuance_By_CI(caseId);
		} catch (Exception e) {
		}
		if (issuance==null) {
			issuance=sezStatusLicenseIssuancePersistence.create(CounterLocalServiceUtil.increment());
		}
		issuance.setCaseId(caseId);
		issuance.setLicenceNumber(licenseNumber);
		issuance.setNameOfApplicant(nameOfApplicant);
		issuance.setSezStatus(sezStatus);
		issuance.setDateOfLicenseExpiration(dateOfLicenseExpiration);
		issuance.setDateOfLicIssuance(dateOfLicenseIssued);
		issuance.setDocLicFileEntryId(licenceFileEntryId);
		issuance.setSezDeveloperNumber(sezDeveloperNumber);
		sezStatusLicenseIssuancePersistence.update(issuance);
		return issuance;
		
		
	}
}