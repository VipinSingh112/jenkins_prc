/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionTravelHaltAppService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltAppService
 * @generated
 */
public class AttractionTravelHaltAppServiceWrapper
	implements AttractionTravelHaltAppService,
			   ServiceWrapper<AttractionTravelHaltAppService> {

	public AttractionTravelHaltAppServiceWrapper() {
		this(null);
	}

	public AttractionTravelHaltAppServiceWrapper(
		AttractionTravelHaltAppService attractionTravelHaltAppService) {

		_attractionTravelHaltAppService = attractionTravelHaltAppService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionTravelHaltAppService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionTravelHaltAppService getWrappedService() {
		return _attractionTravelHaltAppService;
	}

	@Override
	public void setWrappedService(
		AttractionTravelHaltAppService attractionTravelHaltAppService) {

		_attractionTravelHaltAppService = attractionTravelHaltAppService;
	}

	private AttractionTravelHaltAppService _attractionTravelHaltAppService;

}