/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiTotalMonthlyExpenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpenseService
 * @generated
 */
public class OsiTotalMonthlyExpenseServiceWrapper
	implements OsiTotalMonthlyExpenseService,
			   ServiceWrapper<OsiTotalMonthlyExpenseService> {

	public OsiTotalMonthlyExpenseServiceWrapper() {
		this(null);
	}

	public OsiTotalMonthlyExpenseServiceWrapper(
		OsiTotalMonthlyExpenseService osiTotalMonthlyExpenseService) {

		_osiTotalMonthlyExpenseService = osiTotalMonthlyExpenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiTotalMonthlyExpenseService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiTotalMonthlyExpenseService getWrappedService() {
		return _osiTotalMonthlyExpenseService;
	}

	@Override
	public void setWrappedService(
		OsiTotalMonthlyExpenseService osiTotalMonthlyExpenseService) {

		_osiTotalMonthlyExpenseService = osiTotalMonthlyExpenseService;
	}

	private OsiTotalMonthlyExpenseService _osiTotalMonthlyExpenseService;

}