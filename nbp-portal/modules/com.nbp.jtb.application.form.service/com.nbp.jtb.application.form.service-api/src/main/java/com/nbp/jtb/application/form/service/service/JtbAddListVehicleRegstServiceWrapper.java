/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAddListVehicleRegstService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegstService
 * @generated
 */
public class JtbAddListVehicleRegstServiceWrapper
	implements JtbAddListVehicleRegstService,
			   ServiceWrapper<JtbAddListVehicleRegstService> {

	public JtbAddListVehicleRegstServiceWrapper() {
		this(null);
	}

	public JtbAddListVehicleRegstServiceWrapper(
		JtbAddListVehicleRegstService jtbAddListVehicleRegstService) {

		_jtbAddListVehicleRegstService = jtbAddListVehicleRegstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddListVehicleRegstService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAddListVehicleRegstService getWrappedService() {
		return _jtbAddListVehicleRegstService;
	}

	@Override
	public void setWrappedService(
		JtbAddListVehicleRegstService jtbAddListVehicleRegstService) {

		_jtbAddListVehicleRegstService = jtbAddListVehicleRegstService;
	}

	private JtbAddListVehicleRegstService _jtbAddListVehicleRegstService;

}