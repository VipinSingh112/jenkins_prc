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

package com.nbp.explosives.competency.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesApplicationException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplicationTable;
import com.nbp.explosives.competency.application.form.service.service.base.ExplosivesApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication",
	service = AopService.class
)
public class ExplosivesApplicationLocalServiceImpl
	extends ExplosivesApplicationLocalServiceBaseImpl {
	
	public List<ExplosivesApplication> getExplosiveAppByStatusUser(int status,long userId) {
		return explosivesApplicationPersistence.findBygetExplosiveAppByStatusUser(status, userId);
	}
	public ExplosivesApplication getExplosiveById(long factoriesApplicationId) throws NoSuchExplosivesApplicationException {
		return explosivesApplicationPersistence.findBygetExplosiveById(factoriesApplicationId);
	}
	public ExplosivesApplication getExplosiveByAppNo(String applicationNumber) throws NoSuchExplosivesApplicationException {
		return explosivesApplicationPersistence.findBygetExplosiveByAppNo(applicationNumber);
	}
	public List<ExplosivesApplication> getExplosiveByStatus(int status){
		return explosivesApplicationPersistence.findBygetExplosiveByStatus(status);
	}
	public ExplosivesApplication getExplosiveByCaseId(String caseId) throws NoSuchExplosivesApplicationException {
		return explosivesApplicationPersistence.findBygetExplosiveByCaseId(caseId);
	}
	 public ExplosivesApplication getExplosiveRegstByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchExplosivesApplicationException { 
			return explosivesApplicationPersistence.findBygetExplosiveRegstByAT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
	 }
		public List<String> getExplosiveDistinctCategory() {
			DSLQuery query = DSLQueryFactoryUtil.selectDistinct(ExplosivesApplicationTable.INSTANCE.typeOfApplicant)
					.from(ExplosivesApplicationTable.INSTANCE);
			return dslQuery(query);
		}
}