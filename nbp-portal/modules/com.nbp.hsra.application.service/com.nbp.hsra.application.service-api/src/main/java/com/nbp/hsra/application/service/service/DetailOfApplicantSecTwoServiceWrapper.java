/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DetailOfApplicantSecTwoService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwoService
 * @generated
 */
public class DetailOfApplicantSecTwoServiceWrapper
	implements DetailOfApplicantSecTwoService,
			   ServiceWrapper<DetailOfApplicantSecTwoService> {

	public DetailOfApplicantSecTwoServiceWrapper() {
		this(null);
	}

	public DetailOfApplicantSecTwoServiceWrapper(
		DetailOfApplicantSecTwoService detailOfApplicantSecTwoService) {

		_detailOfApplicantSecTwoService = detailOfApplicantSecTwoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfApplicantSecTwoService.getOSGiServiceIdentifier();
	}

	@Override
	public DetailOfApplicantSecTwoService getWrappedService() {
		return _detailOfApplicantSecTwoService;
	}

	@Override
	public void setWrappedService(
		DetailOfApplicantSecTwoService detailOfApplicantSecTwoService) {

		_detailOfApplicantSecTwoService = detailOfApplicantSecTwoService;
	}

	private DetailOfApplicantSecTwoService _detailOfApplicantSecTwoService;

}