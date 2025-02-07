/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanySecuredCreditorService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditorService
 * @generated
 */
public class CompanySecuredCreditorServiceWrapper
	implements CompanySecuredCreditorService,
			   ServiceWrapper<CompanySecuredCreditorService> {

	public CompanySecuredCreditorServiceWrapper() {
		this(null);
	}

	public CompanySecuredCreditorServiceWrapper(
		CompanySecuredCreditorService companySecuredCreditorService) {

		_companySecuredCreditorService = companySecuredCreditorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companySecuredCreditorService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanySecuredCreditorService getWrappedService() {
		return _companySecuredCreditorService;
	}

	@Override
	public void setWrappedService(
		CompanySecuredCreditorService companySecuredCreditorService) {

		_companySecuredCreditorService = companySecuredCreditorService;
	}

	private CompanySecuredCreditorService _companySecuredCreditorService;

}