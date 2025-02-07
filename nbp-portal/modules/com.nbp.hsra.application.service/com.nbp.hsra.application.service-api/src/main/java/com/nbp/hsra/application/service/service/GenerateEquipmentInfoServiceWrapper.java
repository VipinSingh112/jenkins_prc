/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GenerateEquipmentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfoService
 * @generated
 */
public class GenerateEquipmentInfoServiceWrapper
	implements GenerateEquipmentInfoService,
			   ServiceWrapper<GenerateEquipmentInfoService> {

	public GenerateEquipmentInfoServiceWrapper() {
		this(null);
	}

	public GenerateEquipmentInfoServiceWrapper(
		GenerateEquipmentInfoService generateEquipmentInfoService) {

		_generateEquipmentInfoService = generateEquipmentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _generateEquipmentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public GenerateEquipmentInfoService getWrappedService() {
		return _generateEquipmentInfoService;
	}

	@Override
	public void setWrappedService(
		GenerateEquipmentInfoService generateEquipmentInfoService) {

		_generateEquipmentInfoService = generateEquipmentInfoService;
	}

	private GenerateEquipmentInfoService _generateEquipmentInfoService;

}