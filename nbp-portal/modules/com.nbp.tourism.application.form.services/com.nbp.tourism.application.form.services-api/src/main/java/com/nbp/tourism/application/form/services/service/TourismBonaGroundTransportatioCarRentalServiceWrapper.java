/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransportatioCarRentalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRentalService
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransportatioCarRentalService>,
			   TourismBonaGroundTransportatioCarRentalService {

	public TourismBonaGroundTransportatioCarRentalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransportatioCarRentalServiceWrapper(
		TourismBonaGroundTransportatioCarRentalService
			tourismBonaGroundTransportatioCarRentalService) {

		_tourismBonaGroundTransportatioCarRentalService =
			tourismBonaGroundTransportatioCarRentalService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransportatioCarRentalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundTransportatioCarRentalService getWrappedService() {
		return _tourismBonaGroundTransportatioCarRentalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransportatioCarRentalService
			tourismBonaGroundTransportatioCarRentalService) {

		_tourismBonaGroundTransportatioCarRentalService =
			tourismBonaGroundTransportatioCarRentalService;
	}

	private TourismBonaGroundTransportatioCarRentalService
		_tourismBonaGroundTransportatioCarRentalService;

}