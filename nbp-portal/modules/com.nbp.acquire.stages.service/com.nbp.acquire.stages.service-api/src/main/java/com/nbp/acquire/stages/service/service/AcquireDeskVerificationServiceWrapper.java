/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerificationService
 * @generated
 */
public class AcquireDeskVerificationServiceWrapper
	implements AcquireDeskVerificationService,
			   ServiceWrapper<AcquireDeskVerificationService> {

	public AcquireDeskVerificationServiceWrapper() {
		this(null);
	}

	public AcquireDeskVerificationServiceWrapper(
		AcquireDeskVerificationService acquireDeskVerificationService) {

		_acquireDeskVerificationService = acquireDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireDeskVerificationService getWrappedService() {
		return _acquireDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		AcquireDeskVerificationService acquireDeskVerificationService) {

		_acquireDeskVerificationService = acquireDeskVerificationService;
	}

	private AcquireDeskVerificationService _acquireDeskVerificationService;

}