/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccoSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoSignInfoService
 * @generated
 */
public class TourismNewAccoSignInfoServiceWrapper
	implements ServiceWrapper<TourismNewAccoSignInfoService>,
			   TourismNewAccoSignInfoService {

	public TourismNewAccoSignInfoServiceWrapper() {
		this(null);
	}

	public TourismNewAccoSignInfoServiceWrapper(
		TourismNewAccoSignInfoService tourismNewAccoSignInfoService) {

		_tourismNewAccoSignInfoService = tourismNewAccoSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccoSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAccoSignInfoService getWrappedService() {
		return _tourismNewAccoSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccoSignInfoService tourismNewAccoSignInfoService) {

		_tourismNewAccoSignInfoService = tourismNewAccoSignInfoService;
	}

	private TourismNewAccoSignInfoService _tourismNewAccoSignInfoService;

}