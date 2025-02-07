/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareApplicantInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfoService
 * @generated
 */
public class HealthCareApplicantInfoServiceWrapper
	implements HealthCareApplicantInfoService,
			   ServiceWrapper<HealthCareApplicantInfoService> {

	public HealthCareApplicantInfoServiceWrapper() {
		this(null);
	}

	public HealthCareApplicantInfoServiceWrapper(
		HealthCareApplicantInfoService healthCareApplicantInfoService) {

		_healthCareApplicantInfoService = healthCareApplicantInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicantInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareApplicantInfoService getWrappedService() {
		return _healthCareApplicantInfoService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicantInfoService healthCareApplicantInfoService) {

		_healthCareApplicantInfoService = healthCareApplicantInfoService;
	}

	private HealthCareApplicantInfoService _healthCareApplicantInfoService;

}