/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyApplicantInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationService
 * @generated
 */
public class CreativeCompanyApplicantInformationServiceWrapper
	implements CreativeCompanyApplicantInformationService,
			   ServiceWrapper<CreativeCompanyApplicantInformationService> {

	public CreativeCompanyApplicantInformationServiceWrapper() {
		this(null);
	}

	public CreativeCompanyApplicantInformationServiceWrapper(
		CreativeCompanyApplicantInformationService
			creativeCompanyApplicantInformationService) {

		_creativeCompanyApplicantInformationService =
			creativeCompanyApplicantInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyApplicantInformationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyApplicantInformationService getWrappedService() {
		return _creativeCompanyApplicantInformationService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyApplicantInformationService
			creativeCompanyApplicantInformationService) {

		_creativeCompanyApplicantInformationService =
			creativeCompanyApplicantInformationService;
	}

	private CreativeCompanyApplicantInformationService
		_creativeCompanyApplicantInformationService;

}