/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WraInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionService
 * @generated
 */
public class WraInspectionServiceWrapper
	implements ServiceWrapper<WraInspectionService>, WraInspectionService {

	public WraInspectionServiceWrapper() {
		this(null);
	}

	public WraInspectionServiceWrapper(
		WraInspectionService wraInspectionService) {

		_wraInspectionService = wraInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public WraInspectionService getWrappedService() {
		return _wraInspectionService;
	}

	@Override
	public void setWrappedService(WraInspectionService wraInspectionService) {
		_wraInspectionService = wraInspectionService;
	}

	private WraInspectionService _wraInspectionService;

}