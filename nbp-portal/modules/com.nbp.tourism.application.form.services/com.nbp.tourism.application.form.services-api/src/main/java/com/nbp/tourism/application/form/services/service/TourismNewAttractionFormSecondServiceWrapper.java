/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecondService
 * @generated
 */
public class TourismNewAttractionFormSecondServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormSecondService>,
			   TourismNewAttractionFormSecondService {

	public TourismNewAttractionFormSecondServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormSecondServiceWrapper(
		TourismNewAttractionFormSecondService
			tourismNewAttractionFormSecondService) {

		_tourismNewAttractionFormSecondService =
			tourismNewAttractionFormSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormSecondService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAttractionFormSecondService getWrappedService() {
		return _tourismNewAttractionFormSecondService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormSecondService
			tourismNewAttractionFormSecondService) {

		_tourismNewAttractionFormSecondService =
			tourismNewAttractionFormSecondService;
	}

	private TourismNewAttractionFormSecondService
		_tourismNewAttractionFormSecondService;

}