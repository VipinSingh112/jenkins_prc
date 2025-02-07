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

package com.nbp.tourism.application.form.services.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationException;
import com.nbp.tourism.application.form.services.model.TourismApplication;
import com.nbp.tourism.application.form.services.model.TourismApplicationTable;
import com.nbp.tourism.application.form.services.service.base.TourismApplicationLocalServiceBaseImpl;
import java.util.List;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.tourism.application.form.services.model.TourismApplication",
	service = AopService.class
)
public class TourismApplicationLocalServiceImpl
	extends TourismApplicationLocalServiceBaseImpl {
	public List<TourismApplication> getTourismApplicationByS_U(long userId,int status){
		return tourismApplicationPersistence.findBygetTourismApplicationByStatusUser(status, userId);
	}
	public List<TourismApplication> getTourismByStatus(int status){
		return tourismApplicationPersistence.findBygetTourismByStatus(status);
	}
	
	public TourismApplication getTourismByAppNo(String applicationNumber) throws NoSuchTourismApplicationException {
		return tourismApplicationPersistence.findBygetTourismByAppNo(applicationNumber);
		
	}
	public TourismApplication getTourismBy_CI(String caseId) throws NoSuchTourismApplicationException {
		return tourismApplicationPersistence.findBygetTourismByCaseId(caseId);
		
	}
	public List<String> getTourismDistinctCategories(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(TourismApplicationTable.INSTANCE.requestType).from(TourismApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	
}