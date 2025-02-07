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

package com.nbp.osi.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.stages.services.exception.NoSuchOsiInspectionException;
import com.nbp.osi.stages.services.model.OsiInspection;
import com.nbp.osi.stages.services.service.base.OsiInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.stages.services.model.OsiInspection",
	service = AopService.class
)
public class OsiInspectionLocalServiceImpl
	extends OsiInspectionLocalServiceBaseImpl {
	public OsiInspection getOsiInspectionBY_CI(String caseId) throws NoSuchOsiInspectionException   {
		return osiInspectionPersistence.findBygetOsiInspectionBy_CI(caseId);
		}
	public OsiInspection updateManuInspection(String caseId,Date dateOfInspection ) {
		OsiInspection inspection=null;
		try {
			inspection=osiInspectionPersistence.findBygetOsiInspectionBy_CI(caseId);
		} catch (Exception e) {
		}
		
		if(Validator.isNotNull(inspection)) {
			inspection.setDateOfInspection(dateOfInspection);
			osiInspectionPersistence.update(inspection);
		}else{
			inspection=osiInspectionPersistence.create(CounterLocalServiceUtil.increment());
			inspection.setCaseId(caseId);
			inspection.setDateOfInspection(dateOfInspection);
			osiInspectionPersistence.update(inspection);
		}
		return inspection;
		}
	public List<OsiInspection> getOSIInspections(long osiApplicationId){
		return osiInspectionPersistence.findBygetOSI_OAI(osiApplicationId);
	}
	public List<OsiInspection> getOSIInspectionsByCaseId(String caseId){
		return osiInspectionPersistence.findBygetOSI_CaseId(caseId);
	}
	public List<OsiInspection> getOSIInspectionsByStatusCaseId(String caseId,String status){
		return osiInspectionPersistence.findBygetOSI_CaseIdStatus(status, caseId);
	}
	public List<OsiInspection> getOSIInspectionsByStatusApplicationId(long osiApplicationId,String status){
		return osiInspectionPersistence.findBygetOSI_CaseIdApplicationId(status, osiApplicationId);
	}
	public OsiInspection getInspectionByStatus_SlotBoooked(String status,long slotBookedByUser,long osiApplicationId) throws NoSuchOsiInspectionException {
		return osiInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, osiApplicationId);
		
	}
}
