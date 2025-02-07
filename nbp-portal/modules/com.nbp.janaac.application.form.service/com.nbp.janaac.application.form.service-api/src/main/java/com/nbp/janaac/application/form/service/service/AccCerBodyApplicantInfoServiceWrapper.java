/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyApplicantInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfoService
 * @generated
 */
public class AccCerBodyApplicantInfoServiceWrapper
	implements AccCerBodyApplicantInfoService,
			   ServiceWrapper<AccCerBodyApplicantInfoService> {

	public AccCerBodyApplicantInfoServiceWrapper() {
		this(null);
	}

	public AccCerBodyApplicantInfoServiceWrapper(
		AccCerBodyApplicantInfoService accCerBodyApplicantInfoService) {

		_accCerBodyApplicantInfoService = accCerBodyApplicantInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyApplicantInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyApplicantInfoService getWrappedService() {
		return _accCerBodyApplicantInfoService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyApplicantInfoService accCerBodyApplicantInfoService) {

		_accCerBodyApplicantInfoService = accCerBodyApplicantInfoService;
	}

	private AccCerBodyApplicantInfoService _accCerBodyApplicantInfoService;

}