/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanySecretaryService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretaryService
 * @generated
 */
public class CompanySecretaryServiceWrapper
	implements CompanySecretaryService,
			   ServiceWrapper<CompanySecretaryService> {

	public CompanySecretaryServiceWrapper() {
		this(null);
	}

	public CompanySecretaryServiceWrapper(
		CompanySecretaryService companySecretaryService) {

		_companySecretaryService = companySecretaryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companySecretaryService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanySecretaryService getWrappedService() {
		return _companySecretaryService;
	}

	@Override
	public void setWrappedService(
		CompanySecretaryService companySecretaryService) {

		_companySecretaryService = companySecretaryService;
	}

	private CompanySecretaryService _companySecretaryService;

}