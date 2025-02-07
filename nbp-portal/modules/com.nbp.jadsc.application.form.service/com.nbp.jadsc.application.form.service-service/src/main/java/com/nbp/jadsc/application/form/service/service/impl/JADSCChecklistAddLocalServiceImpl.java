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

package com.nbp.jadsc.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCChecklistAddException;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.service.base.JADSCChecklistAddLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd",
	service = AopService.class
)
public class JADSCChecklistAddLocalServiceImpl
	extends JADSCChecklistAddLocalServiceBaseImpl {
	public List<JADSCChecklistAdd> getJadsc_byAppId(long jadscApplicationId){
		return jadscChecklistAddPersistence.findBygetJADSCById(jadscApplicationId);
		
	}

	@Override
	public JADSCChecklistAdd getJadscByAppId(long jadscApplicationId) throws NoSuchJADSCChecklistAddException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<JADSCChecklistAdd> getAppIdJADSC(long jadscApplicationId){
		return jadscChecklistAddPersistence.findBygetAppIdJADSC(jadscApplicationId);
		
	}
}
