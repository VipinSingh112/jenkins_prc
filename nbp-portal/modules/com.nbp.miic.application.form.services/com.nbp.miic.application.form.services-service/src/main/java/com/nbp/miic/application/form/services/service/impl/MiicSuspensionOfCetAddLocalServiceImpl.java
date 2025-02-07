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

package com.nbp.miic.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.service.base.MiicSuspensionOfCetAddLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd", service = AopService.class)
public class MiicSuspensionOfCetAddLocalServiceImpl extends MiicSuspensionOfCetAddLocalServiceBaseImpl {
	public List<MiicSuspensionOfCetAdd> getMiicById(long applicationId) {
		return miicSuspensionOfCetAddPersistence.findBygetMiicById(applicationId);
	}
}