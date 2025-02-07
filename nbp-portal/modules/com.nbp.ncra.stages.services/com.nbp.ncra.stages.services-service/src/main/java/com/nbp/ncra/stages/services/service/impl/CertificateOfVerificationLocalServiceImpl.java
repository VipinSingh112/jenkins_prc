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

package com.nbp.ncra.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncra.stages.services.exception.NoSuchCertificateOfVerificationException;
import com.nbp.ncra.stages.services.model.CertificateOfVerification;
import com.nbp.ncra.stages.services.service.CertificateOfVerificationLocalServiceUtil;
import com.nbp.ncra.stages.services.service.base.CertificateOfVerificationLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncra.stages.services.model.CertificateOfVerification",
	service = AopService.class
)
public class CertificateOfVerificationLocalServiceImpl
	extends CertificateOfVerificationLocalServiceBaseImpl { 
	public CertificateOfVerification getNcra_By_CaseId(String caseId) throws NoSuchCertificateOfVerificationException {
		return certificateOfVerificationPersistence.findBygetNcra_By_CaseId(caseId);
	}

	public CertificateOfVerification updateNcraCertificateOfVerification(String caseId, String nameOfApplicant,String productName,
			Date dateCertificateIssued, Date dateOfExpiration,String certificateNumber) {
		CertificateOfVerification certificateOfVerification = null;
		try {
			certificateOfVerification = CertificateOfVerificationLocalServiceUtil.getNcra_By_CaseId(caseId);
			System.out.println("certificateOfVerification in stage service--------------"+certificateOfVerification);
		} catch (NoSuchCertificateOfVerificationException e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(certificateOfVerification)) {
			System.out.println("enter in if condition--------------");
			certificateOfVerification.setCaseId(caseId);
			certificateOfVerification.setNameOfApplicant(nameOfApplicant);
			certificateOfVerification.setProductName(productName);
			certificateOfVerification.setDateCertificateIssued(dateCertificateIssued);
			certificateOfVerification.setDateOfExpiration(dateOfExpiration);
			certificateOfVerification.setCertificateNumber(certificateNumber);
			certificateOfVerificationPersistence.update(certificateOfVerification);
			System.out.println("enter in if condition after update --------------");
		} else {
			System.out.println("enter in else condition--------------");
			certificateOfVerification = certificateOfVerificationPersistence.create(CounterLocalServiceUtil.increment());
			certificateOfVerification.setCaseId(caseId);
			certificateOfVerification.setNameOfApplicant(nameOfApplicant);
			certificateOfVerification.setProductName(productName);
			certificateOfVerification.setDateCertificateIssued(dateCertificateIssued);
			certificateOfVerification.setDateOfExpiration(dateOfExpiration);
			certificateOfVerification.setCertificateNumber(certificateNumber);
			certificateOfVerificationPersistence.update(certificateOfVerification);
			System.out.println("enter in else  condition after update --------------");
		}
		return certificateOfVerification;
	}
}