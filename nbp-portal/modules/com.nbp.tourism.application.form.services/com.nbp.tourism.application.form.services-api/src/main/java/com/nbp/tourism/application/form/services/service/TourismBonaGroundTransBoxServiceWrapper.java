/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxService
 * @generated
 */
public class TourismBonaGroundTransBoxServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransBoxService>,
			   TourismBonaGroundTransBoxService {

	public TourismBonaGroundTransBoxServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransBoxServiceWrapper(
		TourismBonaGroundTransBoxService tourismBonaGroundTransBoxService) {

		_tourismBonaGroundTransBoxService = tourismBonaGroundTransBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundTransBoxService getWrappedService() {
		return _tourismBonaGroundTransBoxService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransBoxService tourismBonaGroundTransBoxService) {

		_tourismBonaGroundTransBoxService = tourismBonaGroundTransBoxService;
	}

	private TourismBonaGroundTransBoxService _tourismBonaGroundTransBoxService;

}