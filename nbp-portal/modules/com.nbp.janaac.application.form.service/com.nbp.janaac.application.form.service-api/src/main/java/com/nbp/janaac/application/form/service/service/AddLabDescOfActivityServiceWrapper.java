/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabDescOfActivityService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabDescOfActivityService
 * @generated
 */
public class AddLabDescOfActivityServiceWrapper
	implements AddLabDescOfActivityService,
			   ServiceWrapper<AddLabDescOfActivityService> {

	public AddLabDescOfActivityServiceWrapper() {
		this(null);
	}

	public AddLabDescOfActivityServiceWrapper(
		AddLabDescOfActivityService addLabDescOfActivityService) {

		_addLabDescOfActivityService = addLabDescOfActivityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabDescOfActivityService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabDescOfActivityService getWrappedService() {
		return _addLabDescOfActivityService;
	}

	@Override
	public void setWrappedService(
		AddLabDescOfActivityService addLabDescOfActivityService) {

		_addLabDescOfActivityService = addLabDescOfActivityService;
	}

	private AddLabDescOfActivityService _addLabDescOfActivityService;

}