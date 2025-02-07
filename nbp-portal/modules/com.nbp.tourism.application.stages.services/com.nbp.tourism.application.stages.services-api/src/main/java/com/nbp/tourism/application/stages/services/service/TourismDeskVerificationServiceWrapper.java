/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerificationService
 * @generated
 */
public class TourismDeskVerificationServiceWrapper
	implements ServiceWrapper<TourismDeskVerificationService>,
			   TourismDeskVerificationService {

	public TourismDeskVerificationServiceWrapper() {
		this(null);
	}

	public TourismDeskVerificationServiceWrapper(
		TourismDeskVerificationService tourismDeskVerificationService) {

		_tourismDeskVerificationService = tourismDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismDeskVerificationService getWrappedService() {
		return _tourismDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		TourismDeskVerificationService tourismDeskVerificationService) {

		_tourismDeskVerificationService = tourismDeskVerificationService;
	}

	private TourismDeskVerificationService _tourismDeskVerificationService;

}