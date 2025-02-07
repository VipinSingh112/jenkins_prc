/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddInsOrgInfoThirdService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdService
 * @generated
 */
public class AddInsOrgInfoThirdServiceWrapper
	implements AddInsOrgInfoThirdService,
			   ServiceWrapper<AddInsOrgInfoThirdService> {

	public AddInsOrgInfoThirdServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoThirdServiceWrapper(
		AddInsOrgInfoThirdService addInsOrgInfoThirdService) {

		_addInsOrgInfoThirdService = addInsOrgInfoThirdService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoThirdService.getOSGiServiceIdentifier();
	}

	@Override
	public AddInsOrgInfoThirdService getWrappedService() {
		return _addInsOrgInfoThirdService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoThirdService addInsOrgInfoThirdService) {

		_addInsOrgInfoThirdService = addInsOrgInfoThirdService;
	}

	private AddInsOrgInfoThirdService _addInsOrgInfoThirdService;

}