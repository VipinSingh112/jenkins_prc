/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraApplicantDetailInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfoService
 * @generated
 */
public class NcraApplicantDetailInfoServiceWrapper
	implements NcraApplicantDetailInfoService,
			   ServiceWrapper<NcraApplicantDetailInfoService> {

	public NcraApplicantDetailInfoServiceWrapper() {
		this(null);
	}

	public NcraApplicantDetailInfoServiceWrapper(
		NcraApplicantDetailInfoService ncraApplicantDetailInfoService) {

		_ncraApplicantDetailInfoService = ncraApplicantDetailInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraApplicantDetailInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraApplicantDetailInfoService getWrappedService() {
		return _ncraApplicantDetailInfoService;
	}

	@Override
	public void setWrappedService(
		NcraApplicantDetailInfoService ncraApplicantDetailInfoService) {

		_ncraApplicantDetailInfoService = ncraApplicantDetailInfoService;
	}

	private NcraApplicantDetailInfoService _ncraApplicantDetailInfoService;

}