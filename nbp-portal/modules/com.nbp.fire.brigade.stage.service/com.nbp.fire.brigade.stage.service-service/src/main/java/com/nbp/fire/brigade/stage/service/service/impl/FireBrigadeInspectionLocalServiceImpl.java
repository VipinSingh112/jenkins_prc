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

package com.nbp.fire.brigade.stage.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeInspectionException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;
import com.nbp.fire.brigade.stage.service.service.base.FireBrigadeInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection",
	service = AopService.class
)
public class FireBrigadeInspectionLocalServiceImpl
	extends FireBrigadeInspectionLocalServiceBaseImpl {
	public FireBrigadeInspection getFireBrigadeInspectionBy_CI(String caseId) throws NoSuchFireBrigadeInspectionException {
		return fireBrigadeInspectionPersistence.findBygetFireBrigadeInspectionBy_CI(caseId);
	}
	public List<FireBrigadeInspection>  getFBI_FBAI(long fireBrigadeApplicationId){
		return fireBrigadeInspectionPersistence.findBygetFBI_FBAI(fireBrigadeApplicationId);
	}
	public List<FireBrigadeInspection> getFBI_CaseId(String caseId){
		return fireBrigadeInspectionPersistence.findBygetFBI_CaseId(caseId);
	}
	public List<FireBrigadeInspection> getFBI_Status(String status){
		return fireBrigadeInspectionPersistence.findBygetFBI_Status(status);
	}
	public List<FireBrigadeInspection> getFBI_CaseIdStatus(String caseId,String status){
		return fireBrigadeInspectionPersistence.findBygetFBI_CaseIdStatus(status, caseId);
	}
	public List<FireBrigadeInspection> getFBI_CaseIdApplicationId(String status,long fireBrigadeApplicationId){
		return fireBrigadeInspectionPersistence.findBygetFBI_CaseIdApplicationId(status, fireBrigadeApplicationId);
	}
	
	public FireBrigadeInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status,long slotBookedByUser,long fireBrigadeApplicationId) throws NoSuchFireBrigadeInspectionException {
		return fireBrigadeInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, fireBrigadeApplicationId);
	}
	
	public List<FireBrigadeInspection> getFBI_StatusApplicationId(String status,long fireBrigadeApplicationId){
		return fireBrigadeInspectionPersistence.findBygetFBI_CaseIdApplicationId(status, fireBrigadeApplicationId);
	}
 
}