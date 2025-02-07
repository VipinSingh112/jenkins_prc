/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisConsentBySoleOwnerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerService
 * @generated
 */
public class CannabisConsentBySoleOwnerServiceWrapper
	implements CannabisConsentBySoleOwnerService,
			   ServiceWrapper<CannabisConsentBySoleOwnerService> {

	public CannabisConsentBySoleOwnerServiceWrapper() {
		this(null);
	}

	public CannabisConsentBySoleOwnerServiceWrapper(
		CannabisConsentBySoleOwnerService cannabisConsentBySoleOwnerService) {

		_cannabisConsentBySoleOwnerService = cannabisConsentBySoleOwnerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConsentBySoleOwnerService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisConsentBySoleOwnerService getWrappedService() {
		return _cannabisConsentBySoleOwnerService;
	}

	@Override
	public void setWrappedService(
		CannabisConsentBySoleOwnerService cannabisConsentBySoleOwnerService) {

		_cannabisConsentBySoleOwnerService = cannabisConsentBySoleOwnerService;
	}

	private CannabisConsentBySoleOwnerService
		_cannabisConsentBySoleOwnerService;

}