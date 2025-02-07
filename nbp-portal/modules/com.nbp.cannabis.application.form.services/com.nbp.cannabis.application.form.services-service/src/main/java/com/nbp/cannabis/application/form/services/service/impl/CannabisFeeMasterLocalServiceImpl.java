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

import com.liferay.portal.aop.AopService;
import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisFeeMasterException;
import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;
import com.nbp.cannabis.application.form.services.service.base.CannabisFeeMasterLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisFeeMaster",
	service = AopService.class
)
public class CannabisFeeMasterLocalServiceImpl
	extends CannabisFeeMasterLocalServiceBaseImpl {
	
	public CannabisFeeMaster getFeeByCategoryAndSubCategory(String category,String subCategory) throws NoSuchCannabisFeeMasterException {
		
		return cannabisFeeMasterPersistence.findBygetFee_by_CS(category, subCategory);
		
	}
}