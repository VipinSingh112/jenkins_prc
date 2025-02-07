/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjBusinessDetailAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAddService
 * @generated
 */
public class NcbjBusinessDetailAddServiceWrapper
	implements NcbjBusinessDetailAddService,
			   ServiceWrapper<NcbjBusinessDetailAddService> {

	public NcbjBusinessDetailAddServiceWrapper() {
		this(null);
	}

	public NcbjBusinessDetailAddServiceWrapper(
		NcbjBusinessDetailAddService ncbjBusinessDetailAddService) {

		_ncbjBusinessDetailAddService = ncbjBusinessDetailAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjBusinessDetailAddService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjBusinessDetailAddService getWrappedService() {
		return _ncbjBusinessDetailAddService;
	}

	@Override
	public void setWrappedService(
		NcbjBusinessDetailAddService ncbjBusinessDetailAddService) {

		_ncbjBusinessDetailAddService = ncbjBusinessDetailAddService;
	}

	private NcbjBusinessDetailAddService _ncbjBusinessDetailAddService;

}