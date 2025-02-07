/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireLandPropertyDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetailsService
 * @generated
 */
public class AcquireLandPropertyDetailsServiceWrapper
	implements AcquireLandPropertyDetailsService,
			   ServiceWrapper<AcquireLandPropertyDetailsService> {

	public AcquireLandPropertyDetailsServiceWrapper() {
		this(null);
	}

	public AcquireLandPropertyDetailsServiceWrapper(
		AcquireLandPropertyDetailsService acquireLandPropertyDetailsService) {

		_acquireLandPropertyDetailsService = acquireLandPropertyDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandPropertyDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireLandPropertyDetailsService getWrappedService() {
		return _acquireLandPropertyDetailsService;
	}

	@Override
	public void setWrappedService(
		AcquireLandPropertyDetailsService acquireLandPropertyDetailsService) {

		_acquireLandPropertyDetailsService = acquireLandPropertyDetailsService;
	}

	private AcquireLandPropertyDetailsService
		_acquireLandPropertyDetailsService;

}