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

package com.nbp.healthcare.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicationException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplication;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationTable;
import com.nbp.healthcare.application.form.service.service.base.HealthCareApplicationLocalServiceBaseImpl;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.healthcare.application.form.service.model.HealthCareApplication",
	service = AopService.class
)
public class HealthCareApplicationLocalServiceImpl
	extends HealthCareApplicationLocalServiceBaseImpl {
	public List<HealthCareApplication> getHealthCareByS_U(int status,long userId){
		return healthCareApplicationPersistence.findBygetHealthCareByS_U(status, userId);
		}
	
	public List<HealthCareApplication> getHealthCareByStatus(int status){
		return healthCareApplicationPersistence.findBygetHealthCareByStatus(status);
	}
	public HealthCareApplication getHealthcareByAppNo(String healthcareApplicationNumber) throws NoSuchHealthCareApplicationException {
		return healthCareApplicationPersistence.findBygetHealthCareByAppNo(healthcareApplicationNumber);
		
	}
	public HealthCareApplication getHealthcareBy_CI(String healthcareCaseId) throws NoSuchHealthCareApplicationException {
		return healthCareApplicationPersistence.findBygetHealthCareByCaseId(healthcareCaseId);
		
	}
	public List<String> getHealthDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(HealthCareApplicationTable.INSTANCE.healthCareFacility).from(HealthCareApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}