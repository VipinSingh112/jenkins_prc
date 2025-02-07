/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStageService
 * @generated
 */
public class OsiCurrentStageServiceWrapper
	implements OsiCurrentStageService, ServiceWrapper<OsiCurrentStageService> {

	public OsiCurrentStageServiceWrapper() {
		this(null);
	}

	public OsiCurrentStageServiceWrapper(
		OsiCurrentStageService osiCurrentStageService) {

		_osiCurrentStageService = osiCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiCurrentStageService getWrappedService() {
		return _osiCurrentStageService;
	}

	@Override
	public void setWrappedService(
		OsiCurrentStageService osiCurrentStageService) {

		_osiCurrentStageService = osiCurrentStageService;
	}

	private OsiCurrentStageService _osiCurrentStageService;

}