/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjAddLocMultiSiteService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSiteService
 * @generated
 */
public class NcbjAddLocMultiSiteServiceWrapper
	implements NcbjAddLocMultiSiteService,
			   ServiceWrapper<NcbjAddLocMultiSiteService> {

	public NcbjAddLocMultiSiteServiceWrapper() {
		this(null);
	}

	public NcbjAddLocMultiSiteServiceWrapper(
		NcbjAddLocMultiSiteService ncbjAddLocMultiSiteService) {

		_ncbjAddLocMultiSiteService = ncbjAddLocMultiSiteService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAddLocMultiSiteService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjAddLocMultiSiteService getWrappedService() {
		return _ncbjAddLocMultiSiteService;
	}

	@Override
	public void setWrappedService(
		NcbjAddLocMultiSiteService ncbjAddLocMultiSiteService) {

		_ncbjAddLocMultiSiteService = ncbjAddLocMultiSiteService;
	}

	private NcbjAddLocMultiSiteService _ncbjAddLocMultiSiteService;

}