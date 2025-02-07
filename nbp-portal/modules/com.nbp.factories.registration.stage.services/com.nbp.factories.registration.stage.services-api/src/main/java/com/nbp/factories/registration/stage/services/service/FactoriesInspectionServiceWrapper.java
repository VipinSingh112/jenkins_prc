/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionService
 * @generated
 */
public class FactoriesInspectionServiceWrapper
	implements FactoriesInspectionService,
			   ServiceWrapper<FactoriesInspectionService> {

	public FactoriesInspectionServiceWrapper() {
		this(null);
	}

	public FactoriesInspectionServiceWrapper(
		FactoriesInspectionService factoriesInspectionService) {

		_factoriesInspectionService = factoriesInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesInspectionService getWrappedService() {
		return _factoriesInspectionService;
	}

	@Override
	public void setWrappedService(
		FactoriesInspectionService factoriesInspectionService) {

		_factoriesInspectionService = factoriesInspectionService;
	}

	private FactoriesInspectionService _factoriesInspectionService;

}