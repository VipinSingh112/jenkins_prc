/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireTenderingService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTenderingService
 * @generated
 */
public class AcquireTenderingServiceWrapper
	implements AcquireTenderingService,
			   ServiceWrapper<AcquireTenderingService> {

	public AcquireTenderingServiceWrapper() {
		this(null);
	}

	public AcquireTenderingServiceWrapper(
		AcquireTenderingService acquireTenderingService) {

		_acquireTenderingService = acquireTenderingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireTenderingService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireTenderingService getWrappedService() {
		return _acquireTenderingService;
	}

	@Override
	public void setWrappedService(
		AcquireTenderingService acquireTenderingService) {

		_acquireTenderingService = acquireTenderingService;
	}

	private AcquireTenderingService _acquireTenderingService;

}