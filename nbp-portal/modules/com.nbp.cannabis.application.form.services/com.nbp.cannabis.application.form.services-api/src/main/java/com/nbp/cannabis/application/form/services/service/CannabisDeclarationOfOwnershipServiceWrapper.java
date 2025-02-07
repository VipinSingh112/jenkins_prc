/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisDeclarationOfOwnershipService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeclarationOfOwnershipService
 * @generated
 */
public class CannabisDeclarationOfOwnershipServiceWrapper
	implements CannabisDeclarationOfOwnershipService,
			   ServiceWrapper<CannabisDeclarationOfOwnershipService> {

	public CannabisDeclarationOfOwnershipServiceWrapper() {
		this(null);
	}

	public CannabisDeclarationOfOwnershipServiceWrapper(
		CannabisDeclarationOfOwnershipService
			cannabisDeclarationOfOwnershipService) {

		_cannabisDeclarationOfOwnershipService =
			cannabisDeclarationOfOwnershipService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisDeclarationOfOwnershipService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisDeclarationOfOwnershipService getWrappedService() {
		return _cannabisDeclarationOfOwnershipService;
	}

	@Override
	public void setWrappedService(
		CannabisDeclarationOfOwnershipService
			cannabisDeclarationOfOwnershipService) {

		_cannabisDeclarationOfOwnershipService =
			cannabisDeclarationOfOwnershipService;
	}

	private CannabisDeclarationOfOwnershipService
		_cannabisDeclarationOfOwnershipService;

}