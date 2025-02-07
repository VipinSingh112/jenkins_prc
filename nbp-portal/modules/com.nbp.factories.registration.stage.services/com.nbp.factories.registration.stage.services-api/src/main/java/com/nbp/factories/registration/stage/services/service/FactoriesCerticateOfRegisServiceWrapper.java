/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesCerticateOfRegisService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegisService
 * @generated
 */
public class FactoriesCerticateOfRegisServiceWrapper
	implements FactoriesCerticateOfRegisService,
			   ServiceWrapper<FactoriesCerticateOfRegisService> {

	public FactoriesCerticateOfRegisServiceWrapper() {
		this(null);
	}

	public FactoriesCerticateOfRegisServiceWrapper(
		FactoriesCerticateOfRegisService factoriesCerticateOfRegisService) {

		_factoriesCerticateOfRegisService = factoriesCerticateOfRegisService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesCerticateOfRegisService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesCerticateOfRegisService getWrappedService() {
		return _factoriesCerticateOfRegisService;
	}

	@Override
	public void setWrappedService(
		FactoriesCerticateOfRegisService factoriesCerticateOfRegisService) {

		_factoriesCerticateOfRegisService = factoriesCerticateOfRegisService;
	}

	private FactoriesCerticateOfRegisService _factoriesCerticateOfRegisService;

}