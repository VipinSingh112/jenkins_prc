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

package com.nbp.osi.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.osi.application.form.services.exception.NoSuchDetailOfApplicantException;
import com.nbp.osi.application.form.services.exception.NoSuchOfficialUseException;
import com.nbp.osi.application.form.services.model.OfficialUse;
import com.nbp.osi.application.form.services.service.base.OfficialUseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.application.form.services.model.OfficialUse",
	service = AopService.class
)
public class OfficialUseLocalServiceImpl
	extends OfficialUseLocalServiceBaseImpl {
	public OfficialUse getOsiById(long applicationId) throws  NoSuchOfficialUseException {
		return officialUsePersistence.findBygetOsiById(applicationId);
		
	}
}