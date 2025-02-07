/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OGTAppCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStageService
 * @generated
 */
public class OGTAppCurrentStageServiceWrapper
	implements OGTAppCurrentStageService,
			   ServiceWrapper<OGTAppCurrentStageService> {

	public OGTAppCurrentStageServiceWrapper() {
		this(null);
	}

	public OGTAppCurrentStageServiceWrapper(
		OGTAppCurrentStageService ogtAppCurrentStageService) {

		_ogtAppCurrentStageService = ogtAppCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtAppCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public OGTAppCurrentStageService getWrappedService() {
		return _ogtAppCurrentStageService;
	}

	@Override
	public void setWrappedService(
		OGTAppCurrentStageService ogtAppCurrentStageService) {

		_ogtAppCurrentStageService = ogtAppCurrentStageService;
	}

	private OGTAppCurrentStageService _ogtAppCurrentStageService;

}