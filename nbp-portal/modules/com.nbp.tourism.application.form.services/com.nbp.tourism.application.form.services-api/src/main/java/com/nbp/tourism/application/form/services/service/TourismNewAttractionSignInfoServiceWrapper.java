/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAttractionSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionSignInfoService
 * @generated
 */
public class TourismNewAttractionSignInfoServiceWrapper
	implements ServiceWrapper<TourismNewAttractionSignInfoService>,
			   TourismNewAttractionSignInfoService {

	public TourismNewAttractionSignInfoServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionSignInfoServiceWrapper(
		TourismNewAttractionSignInfoService
			tourismNewAttractionSignInfoService) {

		_tourismNewAttractionSignInfoService =
			tourismNewAttractionSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAttractionSignInfoService getWrappedService() {
		return _tourismNewAttractionSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionSignInfoService
			tourismNewAttractionSignInfoService) {

		_tourismNewAttractionSignInfoService =
			tourismNewAttractionSignInfoService;
	}

	private TourismNewAttractionSignInfoService
		_tourismNewAttractionSignInfoService;

}