/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjApplicantDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicantDetailService
 * @generated
 */
public class NcbjApplicantDetailServiceWrapper
	implements NcbjApplicantDetailService,
			   ServiceWrapper<NcbjApplicantDetailService> {

	public NcbjApplicantDetailServiceWrapper() {
		this(null);
	}

	public NcbjApplicantDetailServiceWrapper(
		NcbjApplicantDetailService ncbjApplicantDetailService) {

		_ncbjApplicantDetailService = ncbjApplicantDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicantDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjApplicantDetailService getWrappedService() {
		return _ncbjApplicantDetailService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicantDetailService ncbjApplicantDetailService) {

		_ncbjApplicantDetailService = ncbjApplicantDetailService;
	}

	private NcbjApplicantDetailService _ncbjApplicantDetailService;

}