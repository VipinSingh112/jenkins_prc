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

package com.nbp.fire.brigade.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeApplicationException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplicationTable;
import com.nbp.fire.brigade.application.form.service.service.base.FireBrigadeApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication",
	service = AopService.class
)
public class FireBrigadeApplicationLocalServiceImpl
	extends FireBrigadeApplicationLocalServiceBaseImpl {
	
	public List<FireBrigadeApplication>  getFireBrigadeByS_U(int status, long userId){
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByS_U(status, userId);
	}
	
	public FireBrigadeApplication getFireBrigadeStatusByCaseId(String caseId) throws NoSuchFireBrigadeApplicationException {
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeStatusByCaseId(caseId);
	}
	
	public List<FireBrigadeApplication>  getFireBrigadeByStatus(int status){
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByStatus(status) ;
	}
	
	public List<FireBrigadeApplication> getFireBrigadeByEntityId(String entityId){
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByEntityId(entityId);
	}
	
	public List<FireBrigadeApplication> getFireBrigadeByEntityId_Status(String entityId,int status){
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByEntityId_Status(entityId, status);
	}
	
	public FireBrigadeApplication getFireBrigadeByEI_CI(String entityId,String caseId) throws NoSuchFireBrigadeApplicationException {
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByEI_CI(entityId, caseId);
	}
	
    public FireBrigadeApplication  getFireBrigadeByAppNo(String applicationNumber) throws NoSuchFireBrigadeApplicationException {
		return fireBrigadeApplicationPersistence.findBygetFireBrigadeByAppNo(applicationNumber);
    }
    
    public FireBrigadeApplication getFB_ByAppType_AppNo(String applicationType ,String applicationNumber) throws NoSuchFireBrigadeApplicationException {
    	return fireBrigadeApplicationPersistence.findBygetFB_AppType_AppNo(applicationType, applicationNumber);
    }
	public List<String> getFireBrigadeDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(FireBrigadeApplicationTable.INSTANCE.typeOfApplicant)
				.from(FireBrigadeApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	
}