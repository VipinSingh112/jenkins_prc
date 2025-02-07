/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAccoAssesmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesmentService
 * @generated
 */
public class TourismBonaAccoAssesmentServiceWrapper
	implements ServiceWrapper<TourismBonaAccoAssesmentService>,
			   TourismBonaAccoAssesmentService {

	public TourismBonaAccoAssesmentServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoAssesmentServiceWrapper(
		TourismBonaAccoAssesmentService tourismBonaAccoAssesmentService) {

		_tourismBonaAccoAssesmentService = tourismBonaAccoAssesmentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoAssesmentService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAccoAssesmentService getWrappedService() {
		return _tourismBonaAccoAssesmentService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoAssesmentService tourismBonaAccoAssesmentService) {

		_tourismBonaAccoAssesmentService = tourismBonaAccoAssesmentService;
	}

	private TourismBonaAccoAssesmentService _tourismBonaAccoAssesmentService;

}