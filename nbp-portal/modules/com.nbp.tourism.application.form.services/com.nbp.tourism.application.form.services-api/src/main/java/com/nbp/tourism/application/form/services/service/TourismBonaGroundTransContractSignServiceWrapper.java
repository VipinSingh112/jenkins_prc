/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransContractSignService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSignService
 * @generated
 */
public class TourismBonaGroundTransContractSignServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransContractSignService>,
			   TourismBonaGroundTransContractSignService {

	public TourismBonaGroundTransContractSignServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransContractSignServiceWrapper(
		TourismBonaGroundTransContractSignService
			tourismBonaGroundTransContractSignService) {

		_tourismBonaGroundTransContractSignService =
			tourismBonaGroundTransContractSignService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransContractSignService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundTransContractSignService getWrappedService() {
		return _tourismBonaGroundTransContractSignService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransContractSignService
			tourismBonaGroundTransContractSignService) {

		_tourismBonaGroundTransContractSignService =
			tourismBonaGroundTransContractSignService;
	}

	private TourismBonaGroundTransContractSignService
		_tourismBonaGroundTransContractSignService;

}