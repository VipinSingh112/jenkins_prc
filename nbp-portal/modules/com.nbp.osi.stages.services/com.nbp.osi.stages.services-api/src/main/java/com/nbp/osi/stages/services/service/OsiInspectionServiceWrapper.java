/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionService
 * @generated
 */
public class OsiInspectionServiceWrapper
	implements OsiInspectionService, ServiceWrapper<OsiInspectionService> {

	public OsiInspectionServiceWrapper() {
		this(null);
	}

	public OsiInspectionServiceWrapper(
		OsiInspectionService osiInspectionService) {

		_osiInspectionService = osiInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInspectionService getWrappedService() {
		return _osiInspectionService;
	}

	@Override
	public void setWrappedService(OsiInspectionService osiInspectionService) {
		_osiInspectionService = osiInspectionService;
	}

	private OsiInspectionService _osiInspectionService;

}