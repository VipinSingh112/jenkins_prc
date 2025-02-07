/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadiationDeclarationService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclarationService
 * @generated
 */
public class RadiationDeclarationServiceWrapper
	implements RadiationDeclarationService,
			   ServiceWrapper<RadiationDeclarationService> {

	public RadiationDeclarationServiceWrapper() {
		this(null);
	}

	public RadiationDeclarationServiceWrapper(
		RadiationDeclarationService radiationDeclarationService) {

		_radiationDeclarationService = radiationDeclarationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationDeclarationService.getOSGiServiceIdentifier();
	}

	@Override
	public RadiationDeclarationService getWrappedService() {
		return _radiationDeclarationService;
	}

	@Override
	public void setWrappedService(
		RadiationDeclarationService radiationDeclarationService) {

		_radiationDeclarationService = radiationDeclarationService;
	}

	private RadiationDeclarationService _radiationDeclarationService;

}