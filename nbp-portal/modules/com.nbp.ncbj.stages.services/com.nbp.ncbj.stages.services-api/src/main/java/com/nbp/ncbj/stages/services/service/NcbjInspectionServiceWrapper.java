/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionService
 * @generated
 */
public class NcbjInspectionServiceWrapper
	implements NcbjInspectionService, ServiceWrapper<NcbjInspectionService> {

	public NcbjInspectionServiceWrapper() {
		this(null);
	}

	public NcbjInspectionServiceWrapper(
		NcbjInspectionService ncbjInspectionService) {

		_ncbjInspectionService = ncbjInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjInspectionService getWrappedService() {
		return _ncbjInspectionService;
	}

	@Override
	public void setWrappedService(NcbjInspectionService ncbjInspectionService) {
		_ncbjInspectionService = ncbjInspectionService;
	}

	private NcbjInspectionService _ncbjInspectionService;

}