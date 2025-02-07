/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionService
 * @generated
 */
public class CannabisInspectionServiceWrapper
	implements CannabisInspectionService,
			   ServiceWrapper<CannabisInspectionService> {

	public CannabisInspectionServiceWrapper() {
		this(null);
	}

	public CannabisInspectionServiceWrapper(
		CannabisInspectionService cannabisInspectionService) {

		_cannabisInspectionService = cannabisInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisInspectionService getWrappedService() {
		return _cannabisInspectionService;
	}

	@Override
	public void setWrappedService(
		CannabisInspectionService cannabisInspectionService) {

		_cannabisInspectionService = cannabisInspectionService;
	}

	private CannabisInspectionService _cannabisInspectionService;

}