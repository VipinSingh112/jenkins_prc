/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionDomesticTourService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTourService
 * @generated
 */
public class AttractionDomesticTourServiceWrapper
	implements AttractionDomesticTourService,
			   ServiceWrapper<AttractionDomesticTourService> {

	public AttractionDomesticTourServiceWrapper() {
		this(null);
	}

	public AttractionDomesticTourServiceWrapper(
		AttractionDomesticTourService attractionDomesticTourService) {

		_attractionDomesticTourService = attractionDomesticTourService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionDomesticTourService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionDomesticTourService getWrappedService() {
		return _attractionDomesticTourService;
	}

	@Override
	public void setWrappedService(
		AttractionDomesticTourService attractionDomesticTourService) {

		_attractionDomesticTourService = attractionDomesticTourService;
	}

	private AttractionDomesticTourService _attractionDomesticTourService;

}