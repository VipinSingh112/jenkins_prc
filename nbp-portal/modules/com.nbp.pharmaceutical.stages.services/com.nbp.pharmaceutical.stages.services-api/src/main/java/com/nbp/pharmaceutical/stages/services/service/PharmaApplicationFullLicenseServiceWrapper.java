/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationFullLicenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseService
 * @generated
 */
public class PharmaApplicationFullLicenseServiceWrapper
	implements PharmaApplicationFullLicenseService,
			   ServiceWrapper<PharmaApplicationFullLicenseService> {

	public PharmaApplicationFullLicenseServiceWrapper() {
		this(null);
	}

	public PharmaApplicationFullLicenseServiceWrapper(
		PharmaApplicationFullLicenseService
			pharmaApplicationFullLicenseService) {

		_pharmaApplicationFullLicenseService =
			pharmaApplicationFullLicenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationFullLicenseService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationFullLicenseService getWrappedService() {
		return _pharmaApplicationFullLicenseService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationFullLicenseService
			pharmaApplicationFullLicenseService) {

		_pharmaApplicationFullLicenseService =
			pharmaApplicationFullLicenseService;
	}

	private PharmaApplicationFullLicenseService
		_pharmaApplicationFullLicenseService;

}