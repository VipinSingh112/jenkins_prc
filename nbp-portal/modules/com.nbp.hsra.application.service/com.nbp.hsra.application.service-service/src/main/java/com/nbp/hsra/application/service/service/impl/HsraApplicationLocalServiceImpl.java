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

package com.nbp.hsra.application.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationException;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationTable;
import com.nbp.hsra.application.service.service.base.HsraApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.application.service.model.HsraApplication",
	service = AopService.class
)
public class HsraApplicationLocalServiceImpl
	extends HsraApplicationLocalServiceBaseImpl {
	public HsraApplication getHsraByAppNum(String applicationNumber) throws NoSuchHsraApplicationException {
		return hsraApplicationPersistence.findBygetHsraByAppNum(applicationNumber);
	}
	public List<HsraApplication> getHsraByS_U(long userId,int status){
		return hsraApplicationPersistence.findBygetHsraByS_U(userId, status);
	}
	public List<HsraApplication> getHsraByStatus(int status){
		return hsraApplicationPersistence.findBygetHsraByStatus(status);
	}
	public HsraApplication getHsraByCaseId(String caseId) throws NoSuchHsraApplicationException{
		return hsraApplicationPersistence.findBygetHsraByCaseId(caseId);
	}
	public HsraApplication getHsraByRT_AppNo(String typeOfApplicant, String expiredLicenseAppNumber) throws NoSuchHsraApplicationException{
		return hsraApplicationPersistence.findBygetHsraByRT_AppNo(typeOfApplicant, expiredLicenseAppNumber);
	}
	public List<String> getHsraDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(HsraApplicationTable.INSTANCE.typeOfApplicant)
				.from(HsraApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	
}