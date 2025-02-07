/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddCerApplicationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerApplicationInfoService
 * @generated
 */
public class AddCerApplicationInfoServiceWrapper
	implements AddCerApplicationInfoService,
			   ServiceWrapper<AddCerApplicationInfoService> {

	public AddCerApplicationInfoServiceWrapper() {
		this(null);
	}

	public AddCerApplicationInfoServiceWrapper(
		AddCerApplicationInfoService addCerApplicationInfoService) {

		_addCerApplicationInfoService = addCerApplicationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerApplicationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AddCerApplicationInfoService getWrappedService() {
		return _addCerApplicationInfoService;
	}

	@Override
	public void setWrappedService(
		AddCerApplicationInfoService addCerApplicationInfoService) {

		_addCerApplicationInfoService = addCerApplicationInfoService;
	}

	private AddCerApplicationInfoService _addCerApplicationInfoService;

}