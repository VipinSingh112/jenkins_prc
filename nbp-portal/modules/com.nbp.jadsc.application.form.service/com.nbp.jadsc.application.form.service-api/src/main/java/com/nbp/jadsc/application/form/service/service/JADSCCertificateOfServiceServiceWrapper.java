/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCCertificateOfServiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceService
 * @generated
 */
public class JADSCCertificateOfServiceServiceWrapper
	implements JADSCCertificateOfServiceService,
			   ServiceWrapper<JADSCCertificateOfServiceService> {

	public JADSCCertificateOfServiceServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfServiceServiceWrapper(
		JADSCCertificateOfServiceService jadscCertificateOfServiceService) {

		_jadscCertificateOfServiceService = jadscCertificateOfServiceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfServiceService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCCertificateOfServiceService getWrappedService() {
		return _jadscCertificateOfServiceService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfServiceService jadscCertificateOfServiceService) {

		_jadscCertificateOfServiceService = jadscCertificateOfServiceService;
	}

	private JADSCCertificateOfServiceService _jadscCertificateOfServiceService;

}