/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyTotalLiabilityService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityService
 * @generated
 */
public class CompanyTotalLiabilityServiceWrapper
	implements CompanyTotalLiabilityService,
			   ServiceWrapper<CompanyTotalLiabilityService> {

	public CompanyTotalLiabilityServiceWrapper() {
		this(null);
	}

	public CompanyTotalLiabilityServiceWrapper(
		CompanyTotalLiabilityService companyTotalLiabilityService) {

		_companyTotalLiabilityService = companyTotalLiabilityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyTotalLiabilityService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanyTotalLiabilityService getWrappedService() {
		return _companyTotalLiabilityService;
	}

	@Override
	public void setWrappedService(
		CompanyTotalLiabilityService companyTotalLiabilityService) {

		_companyTotalLiabilityService = companyTotalLiabilityService;
	}

	private CompanyTotalLiabilityService _companyTotalLiabilityService;

}