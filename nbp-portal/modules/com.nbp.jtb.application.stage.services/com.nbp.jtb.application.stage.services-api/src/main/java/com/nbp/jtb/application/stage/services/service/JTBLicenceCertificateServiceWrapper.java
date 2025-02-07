/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTBLicenceCertificateService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBLicenceCertificateService
 * @generated
 */
public class JTBLicenceCertificateServiceWrapper
	implements JTBLicenceCertificateService,
			   ServiceWrapper<JTBLicenceCertificateService> {

	public JTBLicenceCertificateServiceWrapper() {
		this(null);
	}

	public JTBLicenceCertificateServiceWrapper(
		JTBLicenceCertificateService jtbLicenceCertificateService) {

		_jtbLicenceCertificateService = jtbLicenceCertificateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbLicenceCertificateService.getOSGiServiceIdentifier();
	}

	@Override
	public JTBLicenceCertificateService getWrappedService() {
		return _jtbLicenceCertificateService;
	}

	@Override
	public void setWrappedService(
		JTBLicenceCertificateService jtbLicenceCertificateService) {

		_jtbLicenceCertificateService = jtbLicenceCertificateService;
	}

	private JTBLicenceCertificateService _jtbLicenceCertificateService;

}