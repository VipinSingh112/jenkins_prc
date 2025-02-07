/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabOrganizationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganizationService
 * @generated
 */
public class AccMediLabOrganizationServiceWrapper
	implements AccMediLabOrganizationService,
			   ServiceWrapper<AccMediLabOrganizationService> {

	public AccMediLabOrganizationServiceWrapper() {
		this(null);
	}

	public AccMediLabOrganizationServiceWrapper(
		AccMediLabOrganizationService accMediLabOrganizationService) {

		_accMediLabOrganizationService = accMediLabOrganizationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabOrganizationService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabOrganizationService getWrappedService() {
		return _accMediLabOrganizationService;
	}

	@Override
	public void setWrappedService(
		AccMediLabOrganizationService accMediLabOrganizationService) {

		_accMediLabOrganizationService = accMediLabOrganizationService;
	}

	private AccMediLabOrganizationService _accMediLabOrganizationService;

}