/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GenEquipmentDataService}.
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataService
 * @generated
 */
public class GenEquipmentDataServiceWrapper
	implements GenEquipmentDataService,
			   ServiceWrapper<GenEquipmentDataService> {

	public GenEquipmentDataServiceWrapper() {
		this(null);
	}

	public GenEquipmentDataServiceWrapper(
		GenEquipmentDataService genEquipmentDataService) {

		_genEquipmentDataService = genEquipmentDataService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _genEquipmentDataService.getOSGiServiceIdentifier();
	}

	@Override
	public GenEquipmentDataService getWrappedService() {
		return _genEquipmentDataService;
	}

	@Override
	public void setWrappedService(
		GenEquipmentDataService genEquipmentDataService) {

		_genEquipmentDataService = genEquipmentDataService;
	}

	private GenEquipmentDataService _genEquipmentDataService;

}