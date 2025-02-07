/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisSupplementalInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformationService
 * @generated
 */
public class CannabisSupplementalInformationServiceWrapper
	implements CannabisSupplementalInformationService,
			   ServiceWrapper<CannabisSupplementalInformationService> {

	public CannabisSupplementalInformationServiceWrapper() {
		this(null);
	}

	public CannabisSupplementalInformationServiceWrapper(
		CannabisSupplementalInformationService
			cannabisSupplementalInformationService) {

		_cannabisSupplementalInformationService =
			cannabisSupplementalInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisSupplementalInformationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisSupplementalInformationService getWrappedService() {
		return _cannabisSupplementalInformationService;
	}

	@Override
	public void setWrappedService(
		CannabisSupplementalInformationService
			cannabisSupplementalInformationService) {

		_cannabisSupplementalInformationService =
			cannabisSupplementalInformationService;
	}

	private CannabisSupplementalInformationService
		_cannabisSupplementalInformationService;

}