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
import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;
import com.nbp.cannabis.application.form.services.service.base.CannabisDeclarationOfOwnershipLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership",
	service = AopService.class
)
public class CannabisDeclarationOfOwnershipLocalServiceImpl
	extends CannabisDeclarationOfOwnershipLocalServiceBaseImpl {
	
	public List<CannabisDeclarationOfOwnership> getCA_DO_CAI(long cannabisAppicationId){
		return cannabisDeclarationOfOwnershipPersistence.findBygetCA_DO_CAI(cannabisAppicationId);
	}
	
	public void deleteCA_DO_CAI(long cannabisAppicationId) {
		cannabisDeclarationOfOwnershipPersistence.removeBygetCA_DO_CAI(cannabisAppicationId);
	}
	public void deleteCA_DO_BY_Id(long cannabisId) {
		cannabisDeclarationOfOwnershipPersistence.removeBygetCA_DO_CAI(cannabisId);
	}
}