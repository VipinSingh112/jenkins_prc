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

package com.nbp.wra.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.base.WRAReqIrrigationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.application.form.service.model.WRAReqIrrigation",
	service = AopService.class
)
public class WRAReqIrrigationLocalServiceImpl
	extends WRAReqIrrigationLocalServiceBaseImpl {
	public List<WRAReqIrrigation> getWaterRequired_BY_AppId(long wraApplicationId){
		return wraReqIrrigationPersistence.findBygetWRA_By_AppId(wraApplicationId);
		
	}
	public List<WRAReqIrrigation> getWRA_By_CtrAppId(long wraApplicationId, OrderByComparator<WRAReqIrrigation> orderByComparator){
		return wraReqIrrigationPersistence.findBygetWRA_By_CtrAppId(wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);
	}
	
	
	@Override
	public List<WRAReqIrrigation> getWRA_By_Id(long wraApplicationId) {
		return null;
		// TODO Auto-generated method stub
		//return wraReqIrrigationPersistence.findBygetWRA_By_AppId(wraApplicationId);
	}
}