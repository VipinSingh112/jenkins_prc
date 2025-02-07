/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisFeeMasterService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMasterService
 * @generated
 */
public class CannabisFeeMasterServiceWrapper
	implements CannabisFeeMasterService,
			   ServiceWrapper<CannabisFeeMasterService> {

	public CannabisFeeMasterServiceWrapper() {
		this(null);
	}

	public CannabisFeeMasterServiceWrapper(
		CannabisFeeMasterService cannabisFeeMasterService) {

		_cannabisFeeMasterService = cannabisFeeMasterService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisFeeMasterService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisFeeMasterService getWrappedService() {
		return _cannabisFeeMasterService;
	}

	@Override
	public void setWrappedService(
		CannabisFeeMasterService cannabisFeeMasterService) {

		_cannabisFeeMasterService = cannabisFeeMasterService;
	}

	private CannabisFeeMasterService _cannabisFeeMasterService;

}