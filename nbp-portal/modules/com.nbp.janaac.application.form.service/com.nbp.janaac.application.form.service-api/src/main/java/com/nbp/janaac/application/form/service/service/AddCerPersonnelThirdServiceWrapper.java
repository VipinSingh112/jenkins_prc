/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddCerPersonnelThirdService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdService
 * @generated
 */
public class AddCerPersonnelThirdServiceWrapper
	implements AddCerPersonnelThirdService,
			   ServiceWrapper<AddCerPersonnelThirdService> {

	public AddCerPersonnelThirdServiceWrapper() {
		this(null);
	}

	public AddCerPersonnelThirdServiceWrapper(
		AddCerPersonnelThirdService addCerPersonnelThirdService) {

		_addCerPersonnelThirdService = addCerPersonnelThirdService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerPersonnelThirdService.getOSGiServiceIdentifier();
	}

	@Override
	public AddCerPersonnelThirdService getWrappedService() {
		return _addCerPersonnelThirdService;
	}

	@Override
	public void setWrappedService(
		AddCerPersonnelThirdService addCerPersonnelThirdService) {

		_addCerPersonnelThirdService = addCerPersonnelThirdService;
	}

	private AddCerPersonnelThirdService _addCerPersonnelThirdService;

}