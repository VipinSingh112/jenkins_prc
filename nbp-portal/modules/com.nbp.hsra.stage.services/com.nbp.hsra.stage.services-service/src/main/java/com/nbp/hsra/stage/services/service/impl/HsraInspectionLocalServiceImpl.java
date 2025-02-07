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

import com.liferay.portal.aop.AopService;
import com.nbp.hsra.stage.services.exception.NoSuchHsraInspectionException;
import com.nbp.hsra.stage.services.model.HsraInspection;
import com.nbp.hsra.stage.services.service.base.HsraInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.stage.services.model.HsraInspection",
	service = AopService.class
)
public class HsraInspectionLocalServiceImpl
	extends HsraInspectionLocalServiceBaseImpl {
	public HsraInspection getHsraInspectionBy_CI(String caseId) throws NoSuchHsraInspectionException  {
		return hsraInspectionPersistence.findBygetHsraInspectionBy_CI(caseId);
	}
	public List<HsraInspection>  getHsra_FBAI(long hsraApplicationId){
		return hsraInspectionPersistence.findBygetHsra_FBAI(hsraApplicationId);
	}
	public List<HsraInspection> getHsra_CaseId(String caseId){
		return hsraInspectionPersistence.findBygetHsra_CaseId(caseId);
	}
	public List<HsraInspection> getHsra_Status(String status){
		return hsraInspectionPersistence.findBygetHsra_Status(status);
	}
	public List<HsraInspection> getHsra_CaseIdStatus(String caseId,String status){
		return hsraInspectionPersistence.findBygetHsra_CaseIdStatus(status, caseId);
	}
	public List<HsraInspection> getHsra_CaseIdApplicationId(String status,long hsraApplicationId){
		return hsraInspectionPersistence.findBygetHsra_CaseIdApplicationId(status, hsraApplicationId);
	}
	
	public HsraInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status,long slotBookedByUser,long hsraApplicationId) throws NoSuchHsraInspectionException {
		return hsraInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, hsraApplicationId);
	}
	
	public List<HsraInspection> getHsra_StatusApplicationId(String status,long hsraApplicationId){
		return hsraInspectionPersistence.findBygetHsra_CaseIdApplicationId(status, hsraApplicationId);
	}
 
}