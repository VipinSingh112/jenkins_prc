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

package com.nbp.manufacturing.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuInspectionException;
import com.nbp.manufacturing.application.stages.services.model.ManuInspection;
import com.nbp.manufacturing.application.stages.services.service.base.ManuInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.manufacturing.application.stages.services.model.ManuInspection",
	service = AopService.class
)
public class ManuInspectionLocalServiceImpl
	extends ManuInspectionLocalServiceBaseImpl {
	public ManuInspection getManufacturingInspectionBY_CI(String caseId) throws NoSuchManuInspectionException {
		return manuInspectionPersistence.findBygetManuInspectionBy_CI(caseId);
		}
	public ManuInspection updateManuInspection(String caseId,Date dateOfInspection ) {
		ManuInspection inspection=null;
		try {
			inspection=getManufacturingInspectionBY_CI(caseId);
		} catch (NoSuchManuInspectionException e) {
		}
		
		if(Validator.isNotNull(inspection)) {
			inspection.setDateOfInspection(dateOfInspection);
			manuInspectionPersistence.update(inspection);
		}else{
			inspection=createManuInspection(CounterLocalServiceUtil.increment());
			inspection.setCaseId(caseId);
			inspection.setDateOfInspection(dateOfInspection);
			manuInspectionPersistence.update(inspection);
		}
		return inspection;
		}
	
	public List<ManuInspection> getManuInspections(long manufacturingApplicationId){
		return manuInspectionPersistence.findBygetMI_MAI(manufacturingApplicationId);
	}
	public List<ManuInspection> getManuInspectionsByCaseId(String caseId){
		return manuInspectionPersistence.findBygetMI_CaseId(caseId);
	}
	public List<ManuInspection> getManuInspectionsByStatusCaseId(String caseId,String status){
		return manuInspectionPersistence.findBygetMI_CaseIdStatus(status, caseId);
	}
	public List<ManuInspection> getManuInspectionsByStatusApplicationId(long manufacturingApplicationId,String status){
		return manuInspectionPersistence.findBygetMI_CaseIdApplicationId(status, manufacturingApplicationId);
	}
	public ManuInspection getInspectionByStatus_SlotBoooked(String status,long slotBookedByUser,long manufacturingApplicationId) throws NoSuchManuInspectionException {
		return manuInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, manufacturingApplicationId);
		
	}
}