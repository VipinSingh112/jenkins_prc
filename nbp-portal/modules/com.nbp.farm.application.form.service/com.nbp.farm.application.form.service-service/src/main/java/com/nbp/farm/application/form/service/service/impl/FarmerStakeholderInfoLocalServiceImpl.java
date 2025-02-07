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

package com.nbp.farm.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;
import com.nbp.farm.application.form.service.service.base.FarmerStakeholderInfoLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.form.service.model.FarmerStakeholderInfo",
	service = AopService.class
)
public class FarmerStakeholderInfoLocalServiceImpl
	extends FarmerStakeholderInfoLocalServiceBaseImpl {
	public FarmerStakeholderInfo getFarmerById(long ApplicationId) {
		return farmerStakeholderInfoPersistence.fetchBygetfarmerById(ApplicationId);}
public  List<FarmerStakeholderInfo> getFA_SH_FAI(long ApplicationId){
	return farmerStakeholderInfoPersistence.findBygetFA_SH_FAI(ApplicationId);}
	public FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(long ApplicationId) {
		return farmerStakeholderInfoPersistence.fetchBygetFA_FSH_by_AppId(ApplicationId);
		}
	
}
