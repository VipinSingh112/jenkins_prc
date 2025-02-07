/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormFirstAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddressService
 * @generated
 */
public class TourismBonaAttractionFormFirstAddressServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionFormFirstAddressService>,
			   TourismBonaAttractionFormFirstAddressService {

	public TourismBonaAttractionFormFirstAddressServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormFirstAddressServiceWrapper(
		TourismBonaAttractionFormFirstAddressService
			tourismBonaAttractionFormFirstAddressService) {

		_tourismBonaAttractionFormFirstAddressService =
			tourismBonaAttractionFormFirstAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormFirstAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAttractionFormFirstAddressService getWrappedService() {
		return _tourismBonaAttractionFormFirstAddressService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormFirstAddressService
			tourismBonaAttractionFormFirstAddressService) {

		_tourismBonaAttractionFormFirstAddressService =
			tourismBonaAttractionFormFirstAddressService;
	}

	private TourismBonaAttractionFormFirstAddressService
		_tourismBonaAttractionFormFirstAddressService;

}