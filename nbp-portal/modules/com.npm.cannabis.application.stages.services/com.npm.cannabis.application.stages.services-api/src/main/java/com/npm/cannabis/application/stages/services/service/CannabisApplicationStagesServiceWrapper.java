/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesService
 * @generated
 */
public class CannabisApplicationStagesServiceWrapper
	implements CannabisApplicationStagesService,
			   ServiceWrapper<CannabisApplicationStagesService> {

	public CannabisApplicationStagesServiceWrapper() {
		this(null);
	}

	public CannabisApplicationStagesServiceWrapper(
		CannabisApplicationStagesService cannabisApplicationStagesService) {

		_cannabisApplicationStagesService = cannabisApplicationStagesService;
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCannabisApplicationStages(
					String caseId)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesService.getCannabisApplicationStages(
			caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages updateCannabisApplicationStages(
					String caseId, String stageName,
					java.util.Date stageStartDate, java.util.Date stageEndDate,
					String duration, String stageStatus)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesService.
			updateCannabisApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public CannabisApplicationStagesService getWrappedService() {
		return _cannabisApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationStagesService cannabisApplicationStagesService) {

		_cannabisApplicationStagesService = cannabisApplicationStagesService;
	}

	private CannabisApplicationStagesService _cannabisApplicationStagesService;

}