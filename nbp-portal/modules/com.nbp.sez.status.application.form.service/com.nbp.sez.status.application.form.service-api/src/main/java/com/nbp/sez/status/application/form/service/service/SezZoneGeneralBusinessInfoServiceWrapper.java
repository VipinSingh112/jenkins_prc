/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneGeneralBusinessInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfoService
 * @generated
 */
public class SezZoneGeneralBusinessInfoServiceWrapper
	implements ServiceWrapper<SezZoneGeneralBusinessInfoService>,
			   SezZoneGeneralBusinessInfoService {

	public SezZoneGeneralBusinessInfoServiceWrapper() {
		this(null);
	}

	public SezZoneGeneralBusinessInfoServiceWrapper(
		SezZoneGeneralBusinessInfoService sezZoneGeneralBusinessInfoService) {

		_sezZoneGeneralBusinessInfoService = sezZoneGeneralBusinessInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneGeneralBusinessInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneGeneralBusinessInfoService getWrappedService() {
		return _sezZoneGeneralBusinessInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneGeneralBusinessInfoService sezZoneGeneralBusinessInfoService) {

		_sezZoneGeneralBusinessInfoService = sezZoneGeneralBusinessInfoService;
	}

	private SezZoneGeneralBusinessInfoService
		_sezZoneGeneralBusinessInfoService;

}