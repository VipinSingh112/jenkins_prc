/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyDirectorInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationService
 * @generated
 */
public class CreativeCompanyDirectorInformationServiceWrapper
	implements CreativeCompanyDirectorInformationService,
			   ServiceWrapper<CreativeCompanyDirectorInformationService> {

	public CreativeCompanyDirectorInformationServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDirectorInformationServiceWrapper(
		CreativeCompanyDirectorInformationService
			creativeCompanyDirectorInformationService) {

		_creativeCompanyDirectorInformationService =
			creativeCompanyDirectorInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDirectorInformationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyDirectorInformationService getWrappedService() {
		return _creativeCompanyDirectorInformationService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDirectorInformationService
			creativeCompanyDirectorInformationService) {

		_creativeCompanyDirectorInformationService =
			creativeCompanyDirectorInformationService;
	}

	private CreativeCompanyDirectorInformationService
		_creativeCompanyDirectorInformationService;

}