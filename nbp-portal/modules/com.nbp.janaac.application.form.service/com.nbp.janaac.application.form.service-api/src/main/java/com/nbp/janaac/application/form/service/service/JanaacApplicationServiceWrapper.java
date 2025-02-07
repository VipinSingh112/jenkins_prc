/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationService
 * @generated
 */
public class JanaacApplicationServiceWrapper
	implements JanaacApplicationService,
			   ServiceWrapper<JanaacApplicationService> {

	public JanaacApplicationServiceWrapper() {
		this(null);
	}

	public JanaacApplicationServiceWrapper(
		JanaacApplicationService janaacApplicationService) {

		_janaacApplicationService = janaacApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacApplicationService getWrappedService() {
		return _janaacApplicationService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationService janaacApplicationService) {

		_janaacApplicationService = janaacApplicationService;
	}

	private JanaacApplicationService _janaacApplicationService;

}