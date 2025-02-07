/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquirePropertyDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsService
 * @generated
 */
public class AcquirePropertyDetailsServiceWrapper
	implements AcquirePropertyDetailsService,
			   ServiceWrapper<AcquirePropertyDetailsService> {

	public AcquirePropertyDetailsServiceWrapper() {
		this(null);
	}

	public AcquirePropertyDetailsServiceWrapper(
		AcquirePropertyDetailsService acquirePropertyDetailsService) {

		_acquirePropertyDetailsService = acquirePropertyDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePropertyDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquirePropertyDetailsService getWrappedService() {
		return _acquirePropertyDetailsService;
	}

	@Override
	public void setWrappedService(
		AcquirePropertyDetailsService acquirePropertyDetailsService) {

		_acquirePropertyDetailsService = acquirePropertyDetailsService;
	}

	private AcquirePropertyDetailsService _acquirePropertyDetailsService;

}