/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionService
 * @generated
 */
public class ManuInspectionServiceWrapper
	implements ManuInspectionService, ServiceWrapper<ManuInspectionService> {

	public ManuInspectionServiceWrapper() {
		this(null);
	}

	public ManuInspectionServiceWrapper(
		ManuInspectionService manuInspectionService) {

		_manuInspectionService = manuInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuInspectionService getWrappedService() {
		return _manuInspectionService;
	}

	@Override
	public void setWrappedService(ManuInspectionService manuInspectionService) {
		_manuInspectionService = manuInspectionService;
	}

	private ManuInspectionService _manuInspectionService;

}