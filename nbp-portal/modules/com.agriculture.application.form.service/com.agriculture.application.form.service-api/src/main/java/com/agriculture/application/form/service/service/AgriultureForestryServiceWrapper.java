/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgriultureForestryService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestryService
 * @generated
 */
public class AgriultureForestryServiceWrapper
	implements AgriultureForestryService,
			   ServiceWrapper<AgriultureForestryService> {

	public AgriultureForestryServiceWrapper() {
		this(null);
	}

	public AgriultureForestryServiceWrapper(
		AgriultureForestryService agriultureForestryService) {

		_agriultureForestryService = agriultureForestryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriultureForestryService.getOSGiServiceIdentifier();
	}

	@Override
	public AgriultureForestryService getWrappedService() {
		return _agriultureForestryService;
	}

	@Override
	public void setWrappedService(
		AgriultureForestryService agriultureForestryService) {

		_agriultureForestryService = agriultureForestryService;
	}

	private AgriultureForestryService _agriultureForestryService;

}