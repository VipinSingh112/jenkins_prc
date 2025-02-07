/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStageService
 * @generated
 */
public class AcquireCurrentStageServiceWrapper
	implements AcquireCurrentStageService,
			   ServiceWrapper<AcquireCurrentStageService> {

	public AcquireCurrentStageServiceWrapper() {
		this(null);
	}

	public AcquireCurrentStageServiceWrapper(
		AcquireCurrentStageService acquireCurrentStageService) {

		_acquireCurrentStageService = acquireCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireCurrentStageService getWrappedService() {
		return _acquireCurrentStageService;
	}

	@Override
	public void setWrappedService(
		AcquireCurrentStageService acquireCurrentStageService) {

		_acquireCurrentStageService = acquireCurrentStageService;
	}

	private AcquireCurrentStageService _acquireCurrentStageService;

}