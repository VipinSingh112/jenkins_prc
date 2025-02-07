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

package com.nbp.sez.status.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusApplicationException;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationTable;
import com.nbp.sez.status.application.form.service.service.base.SezStatusApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.form.service.model.SezStatusApplication",
	service = AopService.class
)
public class SezStatusApplicationLocalServiceImpl
	extends SezStatusApplicationLocalServiceBaseImpl {

	@Override
	public List<SezStatusApplication> getSezByS_U(int status, long userId) {
		// TODO Auto-generated method stub
		return sezStatusApplicationPersistence.findBygetSezByS_U(status, userId);
	}
	public SezStatusApplication getSezStatusBY_CI(String caseId) throws NoSuchSezStatusApplicationException {
		return sezStatusApplicationPersistence.findBygetSezStatusByCaseId(caseId);
	}
	@Override
	public SezStatusApplication getSezByStatus(int status) throws NoSuchSezStatusApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<SezStatusApplication> getsezByStatus(int status) {
		// TODO Auto-generated method stub
		return sezStatusApplicationPersistence.findBygetSezByStatus(status);
	}
	public List<SezStatusApplication> getSezStatusBy_EntityId(String entityId) {
		return sezStatusApplicationPersistence.findBygetSezStatusByEntityId(entityId);
	}
	public SezStatusApplication getSezStatusBy_EI_CI(String entityId,String caseId) throws NoSuchSezStatusApplicationException{
		return sezStatusApplicationPersistence.findBygetSezStatusByEI_CI(entityId, caseId);
	}
	public List<SezStatusApplication> getSezStatus_By_EI_Status(String entityId,int status){
		return sezStatusApplicationPersistence.findBygetSezStatusByEntityId_Status(entityId, status);
	}
	public SezStatusApplication getSezStatusByAppNo(String applicationNumber) throws NoSuchSezStatusApplicationException {
		return sezStatusApplicationPersistence.findBygetSezStatusByAppNo(applicationNumber);
	}
	 public SezStatusApplication getSezByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchSezStatusApplicationException { 
		return sezStatusApplicationPersistence.findBygetSezStatusByAT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
	}
	 public  List<SezStatusApplication> getSez_By_App_Status(int status, String doYouWantTo) throws NoSuchSezStatusApplicationException{ 
		 return sezStatusApplicationPersistence.findBygetSez_By_App_Status(status, doYouWantTo); 
	 }
		public List<String> getSezDistinctCategory() {
			DSLQuery query = DSLQueryFactoryUtil.selectDistinct(SezStatusApplicationTable.INSTANCE.typeOfTransaction)
					.from(SezStatusApplicationTable.INSTANCE);
			return dslQuery(query);
		}
}