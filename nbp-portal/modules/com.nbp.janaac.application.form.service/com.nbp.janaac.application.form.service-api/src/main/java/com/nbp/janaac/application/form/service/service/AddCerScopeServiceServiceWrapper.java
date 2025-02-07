/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddCerScopeServiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceService
 * @generated
 */
public class AddCerScopeServiceServiceWrapper
	implements AddCerScopeServiceService,
			   ServiceWrapper<AddCerScopeServiceService> {

	public AddCerScopeServiceServiceWrapper() {
		this(null);
	}

	public AddCerScopeServiceServiceWrapper(
		AddCerScopeServiceService addCerScopeServiceService) {

		_addCerScopeServiceService = addCerScopeServiceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerScopeServiceService.getOSGiServiceIdentifier();
	}

	@Override
	public AddCerScopeServiceService getWrappedService() {
		return _addCerScopeServiceService;
	}

	@Override
	public void setWrappedService(
		AddCerScopeServiceService addCerScopeServiceService) {

		_addCerScopeServiceService = addCerScopeServiceService;
	}

	private AddCerScopeServiceService _addCerScopeServiceService;

}