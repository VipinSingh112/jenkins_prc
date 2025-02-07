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

package com.nbp.sez.status.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.service.base.SezZoneGeneralBussinessAddressLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress",
	service = AopService.class
)
public class SezZoneGeneralBussinessAddressLocalServiceImpl
	extends SezZoneGeneralBussinessAddressLocalServiceBaseImpl {
	public SezZoneGeneralBussinessAddress getSezStatusBy_Id(long sezApplicationId) throws NoSuchSezZoneGeneralBussinessAddressException {
		return sezZoneGeneralBussinessAddressPersistence.findBygetSezStatusByAppId(sezApplicationId);
	}
	public SezZoneGeneralBussinessAddress getSezStatusBy_AT_SAI(long sezApplicationId,String addressType) throws NoSuchSezZoneGeneralBussinessAddressException {
		return sezZoneGeneralBussinessAddressPersistence.findBygetSezStatusByAddressType_SAI(sezApplicationId, addressType);
	}
	public SezZoneGeneralBussinessAddress getSezStatusBy_AT_GBI(long generalBussinessId,String addressType) throws NoSuchSezZoneGeneralBussinessAddressException {
		return sezZoneGeneralBussinessAddressPersistence.findBygetSezStatusByAddressType_GBI(generalBussinessId, addressType);
	}
}