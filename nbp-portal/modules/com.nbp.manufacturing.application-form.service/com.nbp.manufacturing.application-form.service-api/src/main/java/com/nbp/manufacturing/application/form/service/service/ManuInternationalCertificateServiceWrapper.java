/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuInternationalCertificateService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificateService
 * @generated
 */
public class ManuInternationalCertificateServiceWrapper
	implements ManuInternationalCertificateService,
			   ServiceWrapper<ManuInternationalCertificateService> {

	public ManuInternationalCertificateServiceWrapper() {
		this(null);
	}

	public ManuInternationalCertificateServiceWrapper(
		ManuInternationalCertificateService
			manuInternationalCertificateService) {

		_manuInternationalCertificateService =
			manuInternationalCertificateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuInternationalCertificateService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuInternationalCertificateService getWrappedService() {
		return _manuInternationalCertificateService;
	}

	@Override
	public void setWrappedService(
		ManuInternationalCertificateService
			manuInternationalCertificateService) {

		_manuInternationalCertificateService =
			manuInternationalCertificateService;
	}

	private ManuInternationalCertificateService
		_manuInternationalCertificateService;

}