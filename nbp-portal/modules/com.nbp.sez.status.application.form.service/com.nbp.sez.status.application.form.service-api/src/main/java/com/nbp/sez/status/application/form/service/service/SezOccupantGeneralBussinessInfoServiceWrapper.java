/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantGeneralBussinessInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfoService
 * @generated
 */
public class SezOccupantGeneralBussinessInfoServiceWrapper
	implements ServiceWrapper<SezOccupantGeneralBussinessInfoService>,
			   SezOccupantGeneralBussinessInfoService {

	public SezOccupantGeneralBussinessInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantGeneralBussinessInfoServiceWrapper(
		SezOccupantGeneralBussinessInfoService
			sezOccupantGeneralBussinessInfoService) {

		_sezOccupantGeneralBussinessInfoService =
			sezOccupantGeneralBussinessInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantGeneralBussinessInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantGeneralBussinessInfoService getWrappedService() {
		return _sezOccupantGeneralBussinessInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantGeneralBussinessInfoService
			sezOccupantGeneralBussinessInfoService) {

		_sezOccupantGeneralBussinessInfoService =
			sezOccupantGeneralBussinessInfoService;
	}

	private SezOccupantGeneralBussinessInfoService
		_sezOccupantGeneralBussinessInfoService;

}