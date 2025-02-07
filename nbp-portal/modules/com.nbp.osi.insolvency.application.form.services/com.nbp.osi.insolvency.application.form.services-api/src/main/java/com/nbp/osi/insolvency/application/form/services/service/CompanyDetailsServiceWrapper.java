/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetailsService
 * @generated
 */
public class CompanyDetailsServiceWrapper
	implements CompanyDetailsService, ServiceWrapper<CompanyDetailsService> {

	public CompanyDetailsServiceWrapper() {
		this(null);
	}

	public CompanyDetailsServiceWrapper(
		CompanyDetailsService companyDetailsService) {

		_companyDetailsService = companyDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanyDetailsService getWrappedService() {
		return _companyDetailsService;
	}

	@Override
	public void setWrappedService(CompanyDetailsService companyDetailsService) {
		_companyDetailsService = companyDetailsService;
	}

	private CompanyDetailsService _companyDetailsService;

}