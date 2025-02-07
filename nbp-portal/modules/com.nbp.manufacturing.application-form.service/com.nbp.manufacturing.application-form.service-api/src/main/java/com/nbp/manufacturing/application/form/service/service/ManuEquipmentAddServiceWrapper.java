/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuEquipmentAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddService
 * @generated
 */
public class ManuEquipmentAddServiceWrapper
	implements ManuEquipmentAddService,
			   ServiceWrapper<ManuEquipmentAddService> {

	public ManuEquipmentAddServiceWrapper() {
		this(null);
	}

	public ManuEquipmentAddServiceWrapper(
		ManuEquipmentAddService manuEquipmentAddService) {

		_manuEquipmentAddService = manuEquipmentAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuEquipmentAddService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuEquipmentAddService getWrappedService() {
		return _manuEquipmentAddService;
	}

	@Override
	public void setWrappedService(
		ManuEquipmentAddService manuEquipmentAddService) {

		_manuEquipmentAddService = manuEquipmentAddService;
	}

	private ManuEquipmentAddService _manuEquipmentAddService;

}