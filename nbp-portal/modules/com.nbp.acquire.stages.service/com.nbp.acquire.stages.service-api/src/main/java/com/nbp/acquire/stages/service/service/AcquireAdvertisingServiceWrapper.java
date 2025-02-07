/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireAdvertisingService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertisingService
 * @generated
 */
public class AcquireAdvertisingServiceWrapper
	implements AcquireAdvertisingService,
			   ServiceWrapper<AcquireAdvertisingService> {

	public AcquireAdvertisingServiceWrapper() {
		this(null);
	}

	public AcquireAdvertisingServiceWrapper(
		AcquireAdvertisingService acquireAdvertisingService) {

		_acquireAdvertisingService = acquireAdvertisingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireAdvertisingService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireAdvertisingService getWrappedService() {
		return _acquireAdvertisingService;
	}

	@Override
	public void setWrappedService(
		AcquireAdvertisingService acquireAdvertisingService) {

		_acquireAdvertisingService = acquireAdvertisingService;
	}

	private AcquireAdvertisingService _acquireAdvertisingService;

}