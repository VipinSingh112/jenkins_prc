/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NCBJCompanyNewService}.
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNewService
 * @generated
 */
public class NCBJCompanyNewServiceWrapper
	implements NCBJCompanyNewService, ServiceWrapper<NCBJCompanyNewService> {

	public NCBJCompanyNewServiceWrapper() {
		this(null);
	}

	public NCBJCompanyNewServiceWrapper(
		NCBJCompanyNewService ncbjCompanyNewService) {

		_ncbjCompanyNewService = ncbjCompanyNewService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyNewService.getOSGiServiceIdentifier();
	}

	@Override
	public NCBJCompanyNewService getWrappedService() {
		return _ncbjCompanyNewService;
	}

	@Override
	public void setWrappedService(NCBJCompanyNewService ncbjCompanyNewService) {
		_ncbjCompanyNewService = ncbjCompanyNewService;
	}

	private NCBJCompanyNewService _ncbjCompanyNewService;

}