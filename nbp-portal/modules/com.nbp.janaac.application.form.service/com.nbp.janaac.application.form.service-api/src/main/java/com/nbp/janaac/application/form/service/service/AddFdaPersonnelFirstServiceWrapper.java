/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaPersonnelFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFirstService
 * @generated
 */
public class AddFdaPersonnelFirstServiceWrapper
	implements AddFdaPersonnelFirstService,
			   ServiceWrapper<AddFdaPersonnelFirstService> {

	public AddFdaPersonnelFirstServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelFirstServiceWrapper(
		AddFdaPersonnelFirstService addFdaPersonnelFirstService) {

		_addFdaPersonnelFirstService = addFdaPersonnelFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaPersonnelFirstService getWrappedService() {
		return _addFdaPersonnelFirstService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelFirstService addFdaPersonnelFirstService) {

		_addFdaPersonnelFirstService = addFdaPersonnelFirstService;
	}

	private AddFdaPersonnelFirstService _addFdaPersonnelFirstService;

}