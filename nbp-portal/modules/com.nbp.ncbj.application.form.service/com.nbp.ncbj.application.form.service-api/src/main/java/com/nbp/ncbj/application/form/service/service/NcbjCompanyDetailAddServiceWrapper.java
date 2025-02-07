/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjCompanyDetailAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailAddService
 * @generated
 */
public class NcbjCompanyDetailAddServiceWrapper
	implements NcbjCompanyDetailAddService,
			   ServiceWrapper<NcbjCompanyDetailAddService> {

	public NcbjCompanyDetailAddServiceWrapper() {
		this(null);
	}

	public NcbjCompanyDetailAddServiceWrapper(
		NcbjCompanyDetailAddService ncbjCompanyDetailAddService) {

		_ncbjCompanyDetailAddService = ncbjCompanyDetailAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyDetailAddService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjCompanyDetailAddService getWrappedService() {
		return _ncbjCompanyDetailAddService;
	}

	@Override
	public void setWrappedService(
		NcbjCompanyDetailAddService ncbjCompanyDetailAddService) {

		_ncbjCompanyDetailAddService = ncbjCompanyDetailAddService;
	}

	private NcbjCompanyDetailAddService _ncbjCompanyDetailAddService;

}