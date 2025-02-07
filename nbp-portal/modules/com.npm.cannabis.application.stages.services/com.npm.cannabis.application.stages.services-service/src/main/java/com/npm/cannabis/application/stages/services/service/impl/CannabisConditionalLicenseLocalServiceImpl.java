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
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisConditionalLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;
import com.npm.cannabis.application.stages.services.service.base.CannabisConditionalLicenseLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense",
	service = AopService.class
)
public class CannabisConditionalLicenseLocalServiceImpl
	extends CannabisConditionalLicenseLocalServiceBaseImpl {
	
	public CannabisConditionalLicense updateCannabisConditionalLicense(String caseId,String numberOfextension,Date issueDate, Date expirationDate,String listOfPreConditions,long licenseFileId) {
		CannabisConditionalLicense cannabisConditionalLicense =null;
		try {
			cannabisConditionalLicense = cannabisConditionalLicensePersistence.findBygetCCL_CaseId(caseId);
		} catch (NoSuchCannabisConditionalLicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Validator.isNotNull(cannabisConditionalLicense)) {
			int numberOfTheExtension = cannabisConditionalLicense.getNumberOfTheExtension();
			cannabisConditionalLicense.setNumberOfTheExtension(numberOfTheExtension+1);
			cannabisConditionalLicense.setIssueDate(issueDate);
			cannabisConditionalLicense.setExpirationDate(expirationDate);
			cannabisConditionalLicense.setListOfPreconditions(listOfPreConditions);
			cannabisConditionalLicense.setConditionalLicenseFileId(licenseFileId);
			cannabisConditionalLicense.setCreateDate(new Date());
			cannabisConditionalLicensePersistence.update(cannabisConditionalLicense);
		}else {
			cannabisConditionalLicense = cannabisConditionalLicensePersistence.create(CounterLocalServiceUtil.increment(CannabisConditionalLicense.class.getName()));
			cannabisConditionalLicense.setCaseId(caseId);
			cannabisConditionalLicense.setNumberOfTheExtension(1);
			cannabisConditionalLicense.setIssueDate(issueDate);
			cannabisConditionalLicense.setExpirationDate(expirationDate);
			cannabisConditionalLicense.setListOfPreconditions(listOfPreConditions);
			cannabisConditionalLicense.setConditionalLicenseFileId(licenseFileId);
			cannabisConditionalLicense.setModifiedDate(new Date());
			cannabisConditionalLicensePersistence.update(cannabisConditionalLicense);
		}
		return cannabisConditionalLicense;
		
	}
	
	public CannabisConditionalLicense getCannabisConditionalLicenseByCaseId(String caseId) throws NoSuchCannabisConditionalLicenseException {
		return cannabisConditionalLicensePersistence.findBygetCCL_CaseId(caseId);
	}
  public List<CannabisConditionalLicense> getCCL_BycaseId(String caseId){
		return cannabisConditionalLicensePersistence.findBygetCCL_BycaseId(caseId);
	}
}