/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligenceService
 * @generated
 */
public class CannabisApplicationDueDiligenceServiceWrapper
	implements CannabisApplicationDueDiligenceService,
			   ServiceWrapper<CannabisApplicationDueDiligenceService> {

	public CannabisApplicationDueDiligenceServiceWrapper() {
		this(null);
	}

	public CannabisApplicationDueDiligenceServiceWrapper(
		CannabisApplicationDueDiligenceService
			cannabisApplicationDueDiligenceService) {

		_cannabisApplicationDueDiligenceService =
			cannabisApplicationDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationDueDiligenceService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationDueDiligenceService getWrappedService() {
		return _cannabisApplicationDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationDueDiligenceService
			cannabisApplicationDueDiligenceService) {

		_cannabisApplicationDueDiligenceService =
			cannabisApplicationDueDiligenceService;
	}

	private CannabisApplicationDueDiligenceService
		_cannabisApplicationDueDiligenceService;

}