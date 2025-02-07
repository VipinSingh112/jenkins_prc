/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MonthlyExpensesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesService
 * @generated
 */
public class MonthlyExpensesServiceWrapper
	implements MonthlyExpensesService, ServiceWrapper<MonthlyExpensesService> {

	public MonthlyExpensesServiceWrapper() {
		this(null);
	}

	public MonthlyExpensesServiceWrapper(
		MonthlyExpensesService monthlyExpensesService) {

		_monthlyExpensesService = monthlyExpensesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _monthlyExpensesService.getOSGiServiceIdentifier();
	}

	@Override
	public MonthlyExpensesService getWrappedService() {
		return _monthlyExpensesService;
	}

	@Override
	public void setWrappedService(
		MonthlyExpensesService monthlyExpensesService) {

		_monthlyExpensesService = monthlyExpensesService;
	}

	private MonthlyExpensesService _monthlyExpensesService;

}