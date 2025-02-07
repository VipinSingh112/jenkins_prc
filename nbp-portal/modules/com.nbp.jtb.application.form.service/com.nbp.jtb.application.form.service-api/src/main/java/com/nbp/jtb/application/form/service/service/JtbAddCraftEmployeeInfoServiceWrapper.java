/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAddCraftEmployeeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfoService
 * @generated
 */
public class JtbAddCraftEmployeeInfoServiceWrapper
	implements JtbAddCraftEmployeeInfoService,
			   ServiceWrapper<JtbAddCraftEmployeeInfoService> {

	public JtbAddCraftEmployeeInfoServiceWrapper() {
		this(null);
	}

	public JtbAddCraftEmployeeInfoServiceWrapper(
		JtbAddCraftEmployeeInfoService jtbAddCraftEmployeeInfoService) {

		_jtbAddCraftEmployeeInfoService = jtbAddCraftEmployeeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddCraftEmployeeInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAddCraftEmployeeInfoService getWrappedService() {
		return _jtbAddCraftEmployeeInfoService;
	}

	@Override
	public void setWrappedService(
		JtbAddCraftEmployeeInfoService jtbAddCraftEmployeeInfoService) {

		_jtbAddCraftEmployeeInfoService = jtbAddCraftEmployeeInfoService;
	}

	private JtbAddCraftEmployeeInfoService _jtbAddCraftEmployeeInfoService;

}