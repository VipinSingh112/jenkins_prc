/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DetailOfApplicantService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantService
 * @generated
 */
public class DetailOfApplicantServiceWrapper
	implements DetailOfApplicantService,
			   ServiceWrapper<DetailOfApplicantService> {

	public DetailOfApplicantServiceWrapper() {
		this(null);
	}

	public DetailOfApplicantServiceWrapper(
		DetailOfApplicantService detailOfApplicantService) {

		_detailOfApplicantService = detailOfApplicantService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfApplicantService.getOSGiServiceIdentifier();
	}

	@Override
	public DetailOfApplicantService getWrappedService() {
		return _detailOfApplicantService;
	}

	@Override
	public void setWrappedService(
		DetailOfApplicantService detailOfApplicantService) {

		_detailOfApplicantService = detailOfApplicantService;
	}

	private DetailOfApplicantService _detailOfApplicantService;

}