/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevInvestmentAndFinancialService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancialService
 * @generated
 */
public class SezDevInvestmentAndFinancialServiceWrapper
	implements ServiceWrapper<SezDevInvestmentAndFinancialService>,
			   SezDevInvestmentAndFinancialService {

	public SezDevInvestmentAndFinancialServiceWrapper() {
		this(null);
	}

	public SezDevInvestmentAndFinancialServiceWrapper(
		SezDevInvestmentAndFinancialService
			sezDevInvestmentAndFinancialService) {

		_sezDevInvestmentAndFinancialService =
			sezDevInvestmentAndFinancialService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevInvestmentAndFinancialService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevInvestmentAndFinancialService getWrappedService() {
		return _sezDevInvestmentAndFinancialService;
	}

	@Override
	public void setWrappedService(
		SezDevInvestmentAndFinancialService
			sezDevInvestmentAndFinancialService) {

		_sezDevInvestmentAndFinancialService =
			sezDevInvestmentAndFinancialService;
	}

	private SezDevInvestmentAndFinancialService
		_sezDevInvestmentAndFinancialService;

}