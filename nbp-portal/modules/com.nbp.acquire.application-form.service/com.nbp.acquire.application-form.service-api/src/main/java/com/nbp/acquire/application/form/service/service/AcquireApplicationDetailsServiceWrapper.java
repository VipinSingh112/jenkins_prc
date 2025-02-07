/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireApplicationDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsService
 * @generated
 */
public class AcquireApplicationDetailsServiceWrapper
	implements AcquireApplicationDetailsService,
			   ServiceWrapper<AcquireApplicationDetailsService> {

	public AcquireApplicationDetailsServiceWrapper() {
		this(null);
	}

	public AcquireApplicationDetailsServiceWrapper(
		AcquireApplicationDetailsService acquireApplicationDetailsService) {

		_acquireApplicationDetailsService = acquireApplicationDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireApplicationDetailsService getWrappedService() {
		return _acquireApplicationDetailsService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationDetailsService acquireApplicationDetailsService) {

		_acquireApplicationDetailsService = acquireApplicationDetailsService;
	}

	private AcquireApplicationDetailsService _acquireApplicationDetailsService;

}