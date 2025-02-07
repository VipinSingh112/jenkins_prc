/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireValuationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationService
 * @generated
 */
public class AcquireValuationServiceWrapper
	implements AcquireValuationService,
			   ServiceWrapper<AcquireValuationService> {

	public AcquireValuationServiceWrapper() {
		this(null);
	}

	public AcquireValuationServiceWrapper(
		AcquireValuationService acquireValuationService) {

		_acquireValuationService = acquireValuationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireValuationService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireValuationService getWrappedService() {
		return _acquireValuationService;
	}

	@Override
	public void setWrappedService(
		AcquireValuationService acquireValuationService) {

		_acquireValuationService = acquireValuationService;
	}

	private AcquireValuationService _acquireValuationService;

}