/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServiceCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStageService
 * @generated
 */
public class OSIServiceCurrentStageServiceWrapper
	implements OSIServiceCurrentStageService,
			   ServiceWrapper<OSIServiceCurrentStageService> {

	public OSIServiceCurrentStageServiceWrapper() {
		this(null);
	}

	public OSIServiceCurrentStageServiceWrapper(
		OSIServiceCurrentStageService osiServiceCurrentStageService) {

		_osiServiceCurrentStageService = osiServiceCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServiceCurrentStageService getWrappedService() {
		return _osiServiceCurrentStageService;
	}

	@Override
	public void setWrappedService(
		OSIServiceCurrentStageService osiServiceCurrentStageService) {

		_osiServiceCurrentStageService = osiServiceCurrentStageService;
	}

	private OSIServiceCurrentStageService _osiServiceCurrentStageService;

}