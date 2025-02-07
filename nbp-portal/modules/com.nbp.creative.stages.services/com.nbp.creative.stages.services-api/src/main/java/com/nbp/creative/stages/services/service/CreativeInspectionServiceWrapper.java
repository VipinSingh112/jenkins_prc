/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspectionService
 * @generated
 */
public class CreativeInspectionServiceWrapper
	implements CreativeInspectionService,
			   ServiceWrapper<CreativeInspectionService> {

	public CreativeInspectionServiceWrapper() {
		this(null);
	}

	public CreativeInspectionServiceWrapper(
		CreativeInspectionService creativeInspectionService) {

		_creativeInspectionService = creativeInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeInspectionService getWrappedService() {
		return _creativeInspectionService;
	}

	@Override
	public void setWrappedService(
		CreativeInspectionService creativeInspectionService) {

		_creativeInspectionService = creativeInspectionService;
	}

	private CreativeInspectionService _creativeInspectionService;

}