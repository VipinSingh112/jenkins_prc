/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireLandEmploymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmploymentService
 * @generated
 */
public class AcquireLandEmploymentServiceWrapper
	implements AcquireLandEmploymentService,
			   ServiceWrapper<AcquireLandEmploymentService> {

	public AcquireLandEmploymentServiceWrapper() {
		this(null);
	}

	public AcquireLandEmploymentServiceWrapper(
		AcquireLandEmploymentService acquireLandEmploymentService) {

		_acquireLandEmploymentService = acquireLandEmploymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandEmploymentService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireLandEmploymentService getWrappedService() {
		return _acquireLandEmploymentService;
	}

	@Override
	public void setWrappedService(
		AcquireLandEmploymentService acquireLandEmploymentService) {

		_acquireLandEmploymentService = acquireLandEmploymentService;
	}

	private AcquireLandEmploymentService _acquireLandEmploymentService;

}