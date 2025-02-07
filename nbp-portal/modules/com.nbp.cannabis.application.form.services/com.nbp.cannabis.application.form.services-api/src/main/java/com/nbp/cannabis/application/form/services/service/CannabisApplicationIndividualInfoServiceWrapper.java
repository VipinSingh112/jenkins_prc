/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationIndividualInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfoService
 * @generated
 */
public class CannabisApplicationIndividualInfoServiceWrapper
	implements CannabisApplicationIndividualInfoService,
			   ServiceWrapper<CannabisApplicationIndividualInfoService> {

	public CannabisApplicationIndividualInfoServiceWrapper() {
		this(null);
	}

	public CannabisApplicationIndividualInfoServiceWrapper(
		CannabisApplicationIndividualInfoService
			cannabisApplicationIndividualInfoService) {

		_cannabisApplicationIndividualInfoService =
			cannabisApplicationIndividualInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationIndividualInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationIndividualInfoService getWrappedService() {
		return _cannabisApplicationIndividualInfoService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationIndividualInfoService
			cannabisApplicationIndividualInfoService) {

		_cannabisApplicationIndividualInfoService =
			cannabisApplicationIndividualInfoService;
	}

	private CannabisApplicationIndividualInfoService
		_cannabisApplicationIndividualInfoService;

}