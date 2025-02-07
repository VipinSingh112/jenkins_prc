/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisConsentByPropertyOwnerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwnerService
 * @generated
 */
public class CannabisConsentByPropertyOwnerServiceWrapper
	implements CannabisConsentByPropertyOwnerService,
			   ServiceWrapper<CannabisConsentByPropertyOwnerService> {

	public CannabisConsentByPropertyOwnerServiceWrapper() {
		this(null);
	}

	public CannabisConsentByPropertyOwnerServiceWrapper(
		CannabisConsentByPropertyOwnerService
			cannabisConsentByPropertyOwnerService) {

		_cannabisConsentByPropertyOwnerService =
			cannabisConsentByPropertyOwnerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConsentByPropertyOwnerService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisConsentByPropertyOwnerService getWrappedService() {
		return _cannabisConsentByPropertyOwnerService;
	}

	@Override
	public void setWrappedService(
		CannabisConsentByPropertyOwnerService
			cannabisConsentByPropertyOwnerService) {

		_cannabisConsentByPropertyOwnerService =
			cannabisConsentByPropertyOwnerService;
	}

	private CannabisConsentByPropertyOwnerService
		_cannabisConsentByPropertyOwnerService;

}