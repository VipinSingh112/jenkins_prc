/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareDescriptionOfServiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServiceService
 * @generated
 */
public class HealthCareDescriptionOfServiceServiceWrapper
	implements HealthCareDescriptionOfServiceService,
			   ServiceWrapper<HealthCareDescriptionOfServiceService> {

	public HealthCareDescriptionOfServiceServiceWrapper() {
		this(null);
	}

	public HealthCareDescriptionOfServiceServiceWrapper(
		HealthCareDescriptionOfServiceService
			healthCareDescriptionOfServiceService) {

		_healthCareDescriptionOfServiceService =
			healthCareDescriptionOfServiceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareDescriptionOfServiceService.
			getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareDescriptionOfServiceService getWrappedService() {
		return _healthCareDescriptionOfServiceService;
	}

	@Override
	public void setWrappedService(
		HealthCareDescriptionOfServiceService
			healthCareDescriptionOfServiceService) {

		_healthCareDescriptionOfServiceService =
			healthCareDescriptionOfServiceService;
	}

	private HealthCareDescriptionOfServiceService
		_healthCareDescriptionOfServiceService;

}