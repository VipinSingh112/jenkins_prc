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

package com.nbp.wra.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.wra.application.form.service.exception.NoSuchWRAApplicationException;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAApplicationTable;
import com.nbp.wra.application.form.service.service.base.WRAApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.wra.application.form.service.model.WRAApplication", service = AopService.class)
public class WRAApplicationLocalServiceImpl extends WRAApplicationLocalServiceBaseImpl {
	public List<WRAApplication> getWraApplicationBy_S_UI(int status, long userId) {
		return wraApplicationPersistence.findBygetWRA_ByS_U(status, userId);
	}
	public List<WRAApplication> getWraApplicationBy_Status(int status){
		return wraApplicationPersistence.findBygetWRA_By_Status(status);
	}
	public WRAApplication getWraApplicationBy_ApplicationNumber(String applicationNumber) throws NoSuchWRAApplicationException{
		return wraApplicationPersistence.findBygetWRAByAppNo(applicationNumber);
	}
	public WRAApplication getWraByRT_AppNo(String typeOfApplication, String expiredLicenseAppNumber) throws NoSuchWRAApplicationException{
		return wraApplicationPersistence.findBygetWraByRT_AppNo(typeOfApplication, expiredLicenseAppNumber);
	}
	public WRAApplication getWRA_By_CaseId(String caseId) throws NoSuchWRAApplicationException{
		return wraApplicationPersistence.findBygetWRA_By_CaseId(caseId);
	}
	public List<String> getWRADistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(WRAApplicationTable.INSTANCE.typeOfApplication).from(WRAApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	@Override
	public List<WRAApplication> getWraApplicationBy_User_Id(int status) {
		// TODO Auto-generated method stub
		return null;
	}

}