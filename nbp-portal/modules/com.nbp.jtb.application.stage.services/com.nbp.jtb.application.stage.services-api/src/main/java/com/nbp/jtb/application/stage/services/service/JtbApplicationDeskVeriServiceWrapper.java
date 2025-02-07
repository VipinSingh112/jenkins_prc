/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbApplicationDeskVeriService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeriService
 * @generated
 */
public class JtbApplicationDeskVeriServiceWrapper
	implements JtbApplicationDeskVeriService,
			   ServiceWrapper<JtbApplicationDeskVeriService> {

	public JtbApplicationDeskVeriServiceWrapper() {
		this(null);
	}

	public JtbApplicationDeskVeriServiceWrapper(
		JtbApplicationDeskVeriService jtbApplicationDeskVeriService) {

		_jtbApplicationDeskVeriService = jtbApplicationDeskVeriService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationDeskVeriService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbApplicationDeskVeriService getWrappedService() {
		return _jtbApplicationDeskVeriService;
	}

	@Override
	public void setWrappedService(
		JtbApplicationDeskVeriService jtbApplicationDeskVeriService) {

		_jtbApplicationDeskVeriService = jtbApplicationDeskVeriService;
	}

	private JtbApplicationDeskVeriService _jtbApplicationDeskVeriService;

}