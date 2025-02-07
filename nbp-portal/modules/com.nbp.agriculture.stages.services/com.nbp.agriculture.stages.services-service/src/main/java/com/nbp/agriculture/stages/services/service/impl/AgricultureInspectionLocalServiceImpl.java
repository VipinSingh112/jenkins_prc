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

package com.nbp.agriculture.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureInspectionException;
import com.nbp.agriculture.stages.services.model.AgricultureInspection;
import com.nbp.agriculture.stages.services.service.base.AgricultureInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.agriculture.stages.services.model.AgricultureInspection", service = AopService.class)
public class AgricultureInspectionLocalServiceImpl extends AgricultureInspectionLocalServiceBaseImpl {
	public AgricultureInspection getAgricultureBy_CI(String caseId) throws NoSuchAgricultureInspectionException {
		return agricultureInspectionPersistence.findBygetAgricultureInspectionBy_CI(caseId);
	}

	public AgricultureInspection updateAgricultureInspection(String caseId, Date dateOfinspection) {

		AgricultureInspection agricultureInspection = null;
		try {
			agricultureInspection = agricultureInspectionPersistence.findBygetAgricultureInspectionBy_CI(caseId);
		} catch (NoSuchAgricultureInspectionException e) {
		}
		if (Validator.isNotNull(agricultureInspection)) {
			agricultureInspection.setDateOfInspection(dateOfinspection);
			agricultureInspectionPersistence.update(agricultureInspection);
		} else {
			agricultureInspection=createAgricultureInspection(CounterLocalServiceUtil.increment());
			agricultureInspection.setCaseId(caseId);
			agricultureInspection.setDateOfInspection(dateOfinspection);
			agricultureInspectionPersistence.update(agricultureInspection);

		}
		return agricultureInspection;
	}
	public List<AgricultureInspection> getAgriInspections(long agriApplicationId){
		return agricultureInspectionPersistence.findBygetCI_CAI(agriApplicationId);
	}
	public List<AgricultureInspection> getAgriInspectionsByCaseId(String caseId){
		return agricultureInspectionPersistence.findBygetAI_CaseId(caseId);
	}
	public List<AgricultureInspection> getAgriInspectionsByStatusCaseId(String caseId,String status){
		return agricultureInspectionPersistence.findBygetAI_CaseIdStatus(status, caseId);
	}
	public List<AgricultureInspection> getAgriInspectionsByStatusApplicationId(long agriApplicationId,String status){
		return agricultureInspectionPersistence.findBygetAI_CaseIdApplicationId(status, agriApplicationId);
	}
    public AgricultureInspection getAgriInspectionsByStatusApplicationId(String status,long slotBookedByUser,long agriApplicationId) throws NoSuchAgricultureInspectionException {
		return agricultureInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, agriApplicationId);
    	
    }
}
