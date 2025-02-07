/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthcareEquipHeadingListService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListService
 * @generated
 */
public class HealthcareEquipHeadingListServiceWrapper
	implements HealthcareEquipHeadingListService,
			   ServiceWrapper<HealthcareEquipHeadingListService> {

	public HealthcareEquipHeadingListServiceWrapper() {
		this(null);
	}

	public HealthcareEquipHeadingListServiceWrapper(
		HealthcareEquipHeadingListService healthcareEquipHeadingListService) {

		_healthcareEquipHeadingListService = healthcareEquipHeadingListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthcareEquipHeadingListService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthcareEquipHeadingListService getWrappedService() {
		return _healthcareEquipHeadingListService;
	}

	@Override
	public void setWrappedService(
		HealthcareEquipHeadingListService healthcareEquipHeadingListService) {

		_healthcareEquipHeadingListService = healthcareEquipHeadingListService;
	}

	private HealthcareEquipHeadingListService
		_healthcareEquipHeadingListService;

}