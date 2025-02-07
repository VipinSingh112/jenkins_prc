/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneUserUnderInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoService
 * @generated
 */
public class SezZoneUserUnderInfoServiceWrapper
	implements ServiceWrapper<SezZoneUserUnderInfoService>,
			   SezZoneUserUnderInfoService {

	public SezZoneUserUnderInfoServiceWrapper() {
		this(null);
	}

	public SezZoneUserUnderInfoServiceWrapper(
		SezZoneUserUnderInfoService sezZoneUserUnderInfoService) {

		_sezZoneUserUnderInfoService = sezZoneUserUnderInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneUserUnderInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneUserUnderInfoService getWrappedService() {
		return _sezZoneUserUnderInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneUserUnderInfoService sezZoneUserUnderInfoService) {

		_sezZoneUserUnderInfoService = sezZoneUserUnderInfoService;
	}

	private SezZoneUserUnderInfoService _sezZoneUserUnderInfoService;

}