/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationsService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsService
 * @generated
 */
public class CannabisApplicationsServiceWrapper
	implements CannabisApplicationsService,
			   ServiceWrapper<CannabisApplicationsService> {

	public CannabisApplicationsServiceWrapper() {
		this(null);
	}

	public CannabisApplicationsServiceWrapper(
		CannabisApplicationsService cannabisApplicationsService) {

		_cannabisApplicationsService = cannabisApplicationsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationsService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationsService getWrappedService() {
		return _cannabisApplicationsService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationsService cannabisApplicationsService) {

		_cannabisApplicationsService = cannabisApplicationsService;
	}

	private CannabisApplicationsService _cannabisApplicationsService;

}