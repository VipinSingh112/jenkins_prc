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

package com.nbp.factories.registration.application.form.services.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesApplicationRegistrationException;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistrationTable;
import com.nbp.factories.registration.application.form.services.service.base.FactoriesApplicationRegistrationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration",
	service = AopService.class
)
public class FactoriesApplicationRegistrationLocalServiceImpl
	extends FactoriesApplicationRegistrationLocalServiceBaseImpl {

	public List<FactoriesApplicationRegistration> getFactoriesApplicationRegistrationByStatus_UserId(int status,long userId) {
		return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegistrationApplicationByStatusUser(status, userId);
	}
	public FactoriesApplicationRegistration getFactoriesRegistrationById(long factoriesApplicationId) throws NoSuchFactoriesApplicationRegistrationException {
		return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegistrationById(factoriesApplicationId);
	}
	public FactoriesApplicationRegistration getFactoriesRegstBy_AppNo(String applicationNumber) throws NoSuchFactoriesApplicationRegistrationException {
		return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegstBy_AppNo(applicationNumber);
	}
	public List<FactoriesApplicationRegistration> getFactoriesRegstByStatus(int status){
		return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegistrationByStatus(status);
	}
	public FactoriesApplicationRegistration getFactoriesRegstBy_CaseId(String caseId) throws NoSuchFactoriesApplicationRegistrationException {
		return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegstBy_CaseId(caseId);
	}
	 public FactoriesApplicationRegistration getFactoriesRegstByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchFactoriesApplicationRegistrationException { 
			return factoriesApplicationRegistrationPersistence.findBygetFactoriesRegstByAT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
	 }
	 public List<String> getFactoriesDistinctCategories(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(FactoriesApplicationRegistrationTable.INSTANCE.typeOfTransaction).from(FactoriesApplicationRegistrationTable.INSTANCE);
			return dslQuery(query);
		}
	

	@Override
	public List<FactoriesApplicationRegistration> getFactoriesRegstByS_U(long userId, int status) {
		// TODO Auto-generated method stub
		return null;
	}
	
}