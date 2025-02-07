/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCurrentStageService
 * @generated
 */
public class CannabisApplicationCurrentStageServiceWrapper
	implements CannabisApplicationCurrentStageService,
			   ServiceWrapper<CannabisApplicationCurrentStageService> {

	public CannabisApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCurrentStageServiceWrapper(
		CannabisApplicationCurrentStageService
			cannabisApplicationCurrentStageService) {

		_cannabisApplicationCurrentStageService =
			cannabisApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCurrentStageService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationCurrentStageService getWrappedService() {
		return _cannabisApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCurrentStageService
			cannabisApplicationCurrentStageService) {

		_cannabisApplicationCurrentStageService =
			cannabisApplicationCurrentStageService;
	}

	private CannabisApplicationCurrentStageService
		_cannabisApplicationCurrentStageService;

}