/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneSubCheckInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfoService
 * @generated
 */
public class SezZoneSubCheckInfoServiceWrapper
	implements ServiceWrapper<SezZoneSubCheckInfoService>,
			   SezZoneSubCheckInfoService {

	public SezZoneSubCheckInfoServiceWrapper() {
		this(null);
	}

	public SezZoneSubCheckInfoServiceWrapper(
		SezZoneSubCheckInfoService sezZoneSubCheckInfoService) {

		_sezZoneSubCheckInfoService = sezZoneSubCheckInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneSubCheckInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneSubCheckInfoService getWrappedService() {
		return _sezZoneSubCheckInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneSubCheckInfoService sezZoneSubCheckInfoService) {

		_sezZoneSubCheckInfoService = sezZoneSubCheckInfoService;
	}

	private SezZoneSubCheckInfoService _sezZoneSubCheckInfoService;

}