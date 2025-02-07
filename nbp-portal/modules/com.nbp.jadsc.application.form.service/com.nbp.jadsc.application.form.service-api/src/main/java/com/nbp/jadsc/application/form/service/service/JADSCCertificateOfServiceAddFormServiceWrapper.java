/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCCertificateOfServiceAddFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormService
 * @generated
 */
public class JADSCCertificateOfServiceAddFormServiceWrapper
	implements JADSCCertificateOfServiceAddFormService,
			   ServiceWrapper<JADSCCertificateOfServiceAddFormService> {

	public JADSCCertificateOfServiceAddFormServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfServiceAddFormServiceWrapper(
		JADSCCertificateOfServiceAddFormService
			jadscCertificateOfServiceAddFormService) {

		_jadscCertificateOfServiceAddFormService =
			jadscCertificateOfServiceAddFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfServiceAddFormService.
			getOSGiServiceIdentifier();
	}

	@Override
	public JADSCCertificateOfServiceAddFormService getWrappedService() {
		return _jadscCertificateOfServiceAddFormService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfServiceAddFormService
			jadscCertificateOfServiceAddFormService) {

		_jadscCertificateOfServiceAddFormService =
			jadscCertificateOfServiceAddFormService;
	}

	private JADSCCertificateOfServiceAddFormService
		_jadscCertificateOfServiceAddFormService;

}