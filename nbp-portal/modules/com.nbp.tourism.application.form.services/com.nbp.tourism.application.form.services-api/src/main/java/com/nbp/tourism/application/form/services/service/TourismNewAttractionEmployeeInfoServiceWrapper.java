/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAttractionEmployeeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoService
 * @generated
 */
public class TourismNewAttractionEmployeeInfoServiceWrapper
	implements ServiceWrapper<TourismNewAttractionEmployeeInfoService>,
			   TourismNewAttractionEmployeeInfoService {

	public TourismNewAttractionEmployeeInfoServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionEmployeeInfoServiceWrapper(
		TourismNewAttractionEmployeeInfoService
			tourismNewAttractionEmployeeInfoService) {

		_tourismNewAttractionEmployeeInfoService =
			tourismNewAttractionEmployeeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionEmployeeInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAttractionEmployeeInfoService getWrappedService() {
		return _tourismNewAttractionEmployeeInfoService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionEmployeeInfoService
			tourismNewAttractionEmployeeInfoService) {

		_tourismNewAttractionEmployeeInfoService =
			tourismNewAttractionEmployeeInfoService;
	}

	private TourismNewAttractionEmployeeInfoService
		_tourismNewAttractionEmployeeInfoService;

}