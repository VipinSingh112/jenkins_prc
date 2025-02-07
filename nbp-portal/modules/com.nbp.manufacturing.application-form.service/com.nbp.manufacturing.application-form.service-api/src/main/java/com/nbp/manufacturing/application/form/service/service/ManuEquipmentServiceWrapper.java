/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuEquipmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentService
 * @generated
 */
public class ManuEquipmentServiceWrapper
	implements ManuEquipmentService, ServiceWrapper<ManuEquipmentService> {

	public ManuEquipmentServiceWrapper() {
		this(null);
	}

	public ManuEquipmentServiceWrapper(
		ManuEquipmentService manuEquipmentService) {

		_manuEquipmentService = manuEquipmentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuEquipmentService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuEquipmentService getWrappedService() {
		return _manuEquipmentService;
	}

	@Override
	public void setWrappedService(ManuEquipmentService manuEquipmentService) {
		_manuEquipmentService = manuEquipmentService;
	}

	private ManuEquipmentService _manuEquipmentService;

}