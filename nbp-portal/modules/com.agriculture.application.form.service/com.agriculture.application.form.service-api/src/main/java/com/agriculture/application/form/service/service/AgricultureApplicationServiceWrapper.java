/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationService
 * @generated
 */
public class AgricultureApplicationServiceWrapper
	implements AgricultureApplicationService,
			   ServiceWrapper<AgricultureApplicationService> {

	public AgricultureApplicationServiceWrapper() {
		this(null);
	}

	public AgricultureApplicationServiceWrapper(
		AgricultureApplicationService agricultureApplicationService) {

		_agricultureApplicationService = agricultureApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureApplicationService getWrappedService() {
		return _agricultureApplicationService;
	}

	@Override
	public void setWrappedService(
		AgricultureApplicationService agricultureApplicationService) {

		_agricultureApplicationService = agricultureApplicationService;
	}

	private AgricultureApplicationService _agricultureApplicationService;

}