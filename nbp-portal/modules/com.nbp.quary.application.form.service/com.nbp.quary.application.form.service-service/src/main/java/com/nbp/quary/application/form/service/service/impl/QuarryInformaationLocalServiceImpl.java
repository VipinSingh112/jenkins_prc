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

package com.nbp.quary.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.quary.application.form.service.exception.NoSuchQuarryInformaationException;
import com.nbp.quary.application.form.service.model.QuarryInformaation;
import com.nbp.quary.application.form.service.service.base.QuarryInformaationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.quary.application.form.service.model.QuarryInformaation",
	service = AopService.class
)
public class QuarryInformaationLocalServiceImpl
	extends QuarryInformaationLocalServiceBaseImpl {
	public QuarryInformaation getQuarryInformaationBy_Id(long quarryAppId) throws NoSuchQuarryInformaationException  {
		return quarryInformaationPersistence.findBygetQuarry_ById(quarryAppId);
	}
}