/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FitPropFinancialProfileService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfileService
 * @generated
 */
public class FitPropFinancialProfileServiceWrapper
	implements FitPropFinancialProfileService,
			   ServiceWrapper<FitPropFinancialProfileService> {

	public FitPropFinancialProfileServiceWrapper() {
		this(null);
	}

	public FitPropFinancialProfileServiceWrapper(
		FitPropFinancialProfileService fitPropFinancialProfileService) {

		_fitPropFinancialProfileService = fitPropFinancialProfileService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropFinancialProfileService.getOSGiServiceIdentifier();
	}

	@Override
	public FitPropFinancialProfileService getWrappedService() {
		return _fitPropFinancialProfileService;
	}

	@Override
	public void setWrappedService(
		FitPropFinancialProfileService fitPropFinancialProfileService) {

		_fitPropFinancialProfileService = fitPropFinancialProfileService;
	}

	private FitPropFinancialProfileService _fitPropFinancialProfileService;

}