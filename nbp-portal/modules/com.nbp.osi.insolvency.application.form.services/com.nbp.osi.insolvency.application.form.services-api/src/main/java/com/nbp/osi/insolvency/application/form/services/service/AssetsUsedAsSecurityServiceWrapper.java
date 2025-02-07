/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetsUsedAsSecurityService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityService
 * @generated
 */
public class AssetsUsedAsSecurityServiceWrapper
	implements AssetsUsedAsSecurityService,
			   ServiceWrapper<AssetsUsedAsSecurityService> {

	public AssetsUsedAsSecurityServiceWrapper() {
		this(null);
	}

	public AssetsUsedAsSecurityServiceWrapper(
		AssetsUsedAsSecurityService assetsUsedAsSecurityService) {

		_assetsUsedAsSecurityService = assetsUsedAsSecurityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetsUsedAsSecurityService.getOSGiServiceIdentifier();
	}

	@Override
	public AssetsUsedAsSecurityService getWrappedService() {
		return _assetsUsedAsSecurityService;
	}

	@Override
	public void setWrappedService(
		AssetsUsedAsSecurityService assetsUsedAsSecurityService) {

		_assetsUsedAsSecurityService = assetsUsedAsSecurityService;
	}

	private AssetsUsedAsSecurityService _assetsUsedAsSecurityService;

}