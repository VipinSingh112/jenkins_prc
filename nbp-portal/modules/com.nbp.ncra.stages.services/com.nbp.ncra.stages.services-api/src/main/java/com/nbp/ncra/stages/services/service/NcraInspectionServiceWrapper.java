/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspectionService
 * @generated
 */
public class NcraInspectionServiceWrapper
	implements NcraInspectionService, ServiceWrapper<NcraInspectionService> {

	public NcraInspectionServiceWrapper() {
		this(null);
	}

	public NcraInspectionServiceWrapper(
		NcraInspectionService ncraInspectionService) {

		_ncraInspectionService = ncraInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraInspectionService getWrappedService() {
		return _ncraInspectionService;
	}

	@Override
	public void setWrappedService(NcraInspectionService ncraInspectionService) {
		_ncraInspectionService = ncraInspectionService;
	}

	private NcraInspectionService _ncraInspectionService;

}