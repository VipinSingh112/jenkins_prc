/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantShareHoldingInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfoService
 * @generated
 */
public class SezOccupantShareHoldingInfoServiceWrapper
	implements ServiceWrapper<SezOccupantShareHoldingInfoService>,
			   SezOccupantShareHoldingInfoService {

	public SezOccupantShareHoldingInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantShareHoldingInfoServiceWrapper(
		SezOccupantShareHoldingInfoService sezOccupantShareHoldingInfoService) {

		_sezOccupantShareHoldingInfoService =
			sezOccupantShareHoldingInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantShareHoldingInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantShareHoldingInfoService getWrappedService() {
		return _sezOccupantShareHoldingInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantShareHoldingInfoService sezOccupantShareHoldingInfoService) {

		_sezOccupantShareHoldingInfoService =
			sezOccupantShareHoldingInfoService;
	}

	private SezOccupantShareHoldingInfoService
		_sezOccupantShareHoldingInfoService;

}