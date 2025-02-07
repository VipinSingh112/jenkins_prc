/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabActivitiesDescService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDescService
 * @generated
 */
public class AccMediLabActivitiesDescServiceWrapper
	implements AccMediLabActivitiesDescService,
			   ServiceWrapper<AccMediLabActivitiesDescService> {

	public AccMediLabActivitiesDescServiceWrapper() {
		this(null);
	}

	public AccMediLabActivitiesDescServiceWrapper(
		AccMediLabActivitiesDescService accMediLabActivitiesDescService) {

		_accMediLabActivitiesDescService = accMediLabActivitiesDescService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabActivitiesDescService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabActivitiesDescService getWrappedService() {
		return _accMediLabActivitiesDescService;
	}

	@Override
	public void setWrappedService(
		AccMediLabActivitiesDescService accMediLabActivitiesDescService) {

		_accMediLabActivitiesDescService = accMediLabActivitiesDescService;
	}

	private AccMediLabActivitiesDescService _accMediLabActivitiesDescService;

}