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

package com.nbp.farm.application.stages.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.farm.application.stages.service.exception.NoSuchFarmInspectionException;
import com.nbp.farm.application.stages.service.model.FarmInspection;
import com.nbp.farm.application.stages.service.service.base.FarmInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.stages.service.model.FarmInspection",
	service = AopService.class
)
public class FarmInspectionLocalServiceImpl
	extends FarmInspectionLocalServiceBaseImpl {
	public List<FarmInspection> getFarmInspections(long farmApplicationId){
		return farmInspectionPersistence.findBygetFI_FAI(farmApplicationId);
	}
	public List<FarmInspection> getFarmInspectionsByCaseId(String caseId){
		return farmInspectionPersistence.findBygetFI_CaseId(caseId);
	}
	
	public List<FarmInspection> getFarmInspectionsByStatusCaseId(String caseId,String status){
		return farmInspectionPersistence.findBygetFI_CaseIdStatus(status, caseId);
	}
	
	public List<FarmInspection> getFarmInspectionsByStatusApplicationId(long farmApplicationId,String status){
		return farmInspectionPersistence.findBygetFI_CaseIdApplicationId(status, farmApplicationId);
	}
	
	public FarmInspection getInspectionByStatus_SlotBoooked(String status,long slotBookedByUser,long farmApplicationId) throws NoSuchFarmInspectionException {
		return farmInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, farmApplicationId);
	}
}