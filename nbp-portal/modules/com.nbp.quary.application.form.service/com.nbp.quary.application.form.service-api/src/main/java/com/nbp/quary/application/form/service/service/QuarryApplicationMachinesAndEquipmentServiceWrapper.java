/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryApplicationMachinesAndEquipmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipmentService
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentServiceWrapper
	implements QuarryApplicationMachinesAndEquipmentService,
			   ServiceWrapper<QuarryApplicationMachinesAndEquipmentService> {

	public QuarryApplicationMachinesAndEquipmentServiceWrapper() {
		this(null);
	}

	public QuarryApplicationMachinesAndEquipmentServiceWrapper(
		QuarryApplicationMachinesAndEquipmentService
			quarryApplicationMachinesAndEquipmentService) {

		_quarryApplicationMachinesAndEquipmentService =
			quarryApplicationMachinesAndEquipmentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationMachinesAndEquipmentService.
			getOSGiServiceIdentifier();
	}

	@Override
	public QuarryApplicationMachinesAndEquipmentService getWrappedService() {
		return _quarryApplicationMachinesAndEquipmentService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationMachinesAndEquipmentService
			quarryApplicationMachinesAndEquipmentService) {

		_quarryApplicationMachinesAndEquipmentService =
			quarryApplicationMachinesAndEquipmentService;
	}

	private QuarryApplicationMachinesAndEquipmentService
		_quarryApplicationMachinesAndEquipmentService;

}