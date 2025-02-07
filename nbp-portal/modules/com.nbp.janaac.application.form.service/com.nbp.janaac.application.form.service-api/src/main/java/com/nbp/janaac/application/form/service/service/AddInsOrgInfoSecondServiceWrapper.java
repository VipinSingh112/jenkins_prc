/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddInsOrgInfoSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecondService
 * @generated
 */
public class AddInsOrgInfoSecondServiceWrapper
	implements AddInsOrgInfoSecondService,
			   ServiceWrapper<AddInsOrgInfoSecondService> {

	public AddInsOrgInfoSecondServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoSecondServiceWrapper(
		AddInsOrgInfoSecondService addInsOrgInfoSecondService) {

		_addInsOrgInfoSecondService = addInsOrgInfoSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoSecondService.getOSGiServiceIdentifier();
	}

	@Override
	public AddInsOrgInfoSecondService getWrappedService() {
		return _addInsOrgInfoSecondService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoSecondService addInsOrgInfoSecondService) {

		_addInsOrgInfoSecondService = addInsOrgInfoSecondService;
	}

	private AddInsOrgInfoSecondService _addInsOrgInfoSecondService;

}