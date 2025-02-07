/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddInsApplicationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfoService
 * @generated
 */
public class AddInsApplicationInfoServiceWrapper
	implements AddInsApplicationInfoService,
			   ServiceWrapper<AddInsApplicationInfoService> {

	public AddInsApplicationInfoServiceWrapper() {
		this(null);
	}

	public AddInsApplicationInfoServiceWrapper(
		AddInsApplicationInfoService addInsApplicationInfoService) {

		_addInsApplicationInfoService = addInsApplicationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsApplicationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AddInsApplicationInfoService getWrappedService() {
		return _addInsApplicationInfoService;
	}

	@Override
	public void setWrappedService(
		AddInsApplicationInfoService addInsApplicationInfoService) {

		_addInsApplicationInfoService = addInsApplicationInfoService;
	}

	private AddInsApplicationInfoService _addInsApplicationInfoService;

}