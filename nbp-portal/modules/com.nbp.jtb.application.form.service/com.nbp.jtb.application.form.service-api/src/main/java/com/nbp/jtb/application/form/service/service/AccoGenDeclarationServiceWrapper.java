/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoGenDeclarationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclarationService
 * @generated
 */
public class AccoGenDeclarationServiceWrapper
	implements AccoGenDeclarationService,
			   ServiceWrapper<AccoGenDeclarationService> {

	public AccoGenDeclarationServiceWrapper() {
		this(null);
	}

	public AccoGenDeclarationServiceWrapper(
		AccoGenDeclarationService accoGenDeclarationService) {

		_accoGenDeclarationService = accoGenDeclarationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoGenDeclarationService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoGenDeclarationService getWrappedService() {
		return _accoGenDeclarationService;
	}

	@Override
	public void setWrappedService(
		AccoGenDeclarationService accoGenDeclarationService) {

		_accoGenDeclarationService = accoGenDeclarationService;
	}

	private AccoGenDeclarationService _accoGenDeclarationService;

}