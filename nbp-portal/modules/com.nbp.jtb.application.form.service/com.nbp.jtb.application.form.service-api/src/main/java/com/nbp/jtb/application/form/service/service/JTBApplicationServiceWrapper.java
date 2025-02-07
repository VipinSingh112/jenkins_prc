/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTBApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationService
 * @generated
 */
public class JTBApplicationServiceWrapper
	implements JTBApplicationService, ServiceWrapper<JTBApplicationService> {

	public JTBApplicationServiceWrapper() {
		this(null);
	}

	public JTBApplicationServiceWrapper(
		JTBApplicationService jtbApplicationService) {

		_jtbApplicationService = jtbApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public JTBApplicationService getWrappedService() {
		return _jtbApplicationService;
	}

	@Override
	public void setWrappedService(JTBApplicationService jtbApplicationService) {
		_jtbApplicationService = jtbApplicationService;
	}

	private JTBApplicationService _jtbApplicationService;

}