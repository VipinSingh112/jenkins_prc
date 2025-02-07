/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionTravelAgencyService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyService
 * @generated
 */
public class AttractionTravelAgencyServiceWrapper
	implements AttractionTravelAgencyService,
			   ServiceWrapper<AttractionTravelAgencyService> {

	public AttractionTravelAgencyServiceWrapper() {
		this(null);
	}

	public AttractionTravelAgencyServiceWrapper(
		AttractionTravelAgencyService attractionTravelAgencyService) {

		_attractionTravelAgencyService = attractionTravelAgencyService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionTravelAgencyService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionTravelAgencyService getWrappedService() {
		return _attractionTravelAgencyService;
	}

	@Override
	public void setWrappedService(
		AttractionTravelAgencyService attractionTravelAgencyService) {

		_attractionTravelAgencyService = attractionTravelAgencyService;
	}

	private AttractionTravelAgencyService _attractionTravelAgencyService;

}