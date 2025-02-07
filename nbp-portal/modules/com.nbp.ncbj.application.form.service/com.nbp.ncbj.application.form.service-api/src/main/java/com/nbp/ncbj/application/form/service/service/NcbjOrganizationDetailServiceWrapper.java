/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjOrganizationDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetailService
 * @generated
 */
public class NcbjOrganizationDetailServiceWrapper
	implements NcbjOrganizationDetailService,
			   ServiceWrapper<NcbjOrganizationDetailService> {

	public NcbjOrganizationDetailServiceWrapper() {
		this(null);
	}

	public NcbjOrganizationDetailServiceWrapper(
		NcbjOrganizationDetailService ncbjOrganizationDetailService) {

		_ncbjOrganizationDetailService = ncbjOrganizationDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjOrganizationDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjOrganizationDetailService getWrappedService() {
		return _ncbjOrganizationDetailService;
	}

	@Override
	public void setWrappedService(
		NcbjOrganizationDetailService ncbjOrganizationDetailService) {

		_ncbjOrganizationDetailService = ncbjOrganizationDetailService;
	}

	private NcbjOrganizationDetailService _ncbjOrganizationDetailService;

}