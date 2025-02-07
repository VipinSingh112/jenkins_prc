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

package com.nbp.ncbj.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailGenException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.service.base.NcbjCompanyDetailGenLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen",
	service = AopService.class
)
public class NcbjCompanyDetailGenLocalServiceImpl
	extends NcbjCompanyDetailGenLocalServiceBaseImpl {
	public NcbjCompanyDetailGen getNCBJByAppId(long ncbjApplicationId) throws NoSuchNcbjCompanyDetailGenException {
		return ncbjCompanyDetailGenPersistence.findBygetNCBJ_ById(ncbjApplicationId);
		
	}
	public List<NcbjCompanyDetailGen> getNCBJListByAppId(long ncbjApplicationId){
		return ncbjCompanyDetailGenPersistence.findByget_NCBJ_ListBy_AppId(ncbjApplicationId);
		
	}
	
}