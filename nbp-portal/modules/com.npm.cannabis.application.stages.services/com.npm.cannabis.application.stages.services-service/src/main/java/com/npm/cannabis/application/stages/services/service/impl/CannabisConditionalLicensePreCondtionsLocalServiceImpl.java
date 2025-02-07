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

import com.liferay.portal.aop.AopService;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;
import com.npm.cannabis.application.stages.services.service.base.CannabisConditionalLicensePreCondtionsLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions",
	service = AopService.class
)
public class CannabisConditionalLicensePreCondtionsLocalServiceImpl
	extends CannabisConditionalLicensePreCondtionsLocalServiceBaseImpl {
	
	public List<CannabisConditionalLicensePreCondtions> getCannabisConditionalLicensePreCondtions(String caseId){
		return cannabisConditionalLicensePreCondtionsPersistence.findBygetCI_CaseId(caseId);
	}
	public void deleteCannabisConditionalLicensePreCondtions(String caseId){
		 cannabisConditionalLicensePreCondtionsPersistence.removeBygetCI_CaseId(caseId);
	}
}