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

package com.nbp.miic.application.form.services.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicationException;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicApplicationTable;
import com.nbp.miic.application.form.services.service.base.MiicApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.miic.application.form.services.model.MiicApplication", service = AopService.class)
public class MiicApplicationLocalServiceImpl extends MiicApplicationLocalServiceBaseImpl {
	public List<MiicApplication> getMIICByS_U(int status, long userId) {
		return miicApplicationPersistence.findBygetMIICByS_U(status, userId);
	}

	public MiicApplication getMIICStatusByCaseId(String caseId) throws NoSuchMiicApplicationException {
		return miicApplicationPersistence.findBygetMIICByCaseId(caseId);
	}

	public List<MiicApplication> getMIICByStatus(int status) {
		return miicApplicationPersistence.findBygetMIICByStatus(status);
	}

	public List<MiicApplication> getMIICByEntityId(String entityId) {
		return miicApplicationPersistence.findBygetMIICByEntityId(entityId);
	}

	public List<MiicApplication> getMIICByEntityId_Status(String entityId, int status) {
		return miicApplicationPersistence.findBygetMIICByEntityId_Status(entityId, status);
	}

	public MiicApplication getMIICByEI_CI(String entityId, String caseId) throws NoSuchMiicApplicationException {
		return miicApplicationPersistence.findBygetMIICByEI_CI(entityId, caseId);
	}

	public MiicApplication getMIICByAppNo(String applicationNumber) throws NoSuchMiicApplicationException {
		return miicApplicationPersistence.findBygetMIICByAppNo(applicationNumber);
	}
	public MiicApplication getMIICByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchMiicApplicationException  {
		return miicApplicationPersistence.findBygetMIICByAT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
	}
	public List<String> getMiicDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(MiicApplicationTable.INSTANCE.typeOfTransaction).from(MiicApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	
}