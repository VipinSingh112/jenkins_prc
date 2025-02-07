/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStageService
 * @generated
 */
public class QuarryApplicationStageServiceWrapper
	implements QuarryApplicationStageService,
			   ServiceWrapper<QuarryApplicationStageService> {

	public QuarryApplicationStageServiceWrapper() {
		this(null);
	}

	public QuarryApplicationStageServiceWrapper(
		QuarryApplicationStageService quarryApplicationStageService) {

		_quarryApplicationStageService = quarryApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryApplicationStageService getWrappedService() {
		return _quarryApplicationStageService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationStageService quarryApplicationStageService) {

		_quarryApplicationStageService = quarryApplicationStageService;
	}

	private QuarryApplicationStageService _quarryApplicationStageService;

}