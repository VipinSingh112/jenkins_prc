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

package com.nbp.jadsc.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCApplicationException;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCApplicationTable;
import com.nbp.jadsc.application.form.service.service.base.JADSCApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.jadsc.application.form.service.model.JADSCApplication", service = AopService.class)
public class JADSCApplicationLocalServiceImpl extends JADSCApplicationLocalServiceBaseImpl {
	public List<JADSCApplication> getJADSCByS_U(int status, long userId) {
		return jadscApplicationPersistence.findBygetJADSCByS_U(status, userId);
	}

	public JADSCApplication getJADSCStatusByCaseId(String caseId) throws NoSuchJADSCApplicationException {
		return jadscApplicationPersistence.findBygetJADSCByCaseId(caseId);
	}

	public List<JADSCApplication> getJadscByStatus(int status) {
		return jadscApplicationPersistence.findBygetJADSCByStatus(status);
	}

	public List<JADSCApplication> getJadscByEntityId(String entityId) {
		return jadscApplicationPersistence.findBygetJADSCByEntityId(entityId);
	}

	public List<JADSCApplication> getFireBrigadeByEntityId_Status(String entityId, int status) {
		return jadscApplicationPersistence.findBygetJADSCByEntityId_Status(entityId, status);
	}

	public JADSCApplication getFireBrigadeByEI_CI(String entityId, String caseId)
			throws NoSuchJADSCApplicationException {
		return jadscApplicationPersistence.findBygetJADSCByEI_CI(entityId, caseId);
	}

	public JADSCApplication getFireBrigadeByAppNo(String applicationNumber) throws NoSuchJADSCApplicationException {
		return jadscApplicationPersistence.findBygetJADSCByAppNo(applicationNumber);
	}

	public JADSCApplication getJADSCRegstByAT_AppNo(String breachOfConfidentiality, String expiredLicenseAppNumber)
			throws NoSuchJADSCApplicationException {
		return jadscApplicationPersistence.findBygetJADSCRegstByAT_AppNo(breachOfConfidentiality,
				expiredLicenseAppNumber);
	}

	public List<String> getJadscDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(JADSCApplicationTable.INSTANCE.typeOfApplication)
				.from(JADSCApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}