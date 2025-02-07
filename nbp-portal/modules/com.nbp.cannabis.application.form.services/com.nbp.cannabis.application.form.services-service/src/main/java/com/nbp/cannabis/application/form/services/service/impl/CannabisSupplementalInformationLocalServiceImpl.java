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
import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;
import com.nbp.cannabis.application.form.services.service.base.CannabisSupplementalInformationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation",
	service = AopService.class
)
public class CannabisSupplementalInformationLocalServiceImpl
	extends CannabisSupplementalInformationLocalServiceBaseImpl {
	
	public List<CannabisSupplementalInformation> getCA_SI_CAI(long cannabisAppicationId){
		return cannabisSupplementalInformationPersistence.findBygetCA_SI_CAI(cannabisAppicationId);
	}
	public void deleteCA_SI_CAI(long cannabisApplicationId){
		 cannabisSupplementalInformationPersistence.removeBygetCA_SI_CAI(cannabisApplicationId);
	}
}