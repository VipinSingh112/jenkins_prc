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

package com.nbp.pharmaceutical.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationFullLicenseException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicenseTable;
import com.nbp.pharmaceutical.stages.services.service.PharmaApplicationFullLicenseLocalServiceUtil;
import com.nbp.pharmaceutical.stages.services.service.base.PharmaApplicationFullLicenseLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense",
	service = AopService.class
)
public class PharmaApplicationFullLicenseLocalServiceImpl
	extends PharmaApplicationFullLicenseLocalServiceBaseImpl {
	public PharmaApplicationFullLicense getPharmaFullLIcense(String caseId) throws NoSuchPharmaApplicationFullLicenseException {
		return pharmaApplicationFullLicensePersistence.findBygetPharmaFullLic_By_CI(caseId);
		}
	public PharmaApplicationFullLicense getPharmaFullLIcenseBY_LN(String licenseNumber) throws NoSuchPharmaApplicationFullLicenseException {
		return pharmaApplicationFullLicensePersistence.findBygetPharmaFullLic_By_LN(licenseNumber);
	}
	public List<String> getPharmaDistinctCaseIdList(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(PharmaApplicationFullLicenseTable.INSTANCE.caseId).from(PharmaApplicationFullLicenseTable.INSTANCE);
		return dslQuery(query);
	}
public PharmaApplicationFullLicense updatePharmaApplicationFullLicense(String caseId, 
		String licenseNumber,
		Date dateOfIssue,
		String feePaid,
		String receiptNumber, 
		Date dueDate,
		String leadTime ) {
	
	PharmaApplicationFullLicense pharmaApplicationFullLicense=null;
	try {
		pharmaApplicationFullLicense=PharmaApplicationFullLicenseLocalServiceUtil.getPharmaFullLIcense(caseId);
	} catch (NoSuchPharmaApplicationFullLicenseException e) {
	}
	if(Validator.isNotNull(pharmaApplicationFullLicense)) {
		pharmaApplicationFullLicense.setFeePaidAmount(feePaid);
		pharmaApplicationFullLicense.setReceiptNumber(receiptNumber);
		pharmaApplicationFullLicense.setLeadTime(leadTime);
		pharmaApplicationFullLicense.setLicenseNumber(licenseNumber);
		pharmaApplicationFullLicense.setDateOfIssue(dateOfIssue);
		pharmaApplicationFullLicensePersistence.update(pharmaApplicationFullLicense);
		
	}else {
		pharmaApplicationFullLicense=createPharmaApplicationFullLicense(CounterLocalServiceUtil.increment());
		pharmaApplicationFullLicense.setCaseId(caseId);
		pharmaApplicationFullLicense.setFeePaidAmount(feePaid);
		pharmaApplicationFullLicense.setReceiptNumber(receiptNumber);
		pharmaApplicationFullLicense.setLeadTime(leadTime);
		pharmaApplicationFullLicense.setLicenseNumber(licenseNumber);
		pharmaApplicationFullLicense.setDateOfIssue(dateOfIssue);
		pharmaApplicationFullLicensePersistence.update(pharmaApplicationFullLicense);
	}
	return pharmaApplicationFullLicense;
}
@Override
public List<PharmaApplicationFullLicense> getPharmaFullLIcenseByCI(String caseId)
		throws NoSuchPharmaApplicationFullLicenseException {
	return null;
}
}