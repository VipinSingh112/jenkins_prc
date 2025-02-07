/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WRAAppCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStageService
 * @generated
 */
public class WRAAppCurrentStageServiceWrapper
	implements ServiceWrapper<WRAAppCurrentStageService>,
			   WRAAppCurrentStageService {

	public WRAAppCurrentStageServiceWrapper() {
		this(null);
	}

	public WRAAppCurrentStageServiceWrapper(
		WRAAppCurrentStageService wraAppCurrentStageService) {

		_wraAppCurrentStageService = wraAppCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraAppCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public WRAAppCurrentStageService getWrappedService() {
		return _wraAppCurrentStageService;
	}

	@Override
	public void setWrappedService(
		WRAAppCurrentStageService wraAppCurrentStageService) {

		_wraAppCurrentStageService = wraAppCurrentStageService;
	}

	private WRAAppCurrentStageService _wraAppCurrentStageService;

}