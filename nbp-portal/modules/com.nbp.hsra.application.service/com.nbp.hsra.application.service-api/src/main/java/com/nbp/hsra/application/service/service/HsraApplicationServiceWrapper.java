/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationService
 * @generated
 */
public class HsraApplicationServiceWrapper
	implements HsraApplicationService, ServiceWrapper<HsraApplicationService> {

	public HsraApplicationServiceWrapper() {
		this(null);
	}

	public HsraApplicationServiceWrapper(
		HsraApplicationService hsraApplicationService) {

		_hsraApplicationService = hsraApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraApplicationService getWrappedService() {
		return _hsraApplicationService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationService hsraApplicationService) {

		_hsraApplicationService = hsraApplicationService;
	}

	private HsraApplicationService _hsraApplicationService;

}