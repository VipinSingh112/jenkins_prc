/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantUserUndertakingInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfoService
 * @generated
 */
public class SezOccupantUserUndertakingInfoServiceWrapper
	implements ServiceWrapper<SezOccupantUserUndertakingInfoService>,
			   SezOccupantUserUndertakingInfoService {

	public SezOccupantUserUndertakingInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantUserUndertakingInfoServiceWrapper(
		SezOccupantUserUndertakingInfoService
			sezOccupantUserUndertakingInfoService) {

		_sezOccupantUserUndertakingInfoService =
			sezOccupantUserUndertakingInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantUserUndertakingInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantUserUndertakingInfoService getWrappedService() {
		return _sezOccupantUserUndertakingInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantUserUndertakingInfoService
			sezOccupantUserUndertakingInfoService) {

		_sezOccupantUserUndertakingInfoService =
			sezOccupantUserUndertakingInfoService;
	}

	private SezOccupantUserUndertakingInfoService
		_sezOccupantUserUndertakingInfoService;

}