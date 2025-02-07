/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundPaymentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfoService
 * @generated
 */
public class TourismBonaGroundPaymentInfoServiceWrapper
	implements ServiceWrapper<TourismBonaGroundPaymentInfoService>,
			   TourismBonaGroundPaymentInfoService {

	public TourismBonaGroundPaymentInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundPaymentInfoServiceWrapper(
		TourismBonaGroundPaymentInfoService
			tourismBonaGroundPaymentInfoService) {

		_tourismBonaGroundPaymentInfoService =
			tourismBonaGroundPaymentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundPaymentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundPaymentInfoService getWrappedService() {
		return _tourismBonaGroundPaymentInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundPaymentInfoService
			tourismBonaGroundPaymentInfoService) {

		_tourismBonaGroundPaymentInfoService =
			tourismBonaGroundPaymentInfoService;
	}

	private TourismBonaGroundPaymentInfoService
		_tourismBonaGroundPaymentInfoService;

}