/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraInspectionService
 * @generated
 */
public class HsraInspectionServiceWrapper
	implements HsraInspectionService, ServiceWrapper<HsraInspectionService> {

	public HsraInspectionServiceWrapper() {
		this(null);
	}

	public HsraInspectionServiceWrapper(
		HsraInspectionService hsraInspectionService) {

		_hsraInspectionService = hsraInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraInspectionService getWrappedService() {
		return _hsraInspectionService;
	}

	@Override
	public void setWrappedService(HsraInspectionService hsraInspectionService) {
		_hsraInspectionService = hsraInspectionService;
	}

	private HsraInspectionService _hsraInspectionService;

}