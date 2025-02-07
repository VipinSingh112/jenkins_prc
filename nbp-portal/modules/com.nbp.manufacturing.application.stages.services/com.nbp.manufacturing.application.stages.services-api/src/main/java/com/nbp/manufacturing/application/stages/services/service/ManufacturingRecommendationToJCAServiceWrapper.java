/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManufacturingRecommendationToJCAService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCAService
 * @generated
 */
public class ManufacturingRecommendationToJCAServiceWrapper
	implements ManufacturingRecommendationToJCAService,
			   ServiceWrapper<ManufacturingRecommendationToJCAService> {

	public ManufacturingRecommendationToJCAServiceWrapper() {
		this(null);
	}

	public ManufacturingRecommendationToJCAServiceWrapper(
		ManufacturingRecommendationToJCAService
			manufacturingRecommendationToJCAService) {

		_manufacturingRecommendationToJCAService =
			manufacturingRecommendationToJCAService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingRecommendationToJCAService.
			getOSGiServiceIdentifier();
	}

	@Override
	public ManufacturingRecommendationToJCAService getWrappedService() {
		return _manufacturingRecommendationToJCAService;
	}

	@Override
	public void setWrappedService(
		ManufacturingRecommendationToJCAService
			manufacturingRecommendationToJCAService) {

		_manufacturingRecommendationToJCAService =
			manufacturingRecommendationToJCAService;
	}

	private ManufacturingRecommendationToJCAService
		_manufacturingRecommendationToJCAService;

}