/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeProEquipmentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfoService
 * @generated
 */
public class FireBrigadeProEquipmentInfoServiceWrapper
	implements FireBrigadeProEquipmentInfoService,
			   ServiceWrapper<FireBrigadeProEquipmentInfoService> {

	public FireBrigadeProEquipmentInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadeProEquipmentInfoServiceWrapper(
		FireBrigadeProEquipmentInfoService fireBrigadeProEquipmentInfoService) {

		_fireBrigadeProEquipmentInfoService =
			fireBrigadeProEquipmentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeProEquipmentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeProEquipmentInfoService getWrappedService() {
		return _fireBrigadeProEquipmentInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeProEquipmentInfoService fireBrigadeProEquipmentInfoService) {

		_fireBrigadeProEquipmentInfoService =
			fireBrigadeProEquipmentInfoService;
	}

	private FireBrigadeProEquipmentInfoService
		_fireBrigadeProEquipmentInfoService;

}