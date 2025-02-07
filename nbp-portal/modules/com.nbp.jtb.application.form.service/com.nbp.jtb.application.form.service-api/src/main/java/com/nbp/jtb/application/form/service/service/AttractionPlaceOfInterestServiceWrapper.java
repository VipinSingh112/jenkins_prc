/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionPlaceOfInterestService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterestService
 * @generated
 */
public class AttractionPlaceOfInterestServiceWrapper
	implements AttractionPlaceOfInterestService,
			   ServiceWrapper<AttractionPlaceOfInterestService> {

	public AttractionPlaceOfInterestServiceWrapper() {
		this(null);
	}

	public AttractionPlaceOfInterestServiceWrapper(
		AttractionPlaceOfInterestService attractionPlaceOfInterestService) {

		_attractionPlaceOfInterestService = attractionPlaceOfInterestService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionPlaceOfInterestService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionPlaceOfInterestService getWrappedService() {
		return _attractionPlaceOfInterestService;
	}

	@Override
	public void setWrappedService(
		AttractionPlaceOfInterestService attractionPlaceOfInterestService) {

		_attractionPlaceOfInterestService = attractionPlaceOfInterestService;
	}

	private AttractionPlaceOfInterestService _attractionPlaceOfInterestService;

}