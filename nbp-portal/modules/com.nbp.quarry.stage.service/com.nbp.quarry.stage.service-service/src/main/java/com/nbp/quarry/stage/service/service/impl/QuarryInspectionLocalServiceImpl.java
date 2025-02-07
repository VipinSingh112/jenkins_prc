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

package com.nbp.quarry.stage.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.quarry.stage.service.exception.NoSuchQuarryInspectionException;
import com.nbp.quarry.stage.service.model.QuarryInspection;
import com.nbp.quarry.stage.service.service.base.QuarryInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.quarry.stage.service.model.QuarryInspection",
	service = AopService.class
)
public class QuarryInspectionLocalServiceImpl
	extends QuarryInspectionLocalServiceBaseImpl {
	public QuarryInspection getQuarryInspectionBy_CI(String caseId) throws NoSuchQuarryInspectionException {
		return quarryInspectionPersistence.findBygetQuarryInspectionBy_CI(caseId);
	}
	public List<QuarryInspection>  getQuarry_FBAI(long quarryApplicationId){
		return quarryInspectionPersistence.findBygetQuarry_FBAI(quarryApplicationId);
	}
	public List<QuarryInspection> getQuarry_CaseId(String caseId){
		return quarryInspectionPersistence.findBygetQuarry_CaseId(caseId);
	}
	public List<QuarryInspection> getQuarry_Status(String status){
		return quarryInspectionPersistence.findBygetQuarry_Status(status);
	}
	public List<QuarryInspection> getQuarry_CaseIdStatus(String caseId,String status){
		return quarryInspectionPersistence.findBygetQuarry_CaseIdStatus(status, caseId);
	}
	public List<QuarryInspection> getQuarry_CaseIdApplicationId(String status,long quarryApplicationId){
		return quarryInspectionPersistence.findBygetQuarry_CaseIdApplicationId(status, quarryApplicationId);
	}
	
	public QuarryInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status,long slotBookedByUser,long quarryApplicationId) throws NoSuchQuarryInspectionException {
		return quarryInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, quarryApplicationId);
	}
	
	public List<QuarryInspection> getQuarry_StatusApplicationId(String status,long quarryApplicationId){
		return quarryInspectionPersistence.findBygetQuarry_CaseIdApplicationId(status, quarryApplicationId);
	}
 
}