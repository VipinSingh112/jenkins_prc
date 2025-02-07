/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatementOfFinancialHistoryService}.
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistoryService
 * @generated
 */
public class StatementOfFinancialHistoryServiceWrapper
	implements ServiceWrapper<StatementOfFinancialHistoryService>,
			   StatementOfFinancialHistoryService {

	public StatementOfFinancialHistoryServiceWrapper() {
		this(null);
	}

	public StatementOfFinancialHistoryServiceWrapper(
		StatementOfFinancialHistoryService statementOfFinancialHistoryService) {

		_statementOfFinancialHistoryService =
			statementOfFinancialHistoryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _statementOfFinancialHistoryService.getOSGiServiceIdentifier();
	}

	@Override
	public StatementOfFinancialHistoryService getWrappedService() {
		return _statementOfFinancialHistoryService;
	}

	@Override
	public void setWrappedService(
		StatementOfFinancialHistoryService statementOfFinancialHistoryService) {

		_statementOfFinancialHistoryService =
			statementOfFinancialHistoryService;
	}

	private StatementOfFinancialHistoryService
		_statementOfFinancialHistoryService;

}