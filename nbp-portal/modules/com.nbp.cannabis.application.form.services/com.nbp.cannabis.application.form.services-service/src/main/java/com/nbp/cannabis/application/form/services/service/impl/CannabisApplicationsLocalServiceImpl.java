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

package com.nbp.cannabis.application.form.services.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationsException;
import com.nbp.cannabis.application.form.services.model.CannabisApplications;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationsTable;
import com.nbp.cannabis.application.form.services.service.base.CannabisApplicationsLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisApplications",
	service = AopService.class
)
public class CannabisApplicationsLocalServiceImpl
	extends CannabisApplicationsLocalServiceBaseImpl {
	
	public List<CannabisApplications> getCannabisApplicationsByStatus(int status){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByStatus(status);
	}
	public List<CannabisApplications> getCannabisApplicationsByUser(long userId){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByUser(userId);
	}
	public List<CannabisApplications> getCannabisApplicationsByS_U(long userId,int status){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByStatusUser(status, userId);
	}
	public CannabisApplications getCannabisApplicationsByAppNo(String applicationNumber) throws NoSuchCannabisApplicationsException {
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsAppNo(applicationNumber);
	}
	public CannabisApplications getCannabisApplicationsByCaseId(String caseId) throws NoSuchCannabisApplicationsException {
		return cannabisApplicationsPersistence.findBycannabisApplicationByCaseId(caseId);
	}
	
	public List<CannabisApplications> getCannabisApplicationsByLicenseCategory(int status, String licenseCategory){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByLicenseCategory(status, licenseCategory);
	}
	
	public List<CannabisApplications> getCannabisApplicationsByLicenseSubCategory(int status,String licenseSubCategory){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByLicenseSubCategory(status, licenseSubCategory);
	}
	
	public int getCannabisApplicationsByRequestTypeCount(int status,String requestType){
		return cannabisApplicationsPersistence.countBygetCannabisApplicationsByRequestType(status, requestType);
	}
	public CannabisApplications getCannabisApplicationsByRT_ExpiredAppNo(String expiredLicenseAppNo,String requestType) throws NoSuchCannabisApplicationsException{
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByRT_ExpiredAppNo(requestType, expiredLicenseAppNo);
	}
	
	public int getCannabisApplicationsByLicenseCategoryCount(int status, String licenseCategory){
		return cannabisApplicationsPersistence.countBygetCannabisApplicationsByLicenseCategory(status, licenseCategory);
	}
	
	public int  getCannabisApplicationsByLicenseSubCategoryCount(int status,String licenseSubCategory){
		return cannabisApplicationsPersistence.countBygetCannabisApplicationsByLicenseSubCategory(status, licenseSubCategory);
	}
	
	public List<CannabisApplications> getCannabisApplicationsByRequestType(int status,String requestType){
		return cannabisApplicationsPersistence.findBygetCannabisApplicationsByRequestType(status, requestType);
	}
	public List<String> getCannabisDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(CannabisApplicationsTable.INSTANCE.requestType).from(CannabisApplicationsTable.INSTANCE);
		return dslQuery(query);
	}
	
	
}