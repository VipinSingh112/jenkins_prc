/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WraCertificateIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraCertificateIssuanceService
 * @generated
 */
public class WraCertificateIssuanceServiceWrapper
	implements ServiceWrapper<WraCertificateIssuanceService>,
			   WraCertificateIssuanceService {

	public WraCertificateIssuanceServiceWrapper() {
		this(null);
	}

	public WraCertificateIssuanceServiceWrapper(
		WraCertificateIssuanceService wraCertificateIssuanceService) {

		_wraCertificateIssuanceService = wraCertificateIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraCertificateIssuanceService.getOSGiServiceIdentifier();
	}

	@Override
	public WraCertificateIssuanceService getWrappedService() {
		return _wraCertificateIssuanceService;
	}

	@Override
	public void setWrappedService(
		WraCertificateIssuanceService wraCertificateIssuanceService) {

		_wraCertificateIssuanceService = wraCertificateIssuanceService;
	}

	private WraCertificateIssuanceService _wraCertificateIssuanceService;

}