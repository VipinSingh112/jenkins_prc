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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisInspectionException;
import com.npm.cannabis.application.stages.services.model.CannabisInspection;
import com.npm.cannabis.application.stages.services.service.base.CannabisInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisInspection",
	service = AopService.class
)
public class CannabisInspectionLocalServiceImpl
	extends CannabisInspectionLocalServiceBaseImpl {
	
	public List<CannabisInspection> getCannabisInspections(long cannabisApplicationId){
		return cannabisInspectionPersistence.findBygetCI_CAI(cannabisApplicationId);
	}
	public List<CannabisInspection> getCannabisInspectionsByCaseId(String caseId){
		return cannabisInspectionPersistence.findBygetCI_CaseId(caseId);
	}
	public List<CannabisInspection> getCannabisInspectionsByStatusCaseId(String caseId,String status){
		return cannabisInspectionPersistence.findBygetCI_CaseIdStatus(status, caseId);
	}
	public List<CannabisInspection> getCannabisInspectionsByStatusApplicationId(long cannabisApplicationId,String status){
		return cannabisInspectionPersistence.findBygetCI_CaseIdApplicationId(status, cannabisApplicationId);
	}
	public CannabisInspection getInspectionByStatus_SlotBoooked(String status,long slotBookedByUser,long cannabisApplicationId) throws NoSuchCannabisInspectionException {
		return cannabisInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, cannabisApplicationId);
		
	}
	@Override
	public CannabisInspection getInspectionByStatus_SlotBoooked(String status, long slotBookedByUser)
			throws NoSuchCannabisInspectionException {
		// TODO Auto-generated method stub
		return null;
	}
}