/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PurposeOfPropLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicenceService
 * @generated
 */
public class PurposeOfPropLicenceServiceWrapper
	implements PurposeOfPropLicenceService,
			   ServiceWrapper<PurposeOfPropLicenceService> {

	public PurposeOfPropLicenceServiceWrapper() {
		this(null);
	}

	public PurposeOfPropLicenceServiceWrapper(
		PurposeOfPropLicenceService purposeOfPropLicenceService) {

		_purposeOfPropLicenceService = purposeOfPropLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _purposeOfPropLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public PurposeOfPropLicenceService getWrappedService() {
		return _purposeOfPropLicenceService;
	}

	@Override
	public void setWrappedService(
		PurposeOfPropLicenceService purposeOfPropLicenceService) {

		_purposeOfPropLicenceService = purposeOfPropLicenceService;
	}

	private PurposeOfPropLicenceService _purposeOfPropLicenceService;

}