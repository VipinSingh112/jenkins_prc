/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureLivestockService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestockService
 * @generated
 */
public class AgricultureLivestockServiceWrapper
	implements AgricultureLivestockService,
			   ServiceWrapper<AgricultureLivestockService> {

	public AgricultureLivestockServiceWrapper() {
		this(null);
	}

	public AgricultureLivestockServiceWrapper(
		AgricultureLivestockService agricultureLivestockService) {

		_agricultureLivestockService = agricultureLivestockService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureLivestockService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureLivestockService getWrappedService() {
		return _agricultureLivestockService;
	}

	@Override
	public void setWrappedService(
		AgricultureLivestockService agricultureLivestockService) {

		_agricultureLivestockService = agricultureLivestockService;
	}

	private AgricultureLivestockService _agricultureLivestockService;

}