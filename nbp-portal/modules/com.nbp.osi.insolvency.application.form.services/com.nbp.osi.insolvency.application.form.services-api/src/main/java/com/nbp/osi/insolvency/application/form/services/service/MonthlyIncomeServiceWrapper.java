/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MonthlyIncomeService}.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomeService
 * @generated
 */
public class MonthlyIncomeServiceWrapper
	implements MonthlyIncomeService, ServiceWrapper<MonthlyIncomeService> {

	public MonthlyIncomeServiceWrapper() {
		this(null);
	}

	public MonthlyIncomeServiceWrapper(
		MonthlyIncomeService monthlyIncomeService) {

		_monthlyIncomeService = monthlyIncomeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _monthlyIncomeService.getOSGiServiceIdentifier();
	}

	@Override
	public MonthlyIncomeService getWrappedService() {
		return _monthlyIncomeService;
	}

	@Override
	public void setWrappedService(MonthlyIncomeService monthlyIncomeService) {
		_monthlyIncomeService = monthlyIncomeService;
	}

	private MonthlyIncomeService _monthlyIncomeService;

}