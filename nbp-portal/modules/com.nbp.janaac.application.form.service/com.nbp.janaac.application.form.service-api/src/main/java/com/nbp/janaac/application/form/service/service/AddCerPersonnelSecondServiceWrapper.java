/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddCerPersonnelSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecondService
 * @generated
 */
public class AddCerPersonnelSecondServiceWrapper
	implements AddCerPersonnelSecondService,
			   ServiceWrapper<AddCerPersonnelSecondService> {

	public AddCerPersonnelSecondServiceWrapper() {
		this(null);
	}

	public AddCerPersonnelSecondServiceWrapper(
		AddCerPersonnelSecondService addCerPersonnelSecondService) {

		_addCerPersonnelSecondService = addCerPersonnelSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerPersonnelSecondService.getOSGiServiceIdentifier();
	}

	@Override
	public AddCerPersonnelSecondService getWrappedService() {
		return _addCerPersonnelSecondService;
	}

	@Override
	public void setWrappedService(
		AddCerPersonnelSecondService addCerPersonnelSecondService) {

		_addCerPersonnelSecondService = addCerPersonnelSecondService;
	}

	private AddCerPersonnelSecondService _addCerPersonnelSecondService;

}