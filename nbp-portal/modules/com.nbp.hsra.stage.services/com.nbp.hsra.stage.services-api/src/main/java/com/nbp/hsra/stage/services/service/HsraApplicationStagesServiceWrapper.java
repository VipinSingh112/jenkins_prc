/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesService
 * @generated
 */
public class HsraApplicationStagesServiceWrapper
	implements HsraApplicationStagesService,
			   ServiceWrapper<HsraApplicationStagesService> {

	public HsraApplicationStagesServiceWrapper() {
		this(null);
	}

	public HsraApplicationStagesServiceWrapper(
		HsraApplicationStagesService hsraApplicationStagesService) {

		_hsraApplicationStagesService = hsraApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraApplicationStagesService getWrappedService() {
		return _hsraApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationStagesService hsraApplicationStagesService) {

		_hsraApplicationStagesService = hsraApplicationStagesService;
	}

	private HsraApplicationStagesService _hsraApplicationStagesService;

}