/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyFinancialPositionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionService
 * @generated
 */
public class CompanyFinancialPositionServiceWrapper
	implements CompanyFinancialPositionService,
			   ServiceWrapper<CompanyFinancialPositionService> {

	public CompanyFinancialPositionServiceWrapper() {
		this(null);
	}

	public CompanyFinancialPositionServiceWrapper(
		CompanyFinancialPositionService companyFinancialPositionService) {

		_companyFinancialPositionService = companyFinancialPositionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyFinancialPositionService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanyFinancialPositionService getWrappedService() {
		return _companyFinancialPositionService;
	}

	@Override
	public void setWrappedService(
		CompanyFinancialPositionService companyFinancialPositionService) {

		_companyFinancialPositionService = companyFinancialPositionService;
	}

	private CompanyFinancialPositionService _companyFinancialPositionService;

}