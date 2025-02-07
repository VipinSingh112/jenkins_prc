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

package com.nbp.ncra.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.ncra.stages.services.exception.NoSuchNcraInspectionException;
import com.nbp.ncra.stages.services.model.NcraInspection;
import com.nbp.ncra.stages.services.service.base.NcraInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncra.stages.services.model.NcraInspection",
	service = AopService.class
)
public class NcraInspectionLocalServiceImpl
	extends NcraInspectionLocalServiceBaseImpl {
	public NcraInspection getNcraInspectionBy_CI(String caseId) throws NoSuchNcraInspectionException{
		return ncraInspectionPersistence.findBygetNcraInspectionBy_CI(caseId);
	}
	public List<NcraInspection>  getNcra_AI(long ncraApplicationId){
		return ncraInspectionPersistence.findBygetNcra_AI(ncraApplicationId);
	}
	public List<NcraInspection> getNcra_By_CaseId(String caseId){
		return ncraInspectionPersistence.findBygetNcra_by_CaseId(caseId);
	}
	public List<NcraInspection> getNcra_By_Status(String status){
		return ncraInspectionPersistence.findBygetHsra_Status(status);
	}
	public List<NcraInspection> getNcra_CaseIdStatus(String caseId,String status){
		return ncraInspectionPersistence.findBygetNcra_CaseIdStatus(status, caseId);
	}
	public List<NcraInspection> getNcra_CaseIdApplicationId(String status,long ncraApplicationId){
		return ncraInspectionPersistence.findBygetNcra_CaseIdApplicationId(status, ncraApplicationId);
	}
	
	public NcraInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status,long slotBookedByUser,long ncraApplicationId) throws NoSuchNcraInspectionException {
		return ncraInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, ncraApplicationId);
	}
	
	public List<NcraInspection> getNcra_StatusApplicationId(String status,long ncraApplicationId){
		return ncraInspectionPersistence.findBygetNcra_CaseIdApplicationId(status, ncraApplicationId);
	}
}