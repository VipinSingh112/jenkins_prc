/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetsNotUsedAsSecurityService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityService
 * @generated
 */
public class AssetsNotUsedAsSecurityServiceWrapper
	implements AssetsNotUsedAsSecurityService,
			   ServiceWrapper<AssetsNotUsedAsSecurityService> {

	public AssetsNotUsedAsSecurityServiceWrapper() {
		this(null);
	}

	public AssetsNotUsedAsSecurityServiceWrapper(
		AssetsNotUsedAsSecurityService assetsNotUsedAsSecurityService) {

		_assetsNotUsedAsSecurityService = assetsNotUsedAsSecurityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetsNotUsedAsSecurityService.getOSGiServiceIdentifier();
	}

	@Override
	public AssetsNotUsedAsSecurityService getWrappedService() {
		return _assetsNotUsedAsSecurityService;
	}

	@Override
	public void setWrappedService(
		AssetsNotUsedAsSecurityService assetsNotUsedAsSecurityService) {

		_assetsNotUsedAsSecurityService = assetsNotUsedAsSecurityService;
	}

	private AssetsNotUsedAsSecurityService _assetsNotUsedAsSecurityService;

}