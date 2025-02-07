/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServicesRecommendationsService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsService
 * @generated
 */
public class OSIServicesRecommendationsServiceWrapper
	implements OSIServicesRecommendationsService,
			   ServiceWrapper<OSIServicesRecommendationsService> {

	public OSIServicesRecommendationsServiceWrapper() {
		this(null);
	}

	public OSIServicesRecommendationsServiceWrapper(
		OSIServicesRecommendationsService osiServicesRecommendationsService) {

		_osiServicesRecommendationsService = osiServicesRecommendationsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesRecommendationsService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServicesRecommendationsService getWrappedService() {
		return _osiServicesRecommendationsService;
	}

	@Override
	public void setWrappedService(
		OSIServicesRecommendationsService osiServicesRecommendationsService) {

		_osiServicesRecommendationsService = osiServicesRecommendationsService;
	}

	private OSIServicesRecommendationsService
		_osiServicesRecommendationsService;

}