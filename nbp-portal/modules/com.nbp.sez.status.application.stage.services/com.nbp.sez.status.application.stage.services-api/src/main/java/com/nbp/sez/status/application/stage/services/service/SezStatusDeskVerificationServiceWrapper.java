/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerificationService
 * @generated
 */
public class SezStatusDeskVerificationServiceWrapper
	implements ServiceWrapper<SezStatusDeskVerificationService>,
			   SezStatusDeskVerificationService {

	public SezStatusDeskVerificationServiceWrapper() {
		this(null);
	}

	public SezStatusDeskVerificationServiceWrapper(
		SezStatusDeskVerificationService sezStatusDeskVerificationService) {

		_sezStatusDeskVerificationService = sezStatusDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusDeskVerificationService getWrappedService() {
		return _sezStatusDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		SezStatusDeskVerificationService sezStatusDeskVerificationService) {

		_sezStatusDeskVerificationService = sezStatusDeskVerificationService;
	}

	private SezStatusDeskVerificationService _sezStatusDeskVerificationService;

}