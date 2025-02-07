/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundContractTransPaymentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundContractTransPaymentInfoService
 * @generated
 */
public class TourismBonaGroundContractTransPaymentInfoServiceWrapper
	implements ServiceWrapper<TourismBonaGroundContractTransPaymentInfoService>,
			   TourismBonaGroundContractTransPaymentInfoService {

	public TourismBonaGroundContractTransPaymentInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundContractTransPaymentInfoServiceWrapper(
		TourismBonaGroundContractTransPaymentInfoService
			tourismBonaGroundContractTransPaymentInfoService) {

		_tourismBonaGroundContractTransPaymentInfoService =
			tourismBonaGroundContractTransPaymentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundContractTransPaymentInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundContractTransPaymentInfoService
		getWrappedService() {

		return _tourismBonaGroundContractTransPaymentInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundContractTransPaymentInfoService
			tourismBonaGroundContractTransPaymentInfoService) {

		_tourismBonaGroundContractTransPaymentInfoService =
			tourismBonaGroundContractTransPaymentInfoService;
	}

	private TourismBonaGroundContractTransPaymentInfoService
		_tourismBonaGroundContractTransPaymentInfoService;

}