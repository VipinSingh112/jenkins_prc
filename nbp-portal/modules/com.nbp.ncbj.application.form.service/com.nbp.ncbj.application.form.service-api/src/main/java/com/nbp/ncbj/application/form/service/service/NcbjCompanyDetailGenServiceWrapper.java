/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjCompanyDetailGenService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenService
 * @generated
 */
public class NcbjCompanyDetailGenServiceWrapper
	implements NcbjCompanyDetailGenService,
			   ServiceWrapper<NcbjCompanyDetailGenService> {

	public NcbjCompanyDetailGenServiceWrapper() {
		this(null);
	}

	public NcbjCompanyDetailGenServiceWrapper(
		NcbjCompanyDetailGenService ncbjCompanyDetailGenService) {

		_ncbjCompanyDetailGenService = ncbjCompanyDetailGenService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyDetailGenService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjCompanyDetailGenService getWrappedService() {
		return _ncbjCompanyDetailGenService;
	}

	@Override
	public void setWrappedService(
		NcbjCompanyDetailGenService ncbjCompanyDetailGenService) {

		_ncbjCompanyDetailGenService = ncbjCompanyDetailGenService;
	}

	private NcbjCompanyDetailGenService _ncbjCompanyDetailGenService;

}