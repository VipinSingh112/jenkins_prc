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

package com.nbp.ncbj.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.ncbj.stages.services.exception.NoSuchNcbjInspectionException;
import com.nbp.ncbj.stages.services.model.NcbjInspection;
import com.nbp.ncbj.stages.services.service.base.NcbjInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncbj.stages.services.model.NcbjInspection",
	service = AopService.class
)
public class NcbjInspectionLocalServiceImpl
	extends NcbjInspectionLocalServiceBaseImpl {
	
	public NcbjInspection getNcbjInspectionBy_CI(String caseId) throws NoSuchNcbjInspectionException {
		return ncbjInspectionPersistence.findBygetNcbjInspectionBy_CI(caseId);
	}
	public List<NcbjInspection>  getNcbj_FBAI(long ncbjApplicationId){
		return ncbjInspectionPersistence.findBygetNcbj_FBAI(ncbjApplicationId);
	}
	public List<NcbjInspection> getNcbj_CaseId(String caseId){
		return ncbjInspectionPersistence.findBygetNcbj_CaseId(caseId);
	}
	public List<NcbjInspection> getNcbj_Status(String status){
		return ncbjInspectionPersistence.findBygetNcbj_Status(status);
	}
	public List<NcbjInspection> getNcbj_CaseIdStatus(String caseId,String status){
		return ncbjInspectionPersistence.findBygetNcbj_CaseIdStatus(status, caseId);
	}
	public List<NcbjInspection> getNcbj_CaseIdAppId(String status,long ncbjApplicationId){
		return ncbjInspectionPersistence.findBygetNcbj_CaseIdAppId(status, ncbjApplicationId);
	}
	
	public NcbjInspection getInspecByStatus_SlotBook_AppId(String status,long slotBookedByUser,long ncbjApplicationId) throws NoSuchNcbjInspectionException {
		return ncbjInspectionPersistence.findBygetInspecByStatus_SlotBook_AppId(status, slotBookedByUser, ncbjApplicationId);
	}
}