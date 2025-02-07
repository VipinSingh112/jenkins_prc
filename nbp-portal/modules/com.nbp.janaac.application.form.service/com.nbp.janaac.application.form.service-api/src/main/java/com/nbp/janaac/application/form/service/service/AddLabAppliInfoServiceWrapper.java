/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabAppliInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfoService
 * @generated
 */
public class AddLabAppliInfoServiceWrapper
	implements AddLabAppliInfoService, ServiceWrapper<AddLabAppliInfoService> {

	public AddLabAppliInfoServiceWrapper() {
		this(null);
	}

	public AddLabAppliInfoServiceWrapper(
		AddLabAppliInfoService addLabAppliInfoService) {

		_addLabAppliInfoService = addLabAppliInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabAppliInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabAppliInfoService getWrappedService() {
		return _addLabAppliInfoService;
	}

	@Override
	public void setWrappedService(
		AddLabAppliInfoService addLabAppliInfoService) {

		_addLabAppliInfoService = addLabAppliInfoService;
	}

	private AddLabAppliInfoService _addLabAppliInfoService;

}