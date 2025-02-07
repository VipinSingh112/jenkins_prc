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

package com.nbp.medical.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.medical.stages.service.exception.NoSuchMedicalCertificateIssuanceException;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;
import com.nbp.medical.stages.service.service.base.MedicalCertificateIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.medical.stages.service.model.MedicalCertificateIssuance",
	service = AopService.class
)
public class MedicalCertificateIssuanceLocalServiceImpl
	extends MedicalCertificateIssuanceLocalServiceBaseImpl {
	public MedicalCertificateIssuance getCertificateIssuance(String caseId) throws NoSuchMedicalCertificateIssuanceException {
		return medicalCertificateIssuancePersistence.findBygetMedical_Issuance_By_CI(caseId);
	}
	public MedicalCertificateIssuance updateMedicalCertificateIssuance(String caseId, String status, String issuanceCertificate, String medicalCategory,Date dateOfCertificateIssuance,Date dateOfCertificateExpiration,long licenceFileEntryId) {
		MedicalCertificateIssuance  issuance=null;
		try {
			issuance=medicalCertificateIssuancePersistence.findBygetMedical_Issuance_By_CI(caseId);
		} catch (Exception e) {
		}
		if (issuance==null) {
			issuance=medicalCertificateIssuancePersistence.create(CounterLocalServiceUtil.increment());
		}
		issuance.setCaseId(caseId);
		issuance.setStatus(status);
		issuance.setLicenceNumber(issuanceCertificate);
		issuance.setMedicalCategory(medicalCategory);
		issuance.setDateOfLicIssuance(dateOfCertificateIssuance);
		issuance.setDateOfLicenseExpiration(dateOfCertificateExpiration);
		issuance.setDocLicFileEntryId(licenceFileEntryId);
		medicalCertificateIssuancePersistence.update(issuance);
		return issuance;
		
		
	}
}