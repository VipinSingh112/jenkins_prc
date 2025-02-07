/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAddListDriverInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfoService
 * @generated
 */
public class JtbAddListDriverInfoServiceWrapper
	implements JtbAddListDriverInfoService,
			   ServiceWrapper<JtbAddListDriverInfoService> {

	public JtbAddListDriverInfoServiceWrapper() {
		this(null);
	}

	public JtbAddListDriverInfoServiceWrapper(
		JtbAddListDriverInfoService jtbAddListDriverInfoService) {

		_jtbAddListDriverInfoService = jtbAddListDriverInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddListDriverInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAddListDriverInfoService getWrappedService() {
		return _jtbAddListDriverInfoService;
	}

	@Override
	public void setWrappedService(
		JtbAddListDriverInfoService jtbAddListDriverInfoService) {

		_jtbAddListDriverInfoService = jtbAddListDriverInfoService;
	}

	private JtbAddListDriverInfoService _jtbAddListDriverInfoService;

}