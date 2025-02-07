/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabResourceReqFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirstService
 * @generated
 */
public class AddLabResourceReqFirstServiceWrapper
	implements AddLabResourceReqFirstService,
			   ServiceWrapper<AddLabResourceReqFirstService> {

	public AddLabResourceReqFirstServiceWrapper() {
		this(null);
	}

	public AddLabResourceReqFirstServiceWrapper(
		AddLabResourceReqFirstService addLabResourceReqFirstService) {

		_addLabResourceReqFirstService = addLabResourceReqFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabResourceReqFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabResourceReqFirstService getWrappedService() {
		return _addLabResourceReqFirstService;
	}

	@Override
	public void setWrappedService(
		AddLabResourceReqFirstService addLabResourceReqFirstService) {

		_addLabResourceReqFirstService = addLabResourceReqFirstService;
	}

	private AddLabResourceReqFirstService _addLabResourceReqFirstService;

}