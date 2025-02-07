/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionCarRentalLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicenceService
 * @generated
 */
public class AttractionCarRentalLicenceServiceWrapper
	implements AttractionCarRentalLicenceService,
			   ServiceWrapper<AttractionCarRentalLicenceService> {

	public AttractionCarRentalLicenceServiceWrapper() {
		this(null);
	}

	public AttractionCarRentalLicenceServiceWrapper(
		AttractionCarRentalLicenceService attractionCarRentalLicenceService) {

		_attractionCarRentalLicenceService = attractionCarRentalLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentalLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionCarRentalLicenceService getWrappedService() {
		return _attractionCarRentalLicenceService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentalLicenceService attractionCarRentalLicenceService) {

		_attractionCarRentalLicenceService = attractionCarRentalLicenceService;
	}

	private AttractionCarRentalLicenceService
		_attractionCarRentalLicenceService;

}