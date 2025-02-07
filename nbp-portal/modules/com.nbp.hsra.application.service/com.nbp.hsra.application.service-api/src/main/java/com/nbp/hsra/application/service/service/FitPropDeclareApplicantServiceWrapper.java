/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FitPropDeclareApplicantService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicantService
 * @generated
 */
public class FitPropDeclareApplicantServiceWrapper
	implements FitPropDeclareApplicantService,
			   ServiceWrapper<FitPropDeclareApplicantService> {

	public FitPropDeclareApplicantServiceWrapper() {
		this(null);
	}

	public FitPropDeclareApplicantServiceWrapper(
		FitPropDeclareApplicantService fitPropDeclareApplicantService) {

		_fitPropDeclareApplicantService = fitPropDeclareApplicantService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropDeclareApplicantService.getOSGiServiceIdentifier();
	}

	@Override
	public FitPropDeclareApplicantService getWrappedService() {
		return _fitPropDeclareApplicantService;
	}

	@Override
	public void setWrappedService(
		FitPropDeclareApplicantService fitPropDeclareApplicantService) {

		_fitPropDeclareApplicantService = fitPropDeclareApplicantService;
	}

	private FitPropDeclareApplicantService _fitPropDeclareApplicantService;

}