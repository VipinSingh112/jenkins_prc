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

package com.nbp.ncra.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.ncra.application.form.service.exception.NoSuchNcraApplicationException;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraApplicationTable;
import com.nbp.ncra.application.form.service.service.base.NcraApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncra.application.form.service.model.NcraApplication",
	service = AopService.class
)
public class NcraApplicationLocalServiceImpl
	extends NcraApplicationLocalServiceBaseImpl {
	public List<NcraApplication> getNcraByS_U(int status , long userId){
		return ncraApplicationPersistence.findBygetNcraByS_U(userId, status);
	}
	public List<NcraApplication> getNcraByStatus(int status){
		return ncraApplicationPersistence.findBygetNcraByStatus(status);
	}
	public NcraApplication getNcraByAppNum(String applicationNumber) throws NoSuchNcraApplicationException{
		return ncraApplicationPersistence.findBygetNcraByAppNum(applicationNumber);
	}
	public NcraApplication getNcraByCaseId(String caseId) throws NoSuchNcraApplicationException{
		return ncraApplicationPersistence.findBygetNcraByCaseId(caseId);
	}
	public List<NcraApplication> getNcraByEntityId(String entityId){
		return ncraApplicationPersistence.findBygetNcraByEntityId(entityId);
	}
	public List<NcraApplication> getNcraByEntityId_Status(String entityId,int status) {
		return ncraApplicationPersistence.findBygetNcraByEntityId_Status(entityId, status);
	}
	public NcraApplication getNcraByEI_CI(String entityId,String caseId) throws NoSuchNcraApplicationException {
		return ncraApplicationPersistence.findBygetNcraByEI_CI(entityId, caseId);
	}
	public NcraApplication getNcraByRT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchNcraApplicationException {
		return ncraApplicationPersistence.findBygetNcraByRT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
	}
	public List<String> getNCRADistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(NcraApplicationTable.INSTANCE.doYouWant)
				.from(NcraApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}