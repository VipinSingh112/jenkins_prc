/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VerificationRequestorsInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfoService
 * @generated
 */
public class VerificationRequestorsInfoServiceWrapper
	implements ServiceWrapper<VerificationRequestorsInfoService>,
			   VerificationRequestorsInfoService {

	public VerificationRequestorsInfoServiceWrapper() {
		this(null);
	}

	public VerificationRequestorsInfoServiceWrapper(
		VerificationRequestorsInfoService verificationRequestorsInfoService) {

		_verificationRequestorsInfoService = verificationRequestorsInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _verificationRequestorsInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public VerificationRequestorsInfoService getWrappedService() {
		return _verificationRequestorsInfoService;
	}

	@Override
	public void setWrappedService(
		VerificationRequestorsInfoService verificationRequestorsInfoService) {

		_verificationRequestorsInfoService = verificationRequestorsInfoService;
	}

	private VerificationRequestorsInfoService
		_verificationRequestorsInfoService;

}