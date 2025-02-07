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

package com.nbp.creative.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.creative.application.form.service.exception.NoSuchCreativeApplicationException;
import com.nbp.creative.application.form.service.model.CreativeApplication;
import com.nbp.creative.application.form.service.model.CreativeApplicationTable;
import com.nbp.creative.application.form.service.service.base.CreativeApplicationLocalServiceBaseImpl;
import java.util.List;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.creative.application.form.service.model.CreativeApplication",
	service = AopService.class
)
public class CreativeApplicationLocalServiceImpl
	extends CreativeApplicationLocalServiceBaseImpl {
	public List<CreativeApplication> getCreativeByS_U(int status, long userId) {
		return creativeApplicationPersistence.findBygetCreativeApplicationByStatusUser(status, userId);
	}
 
	public List<CreativeApplication> getCreativeByStatus(int status){
		return creativeApplicationPersistence.findBygetCreativeByStatus(status);
	}
    public CreativeApplication getCreativeByAppNo(String applicationNumber) throws NoSuchCreativeApplicationException {
		return creativeApplicationPersistence.findBygetCreativeByAppNo(applicationNumber);
    }
	public CreativeApplication findBygetCreativeById(long creativeApplicationId) {
		return creativeApplicationPersistence.fetchBygetCreativeById(creativeApplicationId);
	}
	public CreativeApplication findBygetCreativeByCaseId(String caseId) throws NoSuchCreativeApplicationException {
		return creativeApplicationPersistence.findBygetCreativeBy_CI(caseId);
	}
	public List<String> getCreativeeDistinctCategory(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(CreativeApplicationTable.INSTANCE.entertainerType).from(CreativeApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}