/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FinancialPositionService}.
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPositionService
 * @generated
 */
public class FinancialPositionServiceWrapper
	implements FinancialPositionService,
			   ServiceWrapper<FinancialPositionService> {

	public FinancialPositionServiceWrapper() {
		this(null);
	}

	public FinancialPositionServiceWrapper(
		FinancialPositionService financialPositionService) {

		_financialPositionService = financialPositionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _financialPositionService.getOSGiServiceIdentifier();
	}

	@Override
	public FinancialPositionService getWrappedService() {
		return _financialPositionService;
	}

	@Override
	public void setWrappedService(
		FinancialPositionService financialPositionService) {

		_financialPositionService = financialPositionService;
	}

	private FinancialPositionService _financialPositionService;

}