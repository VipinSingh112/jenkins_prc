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

package com.nbp.ncra.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.ncra.application.form.service.exception.NoSuchNcraVerifyWeighingDeviceInfoException;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.base.NcraVerifyWeighingDeviceInfoLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo",
	service = AopService.class
)
public class NcraVerifyWeighingDeviceInfoLocalServiceImpl
	extends NcraVerifyWeighingDeviceInfoLocalServiceBaseImpl {
	public NcraVerifyWeighingDeviceInfo getNcraVerify_By_NCRA_Id(long ncraApplicationId) throws NoSuchNcraVerifyWeighingDeviceInfoException {
		return ncraVerifyWeighingDeviceInfoPersistence.findBygetNcraVerify_By_NCRA_Id(ncraApplicationId);
	}
	public List<NcraVerifyWeighingDeviceInfo> getNcraVerify_By_DataList(long ncraApplicationId) {
		return ncraVerifyWeighingDeviceInfoPersistence.findBygetNcraVerify_By_DataList(ncraApplicationId);
	}
}