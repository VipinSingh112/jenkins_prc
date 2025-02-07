/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationCurrentStageService
 * @generated
 */
public class HsraApplicationCurrentStageServiceWrapper
	implements HsraApplicationCurrentStageService,
			   ServiceWrapper<HsraApplicationCurrentStageService> {

	public HsraApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public HsraApplicationCurrentStageServiceWrapper(
		HsraApplicationCurrentStageService hsraApplicationCurrentStageService) {

		_hsraApplicationCurrentStageService =
			hsraApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraApplicationCurrentStageService getWrappedService() {
		return _hsraApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationCurrentStageService hsraApplicationCurrentStageService) {

		_hsraApplicationCurrentStageService =
			hsraApplicationCurrentStageService;
	}

	private HsraApplicationCurrentStageService
		_hsraApplicationCurrentStageService;

}