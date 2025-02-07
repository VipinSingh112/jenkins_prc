/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstService
 * @generated
 */
public class TourismNewAttractionFormFirstServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormFirstService>,
			   TourismNewAttractionFormFirstService {

	public TourismNewAttractionFormFirstServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormFirstServiceWrapper(
		TourismNewAttractionFormFirstService
			tourismNewAttractionFormFirstService) {

		_tourismNewAttractionFormFirstService =
			tourismNewAttractionFormFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAttractionFormFirstService getWrappedService() {
		return _tourismNewAttractionFormFirstService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormFirstService
			tourismNewAttractionFormFirstService) {

		_tourismNewAttractionFormFirstService =
			tourismNewAttractionFormFirstService;
	}

	private TourismNewAttractionFormFirstService
		_tourismNewAttractionFormFirstService;

}