/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraApplicationDeskVeriService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeriService
 * @generated
 */
public class HsraApplicationDeskVeriServiceWrapper
	implements HsraApplicationDeskVeriService,
			   ServiceWrapper<HsraApplicationDeskVeriService> {

	public HsraApplicationDeskVeriServiceWrapper() {
		this(null);
	}

	public HsraApplicationDeskVeriServiceWrapper(
		HsraApplicationDeskVeriService hsraApplicationDeskVeriService) {

		_hsraApplicationDeskVeriService = hsraApplicationDeskVeriService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationDeskVeriService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraApplicationDeskVeriService getWrappedService() {
		return _hsraApplicationDeskVeriService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationDeskVeriService hsraApplicationDeskVeriService) {

		_hsraApplicationDeskVeriService = hsraApplicationDeskVeriService;
	}

	private HsraApplicationDeskVeriService _hsraApplicationDeskVeriService;

}