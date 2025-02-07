/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneDevUnderInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfoService
 * @generated
 */
public class SezZoneDevUnderInfoServiceWrapper
	implements ServiceWrapper<SezZoneDevUnderInfoService>,
			   SezZoneDevUnderInfoService {

	public SezZoneDevUnderInfoServiceWrapper() {
		this(null);
	}

	public SezZoneDevUnderInfoServiceWrapper(
		SezZoneDevUnderInfoService sezZoneDevUnderInfoService) {

		_sezZoneDevUnderInfoService = sezZoneDevUnderInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneDevUnderInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneDevUnderInfoService getWrappedService() {
		return _sezZoneDevUnderInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneDevUnderInfoService sezZoneDevUnderInfoService) {

		_sezZoneDevUnderInfoService = sezZoneDevUnderInfoService;
	}

	private SezZoneDevUnderInfoService _sezZoneDevUnderInfoService;

}