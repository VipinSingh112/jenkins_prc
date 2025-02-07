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

package com.nbp.ogt.application.form.services.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.ogt.application.form.services.exception.NoSuchOgtApplicationException;
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.model.OgtApplicationTable;
import com.nbp.ogt.application.form.services.service.base.OgtApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ogt.application.form.services.model.OgtApplication",
	service = AopService.class
)
public class OgtApplicationLocalServiceImpl
	extends OgtApplicationLocalServiceBaseImpl {
	public OgtApplication getOgtByAppNum(String applicationNumber) throws NoSuchOgtApplicationException {
		return ogtApplicationPersistence.findBygetOgtByAppNum(applicationNumber);
	}
	public List<OgtApplication> getOgtByS_U(long userId,int status){
		return ogtApplicationPersistence.findBygetOgtByS_U(userId, status);
	}
	public List<OgtApplication> getOgtByStatus(int status){
		return ogtApplicationPersistence.findBygetOgtByStatus(status);
	}
	public OgtApplication getOgtByCaseId(String caseId) throws NoSuchOgtApplicationException{
		return ogtApplicationPersistence.findBygetOgtByCaseId(caseId);
	}
	public OgtApplication getOgtByRT_AppNo(String typeOfApplicant, String expiredLicenseAppNumber) throws NoSuchOgtApplicationException{
		return ogtApplicationPersistence.findBygetOgtByRT_AppNo(typeOfApplicant, expiredLicenseAppNumber);
	}
	public List<String> getOgtDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(OgtApplicationTable.INSTANCE.natureOfApplicant).from(OgtApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	
}