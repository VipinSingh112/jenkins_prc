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

package com.nbp.farm.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationException;
import com.nbp.farm.application.form.service.model.FarmerApplication;
import com.nbp.farm.application.form.service.model.FarmerApplicationTable;
import com.nbp.farm.application.form.service.service.base.FarmerApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.form.service.model.FarmerApplication",
	service = AopService.class
)
public class FarmerApplicationLocalServiceImpl
	extends FarmerApplicationLocalServiceBaseImpl {
	public FarmerApplication getFarmerById(long ApplicationId) {
		return farmerApplicationPersistence.fetchBygetFarmerById(ApplicationId);}
	public List<FarmerApplication> getFarmerApplicationByStatus(int status){
		return farmerApplicationPersistence.findBygetFarmerApplicationByStatus(status);
	}
	public List<FarmerApplication> getFarmerApplicationByUser(long userId){
		return farmerApplicationPersistence.findBygetFarmerApplicationByUser(userId);
	}
	public List<FarmerApplication> getFarmerApplicationByS_U(long userId,int status) throws NoSuchFarmerApplicationException {
		
		return farmerApplicationPersistence.findBygetFarmerApplicationByStatusUser(status, userId);
	}
	public FarmerApplication getFarmerApplicationByAppNo(String applicationNumber) throws NoSuchFarmerApplicationException  {
		return farmerApplicationPersistence.findBygetFarmerApplicationAppNo(applicationNumber);
	}
	public FarmerApplication getFarmerApplicationByRT_AppNo(String requestType,String expiredLicenseappNumber) throws NoSuchFarmerApplicationException  {
		return farmerApplicationPersistence.findBygetFarmerByRT_AppNo(expiredLicenseappNumber, requestType);
	}
	public FarmerApplication getFarmerApplicationByCaseId(String caseId) throws NoSuchFarmerApplicationException  {
		return farmerApplicationPersistence.findByfarmerApplicationByCaseId(caseId);
	}
	public List<String> getFarmerDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(FarmerApplicationTable.INSTANCE.requestType).from(FarmerApplicationTable.INSTANCE);
		return dslQuery(query);
	}

}