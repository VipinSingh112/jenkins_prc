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

package com.nbp.factories.registration.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesInspectionException;
import com.nbp.factories.registration.stage.services.model.FactoriesInspection;
import com.nbp.factories.registration.stage.services.service.base.FactoriesInspectionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.factories.registration.stage.services.model.FactoriesInspection", service = AopService.class)
public class FactoriesInspectionLocalServiceImpl extends FactoriesInspectionLocalServiceBaseImpl {
	public FactoriesInspection getFactoryInspectionBy_CI(String caseId) throws NoSuchFactoriesInspectionException {
		return factoriesInspectionPersistence.findBygetFactoryInspectionBy_CI(caseId);
	}

	public FactoriesInspection updateFactoriesInspection(String caseId, Date dateOfinspection) {

		FactoriesInspection factoryInspection = null;
		try {
			factoryInspection = factoriesInspectionPersistence.findBygetFactoryInspectionBy_CI(caseId);
		} catch (NoSuchFactoriesInspectionException e) {
		}
		if (Validator.isNotNull(factoryInspection)) {
			factoryInspection.setDateOfInspection(dateOfinspection);
			factoriesInspectionPersistence.update(factoryInspection);
		} else {
			factoryInspection = createFactoriesInspection(CounterLocalServiceUtil.increment());
			factoryInspection.setCaseId(caseId);
			factoryInspection.setDateOfInspection(dateOfinspection);
			factoriesInspectionPersistence.update(factoryInspection);

		}
		return factoryInspection;
	}

	public List<FactoriesInspection> getFactoriesInspections(long factoriesApplicationId) {
		return factoriesInspectionPersistence.findBygetFI_FAI(factoriesApplicationId);
	}

	public List<FactoriesInspection> getFactoriesInspectionsByCaseId(String caseId) {
		return factoriesInspectionPersistence.findBygetMI_CaseId(caseId);
	}

	public List<FactoriesInspection> getFactoriesInspectionsByStatusCaseId(String caseId, String status) {
		return factoriesInspectionPersistence.findBygetMI_CaseIdStatus(status, caseId);
	}

	public List<FactoriesInspection> getFactoriesInspectionsByStatusApplicationId(long agriApplicationId,
			String status) {
		return factoriesInspectionPersistence.findBygetMI_CaseIdApplicationId(status, agriApplicationId);
	}

	public FactoriesInspection getFactoriesInspectionsByStatusApplicationId(String status, long slotBookedByUser,
			long factoriesApplicationId) throws NoSuchFactoriesInspectionException {
		return factoriesInspectionPersistence.findBygetInspectionByStatus_SlotBoooked_ApplicationId(status,
				slotBookedByUser, factoriesApplicationId);

	}

}