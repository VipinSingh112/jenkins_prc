/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddCerScopeServiceThirdService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThirdService
 * @generated
 */
public class AddCerScopeServiceThirdServiceWrapper
	implements AddCerScopeServiceThirdService,
			   ServiceWrapper<AddCerScopeServiceThirdService> {

	public AddCerScopeServiceThirdServiceWrapper() {
		this(null);
	}

	public AddCerScopeServiceThirdServiceWrapper(
		AddCerScopeServiceThirdService addCerScopeServiceThirdService) {

		_addCerScopeServiceThirdService = addCerScopeServiceThirdService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerScopeServiceThirdService.getOSGiServiceIdentifier();
	}

	@Override
	public AddCerScopeServiceThirdService getWrappedService() {
		return _addCerScopeServiceThirdService;
	}

	@Override
	public void setWrappedService(
		AddCerScopeServiceThirdService addCerScopeServiceThirdService) {

		_addCerScopeServiceThirdService = addCerScopeServiceThirdService;
	}

	private AddCerScopeServiceThirdService _addCerScopeServiceThirdService;

}