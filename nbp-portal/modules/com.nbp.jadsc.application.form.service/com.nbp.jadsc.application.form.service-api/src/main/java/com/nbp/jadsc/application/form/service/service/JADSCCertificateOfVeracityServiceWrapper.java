/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCCertificateOfVeracityService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracityService
 * @generated
 */
public class JADSCCertificateOfVeracityServiceWrapper
	implements JADSCCertificateOfVeracityService,
			   ServiceWrapper<JADSCCertificateOfVeracityService> {

	public JADSCCertificateOfVeracityServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfVeracityServiceWrapper(
		JADSCCertificateOfVeracityService jadscCertificateOfVeracityService) {

		_jadscCertificateOfVeracityService = jadscCertificateOfVeracityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfVeracityService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCCertificateOfVeracityService getWrappedService() {
		return _jadscCertificateOfVeracityService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfVeracityService jadscCertificateOfVeracityService) {

		_jadscCertificateOfVeracityService = jadscCertificateOfVeracityService;
	}

	private JADSCCertificateOfVeracityService
		_jadscCertificateOfVeracityService;

}