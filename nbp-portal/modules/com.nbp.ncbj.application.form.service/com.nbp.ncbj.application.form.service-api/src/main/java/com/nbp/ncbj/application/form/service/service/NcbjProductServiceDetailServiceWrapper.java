/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjProductServiceDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetailService
 * @generated
 */
public class NcbjProductServiceDetailServiceWrapper
	implements NcbjProductServiceDetailService,
			   ServiceWrapper<NcbjProductServiceDetailService> {

	public NcbjProductServiceDetailServiceWrapper() {
		this(null);
	}

	public NcbjProductServiceDetailServiceWrapper(
		NcbjProductServiceDetailService ncbjProductServiceDetailService) {

		_ncbjProductServiceDetailService = ncbjProductServiceDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjProductServiceDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjProductServiceDetailService getWrappedService() {
		return _ncbjProductServiceDetailService;
	}

	@Override
	public void setWrappedService(
		NcbjProductServiceDetailService ncbjProductServiceDetailService) {

		_ncbjProductServiceDetailService = ncbjProductServiceDetailService;
	}

	private NcbjProductServiceDetailService _ncbjProductServiceDetailService;

}