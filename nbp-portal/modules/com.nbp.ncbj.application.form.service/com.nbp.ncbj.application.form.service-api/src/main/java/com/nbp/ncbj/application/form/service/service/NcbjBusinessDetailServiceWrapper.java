/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjBusinessDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailService
 * @generated
 */
public class NcbjBusinessDetailServiceWrapper
	implements NcbjBusinessDetailService,
			   ServiceWrapper<NcbjBusinessDetailService> {

	public NcbjBusinessDetailServiceWrapper() {
		this(null);
	}

	public NcbjBusinessDetailServiceWrapper(
		NcbjBusinessDetailService ncbjBusinessDetailService) {

		_ncbjBusinessDetailService = ncbjBusinessDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjBusinessDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjBusinessDetailService getWrappedService() {
		return _ncbjBusinessDetailService;
	}

	@Override
	public void setWrappedService(
		NcbjBusinessDetailService ncbjBusinessDetailService) {

		_ncbjBusinessDetailService = ncbjBusinessDetailService;
	}

	private NcbjBusinessDetailService _ncbjBusinessDetailService;

}