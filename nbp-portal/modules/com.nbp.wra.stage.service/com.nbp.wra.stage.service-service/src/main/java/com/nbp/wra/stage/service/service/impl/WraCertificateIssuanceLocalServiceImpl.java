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

package com.nbp.wra.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.wra.stage.service.exception.NoSuchWraCertificateIssuanceException;
import com.nbp.wra.stage.service.model.WraCertificateIssuance;
import com.nbp.wra.stage.service.service.base.WraCertificateIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.stage.service.model.WraCertificateIssuance",
	service = AopService.class
)
public class WraCertificateIssuanceLocalServiceImpl
	extends WraCertificateIssuanceLocalServiceBaseImpl {
	
	public WraCertificateIssuance getCertificateIssuance(String caseId) throws NoSuchWraCertificateIssuanceException {
		return wraCertificateIssuancePersistence.findBygetWra_Issuance_By_CI(caseId);
	}
	public WraCertificateIssuance updateWraCertificateIssuance(String caseId, String status, String issuanceCertificate, String Category,Date dateOfCertificateIssuance,Date dateOfCertificateExpiration,long licenceFileEntryId) {
		WraCertificateIssuance  issuance=null;
		try {
			issuance=wraCertificateIssuancePersistence.findBygetWra_Issuance_By_CI(caseId);
		} catch (Exception e) {
		}
		if (issuance==null) {
			issuance=wraCertificateIssuancePersistence.create(CounterLocalServiceUtil.increment());
		}
		issuance.setCaseId(caseId);
		issuance.setStatus(status);
		issuance.setLicenceNumber(issuanceCertificate);
		issuance.setCategory(Category);
		issuance.setDateOfLicIssuance(dateOfCertificateIssuance);
		issuance.setDateOfLicenseExpiration(dateOfCertificateExpiration);
		issuance.setDocLicFileEntryId(licenceFileEntryId);
		wraCertificateIssuancePersistence.update(issuance);
		return issuance;
		
		
	}
}