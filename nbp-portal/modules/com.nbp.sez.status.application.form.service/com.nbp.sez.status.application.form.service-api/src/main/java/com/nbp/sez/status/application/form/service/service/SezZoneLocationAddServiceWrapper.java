/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneLocationAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddService
 * @generated
 */
public class SezZoneLocationAddServiceWrapper
	implements ServiceWrapper<SezZoneLocationAddService>,
			   SezZoneLocationAddService {

	public SezZoneLocationAddServiceWrapper() {
		this(null);
	}

	public SezZoneLocationAddServiceWrapper(
		SezZoneLocationAddService sezZoneLocationAddService) {

		_sezZoneLocationAddService = sezZoneLocationAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneLocationAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneLocationAddService getWrappedService() {
		return _sezZoneLocationAddService;
	}

	@Override
	public void setWrappedService(
		SezZoneLocationAddService sezZoneLocationAddService) {

		_sezZoneLocationAddService = sezZoneLocationAddService;
	}

	private SezZoneLocationAddService _sezZoneLocationAddService;

}