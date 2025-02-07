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

package com.nbp.medical.stages.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.medical.stages.service.exception.NoSuchMedicalFacilitiesInspectionException;
import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;
import com.nbp.medical.stages.service.service.base.MedicalFacilitiesInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.medical.stages.service.model.MedicalFacilitiesInspection",
	service = AopService.class
)
public class MedicalFacilitiesInspectionLocalServiceImpl
	extends MedicalFacilitiesInspectionLocalServiceBaseImpl {
	public MedicalFacilitiesInspection getMedicalFacilitiesInspectionBy_CI(String caseId) throws NoSuchMedicalFacilitiesInspectionException {
		return medicalFacilitiesInspectionPersistence.findBygetMedicalInspectionBy_CI(caseId);
	}
	public List<MedicalFacilitiesInspection>  getMed_FBAI(long medicalApplicationId){
		return medicalFacilitiesInspectionPersistence.findBygetMed_FBAI(medicalApplicationId);
	}
	public List<MedicalFacilitiesInspection> getMed_CaseId(String caseId){
		return medicalFacilitiesInspectionPersistence.findBygetMed_CaseId(caseId);
	}
	public List<MedicalFacilitiesInspection> getMed_Status(String status){
		return medicalFacilitiesInspectionPersistence.findBygetMed_Status(status);
	}
	public List<MedicalFacilitiesInspection> getMed_CaseIdStatus(String caseId,String status){
		return medicalFacilitiesInspectionPersistence.findBygetMed_CaseIdStatus(status, caseId);
	}
	public List<MedicalFacilitiesInspection> getMed_CaseIdApplicationId(String status,long medicalApplicationId){
		return medicalFacilitiesInspectionPersistence.findBygetMed_CaseIdApplicationId(status, medicalApplicationId);
	}
	
	public MedicalFacilitiesInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status,long slotBookedByUser,long medicalApplicationId) throws NoSuchMedicalFacilitiesInspectionException {
		return medicalFacilitiesInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, medicalApplicationId);
	}
	
	public List<MedicalFacilitiesInspection> getMed_StatusApplicationId(String status,long medicalApplicationId){
		return medicalFacilitiesInspectionPersistence.findBygetMed_CaseIdApplicationId(status, medicalApplicationId);
	}
}