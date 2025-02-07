/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneEmployInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoService
 * @generated
 */
public class SezZoneEmployInfoServiceWrapper
	implements ServiceWrapper<SezZoneEmployInfoService>,
			   SezZoneEmployInfoService {

	public SezZoneEmployInfoServiceWrapper() {
		this(null);
	}

	public SezZoneEmployInfoServiceWrapper(
		SezZoneEmployInfoService sezZoneEmployInfoService) {

		_sezZoneEmployInfoService = sezZoneEmployInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneEmployInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneEmployInfoService getWrappedService() {
		return _sezZoneEmployInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneEmployInfoService sezZoneEmployInfoService) {

		_sezZoneEmployInfoService = sezZoneEmployInfoService;
	}

	private SezZoneEmployInfoService _sezZoneEmployInfoService;

}