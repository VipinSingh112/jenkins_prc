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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationStagesException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;
import com.npm.cannabis.application.stages.services.service.base.CannabisApplicationStagesServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=cannabis_stages",
		"json.web.service.context.path=CannabisApplicationStages"
	},
	service = AopService.class
)
public class CannabisApplicationStagesServiceImpl
	extends CannabisApplicationStagesServiceBaseImpl {
	
	public List<CannabisApplicationStages> getCannabisApplicationStages(final String caseId) throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesLocalService.getCannabisApplicationStages(caseId);
}
	
	public CannabisApplicationStages updateCannabisApplicationStages(final String caseId,final String stageName, final Date stageStartDate,final Date stageEndDate, final String duration,final String stageStatus) throws NoSuchCannabisApplicationStagesException {
		
		return cannabisApplicationStagesLocalService.updateCannabisApplicationStages(caseId, stageName, stageStartDate, stageEndDate, duration, stageStatus);
	}
}