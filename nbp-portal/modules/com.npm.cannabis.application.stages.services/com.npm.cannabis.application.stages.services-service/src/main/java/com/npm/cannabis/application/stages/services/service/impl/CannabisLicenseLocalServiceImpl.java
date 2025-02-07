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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;
import com.npm.cannabis.application.stages.services.model.CannabisLicense;
import com.npm.cannabis.application.stages.services.service.base.CannabisLicenseLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisLicense",
	service = AopService.class
)
public class CannabisLicenseLocalServiceImpl
	extends CannabisLicenseLocalServiceBaseImpl {
	
	public CannabisLicense updateCannabisLicenseInfo(String caseId,Date expirationDate,Date issueDate,String licenseCondtions,String nameOfBPMStep,String payentAmtDue,String licenseNumber) {
		CannabisLicense cannabisLicense =null;
		try {
			cannabisLicense =cannabisLicensePersistence.findBygetCL_CaseId(caseId);
		} catch (NoSuchCannabisLicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Validator.isNotNull(cannabisLicense)) {
			cannabisLicense.setExpirationDate(expirationDate);
			cannabisLicense.setIssueDate(issueDate);
			cannabisLicense.setListOfConditions(licenseCondtions);
			cannabisLicense.setNameOfBPMStep(nameOfBPMStep);
			cannabisLicense.setPayentAmtDue(payentAmtDue);
			cannabisLicense.setModifiedDate(new Date());
			cannabisLicense.setLicenseNumber(licenseNumber);
			cannabisLicensePersistence.update(cannabisLicense);
		}else {
			cannabisLicense = cannabisLicensePersistence.create(CounterLocalServiceUtil.increment(CannabisLicense.class.getName()));
			cannabisLicense.setExpirationDate(expirationDate);
			cannabisLicense.setIssueDate(issueDate);
			cannabisLicense.setListOfConditions(licenseCondtions);
			cannabisLicense.setNameOfBPMStep(nameOfBPMStep);
			cannabisLicense.setPayentAmtDue(payentAmtDue);
			cannabisLicense.setModifiedDate(new Date());
			cannabisLicense.setCaseId(caseId);
			cannabisLicense.setLicenseNumber(licenseNumber);
			cannabisLicensePersistence.update(cannabisLicense);
		}
		return cannabisLicense;
		
	}
	
	public CannabisLicense getCannabisLicenseByCaseId(String caseId) {
		return cannabisLicensePersistence.fetchBygetCL_CaseId(caseId);
	}
	public CannabisLicense getCannabisLicenseBy_LN(String licenseNumber) {
		return cannabisLicensePersistence.fetchBygetCL_LN(licenseNumber);
	}
}