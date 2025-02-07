/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantInvestAndFinanceInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfoService
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoServiceWrapper
	implements ServiceWrapper<SezOccupantInvestAndFinanceInfoService>,
			   SezOccupantInvestAndFinanceInfoService {

	public SezOccupantInvestAndFinanceInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantInvestAndFinanceInfoServiceWrapper(
		SezOccupantInvestAndFinanceInfoService
			sezOccupantInvestAndFinanceInfoService) {

		_sezOccupantInvestAndFinanceInfoService =
			sezOccupantInvestAndFinanceInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantInvestAndFinanceInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantInvestAndFinanceInfoService getWrappedService() {
		return _sezOccupantInvestAndFinanceInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantInvestAndFinanceInfoService
			sezOccupantInvestAndFinanceInfoService) {

		_sezOccupantInvestAndFinanceInfoService =
			sezOccupantInvestAndFinanceInfoService;
	}

	private SezOccupantInvestAndFinanceInfoService
		_sezOccupantInvestAndFinanceInfoService;

}