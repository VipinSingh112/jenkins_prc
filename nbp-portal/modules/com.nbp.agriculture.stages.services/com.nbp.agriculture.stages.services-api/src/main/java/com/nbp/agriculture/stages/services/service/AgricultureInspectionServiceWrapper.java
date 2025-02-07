/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionService
 * @generated
 */
public class AgricultureInspectionServiceWrapper
	implements AgricultureInspectionService,
			   ServiceWrapper<AgricultureInspectionService> {

	public AgricultureInspectionServiceWrapper() {
		this(null);
	}

	public AgricultureInspectionServiceWrapper(
		AgricultureInspectionService agricultureInspectionService) {

		_agricultureInspectionService = agricultureInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureInspectionService getWrappedService() {
		return _agricultureInspectionService;
	}

	@Override
	public void setWrappedService(
		AgricultureInspectionService agricultureInspectionService) {

		_agricultureInspectionService = agricultureInspectionService;
	}

	private AgricultureInspectionService _agricultureInspectionService;

}