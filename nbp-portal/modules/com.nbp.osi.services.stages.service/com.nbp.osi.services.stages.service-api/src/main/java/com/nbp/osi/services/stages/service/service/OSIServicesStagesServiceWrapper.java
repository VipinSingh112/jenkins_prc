/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServicesStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesService
 * @generated
 */
public class OSIServicesStagesServiceWrapper
	implements OSIServicesStagesService,
			   ServiceWrapper<OSIServicesStagesService> {

	public OSIServicesStagesServiceWrapper() {
		this(null);
	}

	public OSIServicesStagesServiceWrapper(
		OSIServicesStagesService osiServicesStagesService) {

		_osiServicesStagesService = osiServicesStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServicesStagesService getWrappedService() {
		return _osiServicesStagesService;
	}

	@Override
	public void setWrappedService(
		OSIServicesStagesService osiServicesStagesService) {

		_osiServicesStagesService = osiServicesStagesService;
	}

	private OSIServicesStagesService _osiServicesStagesService;

}