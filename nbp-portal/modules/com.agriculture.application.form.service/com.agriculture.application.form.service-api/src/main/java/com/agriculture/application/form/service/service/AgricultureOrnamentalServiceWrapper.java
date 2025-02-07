/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureOrnamentalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamentalService
 * @generated
 */
public class AgricultureOrnamentalServiceWrapper
	implements AgricultureOrnamentalService,
			   ServiceWrapper<AgricultureOrnamentalService> {

	public AgricultureOrnamentalServiceWrapper() {
		this(null);
	}

	public AgricultureOrnamentalServiceWrapper(
		AgricultureOrnamentalService agricultureOrnamentalService) {

		_agricultureOrnamentalService = agricultureOrnamentalService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureOrnamentalService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureOrnamentalService getWrappedService() {
		return _agricultureOrnamentalService;
	}

	@Override
	public void setWrappedService(
		AgricultureOrnamentalService agricultureOrnamentalService) {

		_agricultureOrnamentalService = agricultureOrnamentalService;
	}

	private AgricultureOrnamentalService _agricultureOrnamentalService;

}