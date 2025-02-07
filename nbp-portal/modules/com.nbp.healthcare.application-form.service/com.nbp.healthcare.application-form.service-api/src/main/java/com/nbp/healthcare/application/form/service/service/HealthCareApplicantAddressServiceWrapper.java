/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareApplicantAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddressService
 * @generated
 */
public class HealthCareApplicantAddressServiceWrapper
	implements HealthCareApplicantAddressService,
			   ServiceWrapper<HealthCareApplicantAddressService> {

	public HealthCareApplicantAddressServiceWrapper() {
		this(null);
	}

	public HealthCareApplicantAddressServiceWrapper(
		HealthCareApplicantAddressService healthCareApplicantAddressService) {

		_healthCareApplicantAddressService = healthCareApplicantAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicantAddressService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareApplicantAddressService getWrappedService() {
		return _healthCareApplicantAddressService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicantAddressService healthCareApplicantAddressService) {

		_healthCareApplicantAddressService = healthCareApplicantAddressService;
	}

	private HealthCareApplicantAddressService
		_healthCareApplicantAddressService;

}