/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionDomesticServiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticServiceService
 * @generated
 */
public class AttractionDomesticServiceServiceWrapper
	implements AttractionDomesticServiceService,
			   ServiceWrapper<AttractionDomesticServiceService> {

	public AttractionDomesticServiceServiceWrapper() {
		this(null);
	}

	public AttractionDomesticServiceServiceWrapper(
		AttractionDomesticServiceService attractionDomesticServiceService) {

		_attractionDomesticServiceService = attractionDomesticServiceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionDomesticServiceService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionDomesticServiceService getWrappedService() {
		return _attractionDomesticServiceService;
	}

	@Override
	public void setWrappedService(
		AttractionDomesticServiceService attractionDomesticServiceService) {

		_attractionDomesticServiceService = attractionDomesticServiceService;
	}

	private AttractionDomesticServiceService _attractionDomesticServiceService;

}