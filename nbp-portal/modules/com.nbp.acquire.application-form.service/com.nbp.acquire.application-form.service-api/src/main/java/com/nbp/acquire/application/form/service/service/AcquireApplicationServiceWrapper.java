/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationService
 * @generated
 */
public class AcquireApplicationServiceWrapper
	implements AcquireApplicationService,
			   ServiceWrapper<AcquireApplicationService> {

	public AcquireApplicationServiceWrapper() {
		this(null);
	}

	public AcquireApplicationServiceWrapper(
		AcquireApplicationService acquireApplicationService) {

		_acquireApplicationService = acquireApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireApplicationService getWrappedService() {
		return _acquireApplicationService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationService acquireApplicationService) {

		_acquireApplicationService = acquireApplicationService;
	}

	private AcquireApplicationService _acquireApplicationService;

}