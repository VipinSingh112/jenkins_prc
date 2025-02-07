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

package com.agriculture.application.form.service.service.impl;


import com.agriculture.application.form.service.exception.NoSuchAgricultureApplicationException;
import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.model.AgricultureApplicationTable;
import com.agriculture.application.form.service.service.base.AgricultureApplicationLocalServiceBaseImpl;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultureApplication",
	service = AopService.class
)
public class AgricultureApplicationLocalServiceImpl
	extends AgricultureApplicationLocalServiceBaseImpl {
	public List<AgricultureApplication> getAgricultureApplicationByS_U(long userId,int status){
		return agricultureApplicationPersistence.findBygetAgriApplicationByStatusUser(status, userId);
	}
	
	  public List<AgricultureApplication> getAgricultureByStatus(int status){
	  return agricultureApplicationPersistence.findBygetAgricultureByStatus(status);
	  }
	  
	 public AgricultureApplication getAgricultureByAppNo(String applicationNumber) throws NoSuchAgricultureApplicationException {
		 return agricultureApplicationPersistence.findBygetAgricultureByAppNo(applicationNumber);
	 }
	 public AgricultureApplication getAgricultureBy_CI(String caseId) throws NoSuchAgricultureApplicationException {
		 return agricultureApplicationPersistence.findBygetAgricultureBy_CI(caseId);
	 }
	 public AgricultureApplication getAgricultureBy_RT_AppNo(String expiredAppLicenseNumber,String requestType) throws NoSuchAgricultureApplicationException {
		 return agricultureApplicationPersistence.findBygetAgriApplicationByRT_AppNo(expiredAppLicenseNumber, requestType);
	 }
	 public List<String> getAgricultureDistinctCategory(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(AgricultureApplicationTable.INSTANCE.requestType).from(AgricultureApplicationTable.INSTANCE);
			return dslQuery(query);
		}

	@Override
	public AgricultureApplication getAgricultureBy_RT_AppNo(String caseId)
			throws NoSuchAgricultureApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}