/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccoGeneralFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormService
 * @generated
 */
public class TourismNewAccoGeneralFormServiceWrapper
	implements ServiceWrapper<TourismNewAccoGeneralFormService>,
			   TourismNewAccoGeneralFormService {

	public TourismNewAccoGeneralFormServiceWrapper() {
		this(null);
	}

	public TourismNewAccoGeneralFormServiceWrapper(
		TourismNewAccoGeneralFormService tourismNewAccoGeneralFormService) {

		_tourismNewAccoGeneralFormService = tourismNewAccoGeneralFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccoGeneralFormService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAccoGeneralFormService getWrappedService() {
		return _tourismNewAccoGeneralFormService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccoGeneralFormService tourismNewAccoGeneralFormService) {

		_tourismNewAccoGeneralFormService = tourismNewAccoGeneralFormService;
	}

	private TourismNewAccoGeneralFormService _tourismNewAccoGeneralFormService;

}