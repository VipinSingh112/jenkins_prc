/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VerificationCompanyInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationCompanyInfoService
 * @generated
 */
public class VerificationCompanyInfoServiceWrapper
	implements ServiceWrapper<VerificationCompanyInfoService>,
			   VerificationCompanyInfoService {

	public VerificationCompanyInfoServiceWrapper() {
		this(null);
	}

	public VerificationCompanyInfoServiceWrapper(
		VerificationCompanyInfoService verificationCompanyInfoService) {

		_verificationCompanyInfoService = verificationCompanyInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _verificationCompanyInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public VerificationCompanyInfoService getWrappedService() {
		return _verificationCompanyInfoService;
	}

	@Override
	public void setWrappedService(
		VerificationCompanyInfoService verificationCompanyInfoService) {

		_verificationCompanyInfoService = verificationCompanyInfoService;
	}

	private VerificationCompanyInfoService _verificationCompanyInfoService;

}