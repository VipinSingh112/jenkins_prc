/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaSubCategoriesMappingService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMappingService
 * @generated
 */
public class PharmaSubCategoriesMappingServiceWrapper
	implements PharmaSubCategoriesMappingService,
			   ServiceWrapper<PharmaSubCategoriesMappingService> {

	public PharmaSubCategoriesMappingServiceWrapper() {
		this(null);
	}

	public PharmaSubCategoriesMappingServiceWrapper(
		PharmaSubCategoriesMappingService pharmaSubCategoriesMappingService) {

		_pharmaSubCategoriesMappingService = pharmaSubCategoriesMappingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaSubCategoriesMappingService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaSubCategoriesMappingService getWrappedService() {
		return _pharmaSubCategoriesMappingService;
	}

	@Override
	public void setWrappedService(
		PharmaSubCategoriesMappingService pharmaSubCategoriesMappingService) {

		_pharmaSubCategoriesMappingService = pharmaSubCategoriesMappingService;
	}

	private PharmaSubCategoriesMappingService
		_pharmaSubCategoriesMappingService;

}