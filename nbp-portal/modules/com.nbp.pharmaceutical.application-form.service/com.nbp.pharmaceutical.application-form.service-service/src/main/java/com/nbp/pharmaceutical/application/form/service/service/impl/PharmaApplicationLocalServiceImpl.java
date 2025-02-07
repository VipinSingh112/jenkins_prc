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

package com.nbp.pharmaceutical.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaApplicationException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationTable;
import com.nbp.pharmaceutical.application.form.service.service.base.PharmaApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.pharmaceutical.application.form.service.model.PharmaApplication", service = AopService.class)
public class PharmaApplicationLocalServiceImpl extends PharmaApplicationLocalServiceBaseImpl {
	public List<PharmaApplication> getPharmaByS_U(int status, long userId)throws NoSuchPharmaApplicationException {
		return pharmaApplicationPersistence.findBygetPharmaByStatusUser(status, userId);
	}
	public List<PharmaApplication> getPharmaByStatus(int status) {
		return pharmaApplicationPersistence.findBygetPharmaByStatus(status);
	}
	public PharmaApplication getPharmaByAppNum(String applicationNumber) throws NoSuchPharmaApplicationException {
		return pharmaApplicationPersistence.findBygetPharmaByAppNum(applicationNumber);
		}
	public PharmaApplication getPharmaByCaseId(String caseId) throws NoSuchPharmaApplicationException {
		return pharmaApplicationPersistence.findBypharmaApplicationByCaseId(caseId);
		}
	public List<String> getPharmaDistinctStages(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(PharmaApplicationTable.INSTANCE.requesttype).from(PharmaApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	public PharmaApplication getPharmaByAT_AppNo(String applicationType,String appNumber) throws NoSuchPharmaApplicationException {
		return pharmaApplicationPersistence.findBygetPharmaByAT_AppNo(applicationType, appNumber);
		
	}
}