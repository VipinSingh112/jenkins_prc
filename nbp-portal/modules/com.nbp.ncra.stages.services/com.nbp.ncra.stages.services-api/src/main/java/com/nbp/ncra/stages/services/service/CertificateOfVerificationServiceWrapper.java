/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CertificateOfVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationService
 * @generated
 */
public class CertificateOfVerificationServiceWrapper
	implements CertificateOfVerificationService,
			   ServiceWrapper<CertificateOfVerificationService> {

	public CertificateOfVerificationServiceWrapper() {
		this(null);
	}

	public CertificateOfVerificationServiceWrapper(
		CertificateOfVerificationService certificateOfVerificationService) {

		_certificateOfVerificationService = certificateOfVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _certificateOfVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public CertificateOfVerificationService getWrappedService() {
		return _certificateOfVerificationService;
	}

	@Override
	public void setWrappedService(
		CertificateOfVerificationService certificateOfVerificationService) {

		_certificateOfVerificationService = certificateOfVerificationService;
	}

	private CertificateOfVerificationService _certificateOfVerificationService;

}