/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryMaterialInformationEquipmentListService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentListService
 * @generated
 */
public class QuarryMaterialInformationEquipmentListServiceWrapper
	implements QuarryMaterialInformationEquipmentListService,
			   ServiceWrapper<QuarryMaterialInformationEquipmentListService> {

	public QuarryMaterialInformationEquipmentListServiceWrapper() {
		this(null);
	}

	public QuarryMaterialInformationEquipmentListServiceWrapper(
		QuarryMaterialInformationEquipmentListService
			quarryMaterialInformationEquipmentListService) {

		_quarryMaterialInformationEquipmentListService =
			quarryMaterialInformationEquipmentListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryMaterialInformationEquipmentListService.
			getOSGiServiceIdentifier();
	}

	@Override
	public QuarryMaterialInformationEquipmentListService getWrappedService() {
		return _quarryMaterialInformationEquipmentListService;
	}

	@Override
	public void setWrappedService(
		QuarryMaterialInformationEquipmentListService
			quarryMaterialInformationEquipmentListService) {

		_quarryMaterialInformationEquipmentListService =
			quarryMaterialInformationEquipmentListService;
	}

	private QuarryMaterialInformationEquipmentListService
		_quarryMaterialInformationEquipmentListService;

}