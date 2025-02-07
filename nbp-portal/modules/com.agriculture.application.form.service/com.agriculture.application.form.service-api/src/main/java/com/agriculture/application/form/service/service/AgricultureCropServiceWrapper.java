/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureCropService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCropService
 * @generated
 */
public class AgricultureCropServiceWrapper
	implements AgricultureCropService, ServiceWrapper<AgricultureCropService> {

	public AgricultureCropServiceWrapper() {
		this(null);
	}

	public AgricultureCropServiceWrapper(
		AgricultureCropService agricultureCropService) {

		_agricultureCropService = agricultureCropService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureCropService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureCropService getWrappedService() {
		return _agricultureCropService;
	}

	@Override
	public void setWrappedService(
		AgricultureCropService agricultureCropService) {

		_agricultureCropService = agricultureCropService;
	}

	private AgricultureCropService _agricultureCropService;

}