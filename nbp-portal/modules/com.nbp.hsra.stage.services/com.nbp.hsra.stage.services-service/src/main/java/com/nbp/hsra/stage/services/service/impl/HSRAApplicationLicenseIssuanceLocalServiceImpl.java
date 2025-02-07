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

package com.nbp.hsra.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.stage.services.exception.NoSuchHSRAApplicationLicenseIssuanceException;
import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;
import com.nbp.hsra.stage.services.service.base.HSRAApplicationLicenseIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance",
	service = AopService.class
)
public class HSRAApplicationLicenseIssuanceLocalServiceImpl
	extends HSRAApplicationLicenseIssuanceLocalServiceBaseImpl {
	public HSRAApplicationLicenseIssuance getHSRAApplicationLicenseIssuanceByCI(String caseId) throws NoSuchHSRAApplicationLicenseIssuanceException {
		return hsraApplicationLicenseIssuancePersistence.findBygetHSRA_lic_iss_By_CI(caseId);
		
	}
	public HSRAApplicationLicenseIssuance updateHSRAApplicationLicenseIssuance(String caseId, 
			String licenseNumber,
			Date dateOfIssue,
			Date expiryDate,
			String receiptNumber, 
			String status ) {
		
		HSRAApplicationLicenseIssuance HSRAApplicationLicenseIssuance=null;
		try {
			HSRAApplicationLicenseIssuance=getHSRAApplicationLicenseIssuanceByCI(caseId);
		} catch (NoSuchHSRAApplicationLicenseIssuanceException e) {
		}
		if(Validator.isNotNull(HSRAApplicationLicenseIssuance)) {
			HSRAApplicationLicenseIssuance.setStatus(status);
			HSRAApplicationLicenseIssuance.setReceiptNumber(receiptNumber);
			HSRAApplicationLicenseIssuance.setDateOfExpiry(expiryDate);
			HSRAApplicationLicenseIssuance.setLicenseNumber(licenseNumber);
			HSRAApplicationLicenseIssuance.setDateOfIssue(dateOfIssue);
			hsraApplicationLicenseIssuancePersistence.update(HSRAApplicationLicenseIssuance);
			
		}else {
			HSRAApplicationLicenseIssuance=createHSRAApplicationLicenseIssuance(CounterLocalServiceUtil.increment());
			HSRAApplicationLicenseIssuance.setCaseId(caseId);
			HSRAApplicationLicenseIssuance.setReceiptNumber(receiptNumber);
			HSRAApplicationLicenseIssuance.setDateOfExpiry(expiryDate);
			HSRAApplicationLicenseIssuance.setLicenseNumber(licenseNumber);
			HSRAApplicationLicenseIssuance.setDateOfIssue(dateOfIssue);
			hsraApplicationLicenseIssuancePersistence.update(HSRAApplicationLicenseIssuance);
		}
		return HSRAApplicationLicenseIssuance;
	}
	@Override
	public HSRAApplicationLicenseIssuance updateHSRAApplicationLicenseIssuance(String caseId, String licenseNumber,
			Date dateOfIssue, String feePaid, String receiptNumber, Date dueDate, String leadTime) {
		// TODO Auto-generated method stub
		return null;
	}
}