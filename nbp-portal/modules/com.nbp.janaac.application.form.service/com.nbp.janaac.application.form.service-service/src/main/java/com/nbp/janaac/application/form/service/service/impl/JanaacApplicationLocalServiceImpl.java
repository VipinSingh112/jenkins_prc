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

package com.nbp.janaac.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.janaac.application.form.service.exception.NoSuchJanaacApplicationException;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.service.base.JanaacApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.janaac.application.form.service.model.JanaacApplication",
	service = AopService.class
)
public class JanaacApplicationLocalServiceImpl
	extends JanaacApplicationLocalServiceBaseImpl {
	public List<JanaacApplication> getJANAAC_ByS_U(long userId,int status) {
		return janaacApplicationPersistence.findBygetJANAAC_ByS_U(userId, status);
	}
	public List<JanaacApplication> getJANAAC_By_status(int status) {
		return janaacApplicationPersistence.findBygetJANAAC_By_Status(status);
	}
	public JanaacApplication getJANAAC_By_app_no(String appNo) throws NoSuchJanaacApplicationException {
		return janaacApplicationPersistence.findBygetJANAAC_By_AppNum(appNo);
	}
	
	public JanaacApplication getJANAAC_ByCaseId(String caseId) throws NoSuchJanaacApplicationException {
		return janaacApplicationPersistence.findBygetJANAAC_ByCaseId(caseId);
	}
}