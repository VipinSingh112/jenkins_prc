/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PackagingProcessService}.
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcessService
 * @generated
 */
public class PackagingProcessServiceWrapper
	implements PackagingProcessService,
			   ServiceWrapper<PackagingProcessService> {

	public PackagingProcessServiceWrapper() {
		this(null);
	}

	public PackagingProcessServiceWrapper(
		PackagingProcessService packagingProcessService) {

		_packagingProcessService = packagingProcessService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _packagingProcessService.getOSGiServiceIdentifier();
	}

	@Override
	public PackagingProcessService getWrappedService() {
		return _packagingProcessService;
	}

	@Override
	public void setWrappedService(
		PackagingProcessService packagingProcessService) {

		_packagingProcessService = packagingProcessService;
	}

	private PackagingProcessService _packagingProcessService;

}