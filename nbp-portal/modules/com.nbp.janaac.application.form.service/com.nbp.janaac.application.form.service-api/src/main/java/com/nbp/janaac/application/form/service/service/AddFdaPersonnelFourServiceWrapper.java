/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaPersonnelFourService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFourService
 * @generated
 */
public class AddFdaPersonnelFourServiceWrapper
	implements AddFdaPersonnelFourService,
			   ServiceWrapper<AddFdaPersonnelFourService> {

	public AddFdaPersonnelFourServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelFourServiceWrapper(
		AddFdaPersonnelFourService addFdaPersonnelFourService) {

		_addFdaPersonnelFourService = addFdaPersonnelFourService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelFourService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaPersonnelFourService getWrappedService() {
		return _addFdaPersonnelFourService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelFourService addFdaPersonnelFourService) {

		_addFdaPersonnelFourService = addFdaPersonnelFourService;
	}

	private AddFdaPersonnelFourService _addFdaPersonnelFourService;

}