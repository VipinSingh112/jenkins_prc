/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStageService
 * @generated
 */
public class OgtApplicationStageServiceWrapper
	implements OgtApplicationStageService,
			   ServiceWrapper<OgtApplicationStageService> {

	public OgtApplicationStageServiceWrapper() {
		this(null);
	}

	public OgtApplicationStageServiceWrapper(
		OgtApplicationStageService ogtApplicationStageService) {

		_ogtApplicationStageService = ogtApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtApplicationStageService getWrappedService() {
		return _ogtApplicationStageService;
	}

	@Override
	public void setWrappedService(
		OgtApplicationStageService ogtApplicationStageService) {

		_ogtApplicationStageService = ogtApplicationStageService;
	}

	private OgtApplicationStageService _ogtApplicationStageService;

}