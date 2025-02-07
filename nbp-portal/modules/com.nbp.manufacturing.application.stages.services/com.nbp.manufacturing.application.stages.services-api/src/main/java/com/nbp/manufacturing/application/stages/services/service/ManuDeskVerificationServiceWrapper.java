/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationService
 * @generated
 */
public class ManuDeskVerificationServiceWrapper
	implements ManuDeskVerificationService,
			   ServiceWrapper<ManuDeskVerificationService> {

	public ManuDeskVerificationServiceWrapper() {
		this(null);
	}

	public ManuDeskVerificationServiceWrapper(
		ManuDeskVerificationService manuDeskVerificationService) {

		_manuDeskVerificationService = manuDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuDeskVerificationService getWrappedService() {
		return _manuDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		ManuDeskVerificationService manuDeskVerificationService) {

		_manuDeskVerificationService = manuDeskVerificationService;
	}

	private ManuDeskVerificationService _manuDeskVerificationService;

}