/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireLandApplicantDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetailsService
 * @generated
 */
public class AcquireLandApplicantDetailsServiceWrapper
	implements AcquireLandApplicantDetailsService,
			   ServiceWrapper<AcquireLandApplicantDetailsService> {

	public AcquireLandApplicantDetailsServiceWrapper() {
		this(null);
	}

	public AcquireLandApplicantDetailsServiceWrapper(
		AcquireLandApplicantDetailsService acquireLandApplicantDetailsService) {

		_acquireLandApplicantDetailsService =
			acquireLandApplicantDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandApplicantDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireLandApplicantDetailsService getWrappedService() {
		return _acquireLandApplicantDetailsService;
	}

	@Override
	public void setWrappedService(
		AcquireLandApplicantDetailsService acquireLandApplicantDetailsService) {

		_acquireLandApplicantDetailsService =
			acquireLandApplicantDetailsService;
	}

	private AcquireLandApplicantDetailsService
		_acquireLandApplicantDetailsService;

}