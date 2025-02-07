/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyGeneralInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformationService
 * @generated
 */
public class CreativeCompanyGeneralInformationServiceWrapper
	implements CreativeCompanyGeneralInformationService,
			   ServiceWrapper<CreativeCompanyGeneralInformationService> {

	public CreativeCompanyGeneralInformationServiceWrapper() {
		this(null);
	}

	public CreativeCompanyGeneralInformationServiceWrapper(
		CreativeCompanyGeneralInformationService
			creativeCompanyGeneralInformationService) {

		_creativeCompanyGeneralInformationService =
			creativeCompanyGeneralInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyGeneralInformationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyGeneralInformationService getWrappedService() {
		return _creativeCompanyGeneralInformationService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyGeneralInformationService
			creativeCompanyGeneralInformationService) {

		_creativeCompanyGeneralInformationService =
			creativeCompanyGeneralInformationService;
	}

	private CreativeCompanyGeneralInformationService
		_creativeCompanyGeneralInformationService;

}