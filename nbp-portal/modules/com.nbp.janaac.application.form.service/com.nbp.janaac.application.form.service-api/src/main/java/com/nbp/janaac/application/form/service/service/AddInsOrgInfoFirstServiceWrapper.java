/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddInsOrgInfoFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirstService
 * @generated
 */
public class AddInsOrgInfoFirstServiceWrapper
	implements AddInsOrgInfoFirstService,
			   ServiceWrapper<AddInsOrgInfoFirstService> {

	public AddInsOrgInfoFirstServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoFirstServiceWrapper(
		AddInsOrgInfoFirstService addInsOrgInfoFirstService) {

		_addInsOrgInfoFirstService = addInsOrgInfoFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddInsOrgInfoFirstService getWrappedService() {
		return _addInsOrgInfoFirstService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoFirstService addInsOrgInfoFirstService) {

		_addInsOrgInfoFirstService = addInsOrgInfoFirstService;
	}

	private AddInsOrgInfoFirstService _addInsOrgInfoFirstService;

}