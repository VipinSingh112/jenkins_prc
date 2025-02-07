/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccoAssesmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentService
 * @generated
 */
public class TourismNewAccoAssesmentServiceWrapper
	implements ServiceWrapper<TourismNewAccoAssesmentService>,
			   TourismNewAccoAssesmentService {

	public TourismNewAccoAssesmentServiceWrapper() {
		this(null);
	}

	public TourismNewAccoAssesmentServiceWrapper(
		TourismNewAccoAssesmentService tourismNewAccoAssesmentService) {

		_tourismNewAccoAssesmentService = tourismNewAccoAssesmentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccoAssesmentService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAccoAssesmentService getWrappedService() {
		return _tourismNewAccoAssesmentService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccoAssesmentService tourismNewAccoAssesmentService) {

		_tourismNewAccoAssesmentService = tourismNewAccoAssesmentService;
	}

	private TourismNewAccoAssesmentService _tourismNewAccoAssesmentService;

}