/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeCertificateService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificateService
 * @generated
 */
public class FireBrigadeCertificateServiceWrapper
	implements FireBrigadeCertificateService,
			   ServiceWrapper<FireBrigadeCertificateService> {

	public FireBrigadeCertificateServiceWrapper() {
		this(null);
	}

	public FireBrigadeCertificateServiceWrapper(
		FireBrigadeCertificateService fireBrigadeCertificateService) {

		_fireBrigadeCertificateService = fireBrigadeCertificateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeCertificateService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeCertificateService getWrappedService() {
		return _fireBrigadeCertificateService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeCertificateService fireBrigadeCertificateService) {

		_fireBrigadeCertificateService = fireBrigadeCertificateService;
	}

	private FireBrigadeCertificateService _fireBrigadeCertificateService;

}