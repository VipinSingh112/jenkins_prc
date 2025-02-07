/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesService
 * @generated
 */
public class AgricultureApplicationStagesServiceWrapper
	implements AgricultureApplicationStagesService,
			   ServiceWrapper<AgricultureApplicationStagesService> {

	public AgricultureApplicationStagesServiceWrapper() {
		this(null);
	}

	public AgricultureApplicationStagesServiceWrapper(
		AgricultureApplicationStagesService
			agricultureApplicationStagesService) {

		_agricultureApplicationStagesService =
			agricultureApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureApplicationStagesService getWrappedService() {
		return _agricultureApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		AgricultureApplicationStagesService
			agricultureApplicationStagesService) {

		_agricultureApplicationStagesService =
			agricultureApplicationStagesService;
	}

	private AgricultureApplicationStagesService
		_agricultureApplicationStagesService;

}