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

package com.nbp.acquire.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.acquire.application.form.service.exception.NoSuchAcquireApplicationException;
import com.nbp.acquire.application.form.service.model.AcquireApplication;
import com.nbp.acquire.application.form.service.model.AcquireApplicationTable;
import com.nbp.acquire.application.form.service.service.base.AcquireApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.application.form.service.model.AcquireApplication",
	service = AopService.class
)
public class AcquireApplicationLocalServiceImpl
	extends AcquireApplicationLocalServiceBaseImpl {
	public List<AcquireApplication> getAcquireByS_U(int status, long userId) throws NoSuchAcquireApplicationException{
		return acquireApplicationPersistence.findBygetAcquireApplicationByStatusUser(status, userId);
	}
	public List<AcquireApplication> getAcquireByStatus(int status) throws NoSuchAcquireApplicationException {
		return acquireApplicationPersistence.findBygetAcquireByStatus(status);
	}
	public AcquireApplication getAcquireByAppNum(String applicationNumber) throws NoSuchAcquireApplicationException {
		return acquireApplicationPersistence.findBygetAcquireByAppNo(applicationNumber);
		}
	public AcquireApplication getPharmaByCaseId(String caseId) throws NoSuchAcquireApplicationException {
		return acquireApplicationPersistence.findBygetAcquireByCaseId(caseId);
		}
	public List<String> getAcquireDistinctStages(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(AcquireApplicationTable.INSTANCE.tenureType).from(AcquireApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}