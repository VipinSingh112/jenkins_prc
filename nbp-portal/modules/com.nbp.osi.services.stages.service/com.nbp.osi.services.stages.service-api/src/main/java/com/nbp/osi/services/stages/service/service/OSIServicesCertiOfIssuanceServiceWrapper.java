/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServicesCertiOfIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuanceService
 * @generated
 */
public class OSIServicesCertiOfIssuanceServiceWrapper
	implements OSIServicesCertiOfIssuanceService,
			   ServiceWrapper<OSIServicesCertiOfIssuanceService> {

	public OSIServicesCertiOfIssuanceServiceWrapper() {
		this(null);
	}

	public OSIServicesCertiOfIssuanceServiceWrapper(
		OSIServicesCertiOfIssuanceService osiServicesCertiOfIssuanceService) {

		_osiServicesCertiOfIssuanceService = osiServicesCertiOfIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesCertiOfIssuanceService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServicesCertiOfIssuanceService getWrappedService() {
		return _osiServicesCertiOfIssuanceService;
	}

	@Override
	public void setWrappedService(
		OSIServicesCertiOfIssuanceService osiServicesCertiOfIssuanceService) {

		_osiServicesCertiOfIssuanceService = osiServicesCertiOfIssuanceService;
	}

	private OSIServicesCertiOfIssuanceService
		_osiServicesCertiOfIssuanceService;

}