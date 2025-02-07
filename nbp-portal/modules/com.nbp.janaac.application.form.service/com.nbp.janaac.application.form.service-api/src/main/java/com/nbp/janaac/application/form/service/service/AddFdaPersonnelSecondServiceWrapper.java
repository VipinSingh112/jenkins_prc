/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaPersonnelSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelSecondService
 * @generated
 */
public class AddFdaPersonnelSecondServiceWrapper
	implements AddFdaPersonnelSecondService,
			   ServiceWrapper<AddFdaPersonnelSecondService> {

	public AddFdaPersonnelSecondServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelSecondServiceWrapper(
		AddFdaPersonnelSecondService addFdaPersonnelSecondService) {

		_addFdaPersonnelSecondService = addFdaPersonnelSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelSecondService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaPersonnelSecondService getWrappedService() {
		return _addFdaPersonnelSecondService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelSecondService addFdaPersonnelSecondService) {

		_addFdaPersonnelSecondService = addFdaPersonnelSecondService;
	}

	private AddFdaPersonnelSecondService _addFdaPersonnelSecondService;

}