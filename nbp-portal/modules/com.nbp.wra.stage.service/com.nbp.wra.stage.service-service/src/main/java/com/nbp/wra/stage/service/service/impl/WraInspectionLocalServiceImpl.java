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

package com.nbp.wra.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.wra.stage.service.exception.NoSuchWraInspectionException;
import com.nbp.wra.stage.service.model.WraInspection;
import com.nbp.wra.stage.service.service.base.WraInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.stage.service.model.WraInspection",
	service = AopService.class
)
public class WraInspectionLocalServiceImpl
	extends WraInspectionLocalServiceBaseImpl {
	
	public WraInspection getWraInspectionBy_CI(String caseId) throws NoSuchWraInspectionException {
		return wraInspectionPersistence.findBygetWraInspectionBy_CI(caseId);
		}
	public WraInspection updateWraInspection(String caseId,Date dateOfInspection ) {
		 WraInspection inspection=null;
		try {
			inspection=getWraInspectionBy_CI(caseId);
		} catch (NoSuchWraInspectionException e) {
		}
		
		if(Validator.isNotNull(inspection)) {
			inspection.setDateOfInspection(dateOfInspection);
			wraInspectionPersistence.update(inspection);
		}else{
			inspection=createWraInspection(CounterLocalServiceUtil.increment());
			inspection.setCaseId(caseId);
			inspection.setDateOfInspection(dateOfInspection);
			wraInspectionPersistence.update(inspection);
		}
		return inspection;
		}
	
	public List<WraInspection> getWraById(long wraApplicationId){
		return wraInspectionPersistence.findBygetWraById(wraApplicationId);
	}
	public List<WraInspection> getWra_CaseId(String caseId){
		return wraInspectionPersistence.findBygetWra_CaseId(caseId);
	}
	public List<WraInspection> getWra_Status(String status){
		return wraInspectionPersistence.findBygetWra_Status(status);
	}
	public List<WraInspection> getWra_CI_Status(String caseId,String status){
		return wraInspectionPersistence.findBygetWra_CI_Status(status, caseId);
	}
	public List<WraInspection> getWra_CI_AppId(long wraApplicationId,String status){
		return wraInspectionPersistence.findBygetWra_CI_AppId(status, wraApplicationId);
	}
	public WraInspection getInspecByST_Slot_AppId(String status,long slotBookedByUser,long wraApplicationId) throws NoSuchWraInspectionException {
		return wraInspectionPersistence.findBygetInspecByST_Slot_AppId(status, slotBookedByUser, wraApplicationId);
		
	}
}