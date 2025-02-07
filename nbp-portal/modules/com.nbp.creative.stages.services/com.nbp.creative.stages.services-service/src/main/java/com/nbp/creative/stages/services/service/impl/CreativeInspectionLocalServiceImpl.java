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

package com.nbp.creative.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.creative.stages.services.exception.NoSuchCreativeInspectionException;
import com.nbp.creative.stages.services.model.CreativeInspection;
import com.nbp.creative.stages.services.service.base.CreativeInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.creative.stages.services.model.CreativeInspection", service = AopService.class)
public class CreativeInspectionLocalServiceImpl extends CreativeInspectionLocalServiceBaseImpl {
	public CreativeInspection geCreativeInspectionBy_CI(String caseId) throws NoSuchCreativeInspectionException {
		return creativeInspectionPersistence.findBygetCreativeInspectionBy_CI(caseId);
	}

	public CreativeInspection updateCreativeInspection(String caseId, Date dateOfinspection) {

		CreativeInspection creativeInspection = null;
		try {
			creativeInspection = creativeInspectionPersistence.findBygetCreativeInspectionBy_CI(caseId);
		} catch (NoSuchCreativeInspectionException e) {
		}
		if (Validator.isNotNull(creativeInspection)) {
			creativeInspection.setDateOfInspection(dateOfinspection);
			creativeInspectionPersistence.update(creativeInspection);
		} else {
			creativeInspection = createCreativeInspection(CounterLocalServiceUtil.increment());
			creativeInspection.setCaseId(caseId);
			creativeInspection.setDateOfInspection(dateOfinspection);
			creativeInspectionPersistence.update(creativeInspection);

		}
		return creativeInspection;
	}
	
	public List<CreativeInspection> getCreativeInspections(long creativeApplicationId){
		return creativeInspectionPersistence.findBygetCI_CAI(creativeApplicationId);
	}
	public List<CreativeInspection> getCreativeInspectionsByCaseId(String caseId){
		return creativeInspectionPersistence.findBygetCI_CaseId(caseId);
	}
	public List<CreativeInspection> getCreativeInspectionsByStatusCaseId(String caseId,String status){
		return creativeInspectionPersistence.findBygetCI_CaseIdStatus(status, caseId);
	}
	public List<CreativeInspection> getCreativeInspectionsByStatusApplicationId(long creativeApplicationId,String status){
		return creativeInspectionPersistence.findBygetCI_CaseIdApplicationId(status, creativeApplicationId);
	}
	public CreativeInspection getInspectionByStatus_SlotBoooked(String status,long slotBookedByUser,long creativeApplicationId) throws NoSuchCreativeInspectionException{
		return creativeInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status, slotBookedByUser, creativeApplicationId);
		
	}

}