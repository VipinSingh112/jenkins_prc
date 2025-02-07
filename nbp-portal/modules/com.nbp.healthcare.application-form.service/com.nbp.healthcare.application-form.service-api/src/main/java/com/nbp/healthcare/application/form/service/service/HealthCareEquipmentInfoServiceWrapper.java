/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareEquipmentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfoService
 * @generated
 */
public class HealthCareEquipmentInfoServiceWrapper
	implements HealthCareEquipmentInfoService,
			   ServiceWrapper<HealthCareEquipmentInfoService> {

	public HealthCareEquipmentInfoServiceWrapper() {
		this(null);
	}

	public HealthCareEquipmentInfoServiceWrapper(
		HealthCareEquipmentInfoService healthCareEquipmentInfoService) {

		_healthCareEquipmentInfoService = healthCareEquipmentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareEquipmentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareEquipmentInfoService getWrappedService() {
		return _healthCareEquipmentInfoService;
	}

	@Override
	public void setWrappedService(
		HealthCareEquipmentInfoService healthCareEquipmentInfoService) {

		_healthCareEquipmentInfoService = healthCareEquipmentInfoService;
	}

	private HealthCareEquipmentInfoService _healthCareEquipmentInfoService;

}