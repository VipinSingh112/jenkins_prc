/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInspectionService
 * @generated
 */
public class QuarryInspectionServiceWrapper
	implements QuarryInspectionService,
			   ServiceWrapper<QuarryInspectionService> {

	public QuarryInspectionServiceWrapper() {
		this(null);
	}

	public QuarryInspectionServiceWrapper(
		QuarryInspectionService quarryInspectionService) {

		_quarryInspectionService = quarryInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryInspectionService getWrappedService() {
		return _quarryInspectionService;
	}

	@Override
	public void setWrappedService(
		QuarryInspectionService quarryInspectionService) {

		_quarryInspectionService = quarryInspectionService;
	}

	private QuarryInspectionService _quarryInspectionService;

}