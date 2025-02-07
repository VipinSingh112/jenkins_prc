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
import com.nbp.ncra.application.form.service.exception.NoSuchNcraCurrentStageException;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;
import com.nbp.ncra.application.form.service.service.base.NcraCurrentStageLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncra.application.form.service.model.NcraCurrentStage",
	service = AopService.class
)
public class NcraCurrentStageLocalServiceImpl
	extends NcraCurrentStageLocalServiceBaseImpl {
	public NcraCurrentStage getNcraCurrent_By_NCRA_Id(long ncraApplicationId) throws NoSuchNcraCurrentStageException {
		return ncraCurrentStagePersistence.findBygetNcraCurrent_By_NCRA_Id(ncraApplicationId);
	}
	public List<NcraCurrentStage> getNCRA_CS_NAI(long ncraApplicationId) {
		return ncraCurrentStagePersistence.findBygetNCRA_CS_NAI(ncraApplicationId);
	}
}