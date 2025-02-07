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

package com.nbp.quary.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationException;
import com.nbp.quary.application.form.service.model.QuarryApplication;
import com.nbp.quary.application.form.service.model.QuarryApplicationTable;
import com.nbp.quary.application.form.service.service.base.QuarryApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.quary.application.form.service.model.QuarryApplication",
	service = AopService.class
)
public class QuarryApplicationLocalServiceImpl
	extends QuarryApplicationLocalServiceBaseImpl {
	
	public List<QuarryApplication> getQuarryApplicationByStatus(int status){
		return quarryApplicationPersistence.findBygetQuarryByStatus(status);
	}
	public List<QuarryApplication> getQuarryApplicationByStatus_UId(int status,long userId){
		return quarryApplicationPersistence.findBygetQuarryByS_U(status, userId);
	}
	public QuarryApplication getQuarryByAppNo(String applicationNumber) throws NoSuchQuarryApplicationException{
		return quarryApplicationPersistence.findBygetQuarryByAppNo(applicationNumber);
	}
	public QuarryApplication getQuarryByCaseId(String caseId) throws NoSuchQuarryApplicationException{
		return quarryApplicationPersistence.findBygetQuarryByCaseId(caseId);
	}
	public QuarryApplication getQuarryByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchQuarryApplicationException { 
		return quarryApplicationPersistence.findBygetQuarryByAppType_AppNo(typeOfTransaction, expiredLicenseAppNumber);
    }
	public List<String> getQuaryDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(QuarryApplicationTable.INSTANCE.natureOfApplicant).from(QuarryApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}