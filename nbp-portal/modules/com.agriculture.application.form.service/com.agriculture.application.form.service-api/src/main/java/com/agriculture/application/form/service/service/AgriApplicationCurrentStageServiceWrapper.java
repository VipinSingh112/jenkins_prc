/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgriApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStageService
 * @generated
 */
public class AgriApplicationCurrentStageServiceWrapper
	implements AgriApplicationCurrentStageService,
			   ServiceWrapper<AgriApplicationCurrentStageService> {

	public AgriApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public AgriApplicationCurrentStageServiceWrapper(
		AgriApplicationCurrentStageService agriApplicationCurrentStageService) {

		_agriApplicationCurrentStageService =
			agriApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriApplicationCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public AgriApplicationCurrentStageService getWrappedService() {
		return _agriApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		AgriApplicationCurrentStageService agriApplicationCurrentStageService) {

		_agriApplicationCurrentStageService =
			agriApplicationCurrentStageService;
	}

	private AgriApplicationCurrentStageService
		_agriApplicationCurrentStageService;

}