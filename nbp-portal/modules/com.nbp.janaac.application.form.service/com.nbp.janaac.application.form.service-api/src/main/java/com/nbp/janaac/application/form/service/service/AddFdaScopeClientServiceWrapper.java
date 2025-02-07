/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaScopeClientService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClientService
 * @generated
 */
public class AddFdaScopeClientServiceWrapper
	implements AddFdaScopeClientService,
			   ServiceWrapper<AddFdaScopeClientService> {

	public AddFdaScopeClientServiceWrapper() {
		this(null);
	}

	public AddFdaScopeClientServiceWrapper(
		AddFdaScopeClientService addFdaScopeClientService) {

		_addFdaScopeClientService = addFdaScopeClientService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaScopeClientService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaScopeClientService getWrappedService() {
		return _addFdaScopeClientService;
	}

	@Override
	public void setWrappedService(
		AddFdaScopeClientService addFdaScopeClientService) {

		_addFdaScopeClientService = addFdaScopeClientService;
	}

	private AddFdaScopeClientService _addFdaScopeClientService;

}