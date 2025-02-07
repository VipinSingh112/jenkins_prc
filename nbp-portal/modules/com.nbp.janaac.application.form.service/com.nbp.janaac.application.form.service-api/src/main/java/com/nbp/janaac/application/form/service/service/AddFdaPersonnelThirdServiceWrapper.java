/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaPersonnelThirdService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdService
 * @generated
 */
public class AddFdaPersonnelThirdServiceWrapper
	implements AddFdaPersonnelThirdService,
			   ServiceWrapper<AddFdaPersonnelThirdService> {

	public AddFdaPersonnelThirdServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelThirdServiceWrapper(
		AddFdaPersonnelThirdService addFdaPersonnelThirdService) {

		_addFdaPersonnelThirdService = addFdaPersonnelThirdService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelThirdService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaPersonnelThirdService getWrappedService() {
		return _addFdaPersonnelThirdService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelThirdService addFdaPersonnelThirdService) {

		_addFdaPersonnelThirdService = addFdaPersonnelThirdService;
	}

	private AddFdaPersonnelThirdService _addFdaPersonnelThirdService;

}