/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisCollobartionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionService
 * @generated
 */
public class CannabisCollobartionServiceWrapper
	implements CannabisCollobartionService,
			   ServiceWrapper<CannabisCollobartionService> {

	public CannabisCollobartionServiceWrapper() {
		this(null);
	}

	public CannabisCollobartionServiceWrapper(
		CannabisCollobartionService cannabisCollobartionService) {

		_cannabisCollobartionService = cannabisCollobartionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisCollobartionService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisCollobartionService getWrappedService() {
		return _cannabisCollobartionService;
	}

	@Override
	public void setWrappedService(
		CannabisCollobartionService cannabisCollobartionService) {

		_cannabisCollobartionService = cannabisCollobartionService;
	}

	private CannabisCollobartionService _cannabisCollobartionService;

}