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

package com.nbp.janaac.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.janaac.stages.services.exception.NoSuchJanaacInspectionException;
import com.nbp.janaac.stages.services.model.JanaacInspection;
import com.nbp.janaac.stages.services.service.base.JanaacInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.janaac.stages.services.model.JanaacInspection", service = AopService.class)
public class JanaacInspectionLocalServiceImpl extends JanaacInspectionLocalServiceBaseImpl {
	public JanaacInspection getJanaacInspectionBy_CI(String caseId) throws NoSuchJanaacInspectionException {
		return janaacInspectionPersistence.findBygetJanaacInspectionBy_CI(caseId);
	}

	public List<JanaacInspection> getJanaac_AI(long janaacApplicationId) {
		return janaacInspectionPersistence.findBygetJanaac_AI(janaacApplicationId);
	}

	public List<JanaacInspection> getJanaac_By_CaseId(String caseId) {
		return janaacInspectionPersistence.findBygetjanaac_by_CaseId(caseId);
	}

	public List<JanaacInspection> getJanaac_By_Status(String status) {
		return janaacInspectionPersistence.findBygetJanaac_Status(status);
	}

	public List<JanaacInspection> getNcra_CaseIdStatus(String caseId, String status) {
		return janaacInspectionPersistence.findBygetJanaac_CaseIdStatus(status, caseId);
	}

	public List<JanaacInspection> getNcra_CaseIdApplicationId(String status, long janaacApplicationId) {
		return janaacInspectionPersistence.findBygetJanaac_CaseIdApplicationId(status, janaacApplicationId);
	}

	public JanaacInspection getInspectionByStatus_SlotBoooked_ApplicationId(String status, long slotBookedByUser,
			long ncraApplicationId) throws NoSuchJanaacInspectionException {
		return janaacInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status,
				slotBookedByUser, ncraApplicationId);
	}

	public List<JanaacInspection> getJanaac_StatusApplicationId(String status, long janaacApplicationId) {
		return janaacInspectionPersistence.findBygetJanaac_CaseIdApplicationId(status, janaacApplicationId);
	}
}