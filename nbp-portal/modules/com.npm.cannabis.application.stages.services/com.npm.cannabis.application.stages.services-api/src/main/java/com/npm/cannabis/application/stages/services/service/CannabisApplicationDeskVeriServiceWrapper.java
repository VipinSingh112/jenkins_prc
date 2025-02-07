/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationDeskVeriService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeriService
 * @generated
 */
public class CannabisApplicationDeskVeriServiceWrapper
	implements CannabisApplicationDeskVeriService,
			   ServiceWrapper<CannabisApplicationDeskVeriService> {

	public CannabisApplicationDeskVeriServiceWrapper() {
		this(null);
	}

	public CannabisApplicationDeskVeriServiceWrapper(
		CannabisApplicationDeskVeriService cannabisApplicationDeskVeriService) {

		_cannabisApplicationDeskVeriService =
			cannabisApplicationDeskVeriService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationDeskVeriService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationDeskVeriService getWrappedService() {
		return _cannabisApplicationDeskVeriService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationDeskVeriService cannabisApplicationDeskVeriService) {

		_cannabisApplicationDeskVeriService =
			cannabisApplicationDeskVeriService;
	}

	private CannabisApplicationDeskVeriService
		_cannabisApplicationDeskVeriService;

}