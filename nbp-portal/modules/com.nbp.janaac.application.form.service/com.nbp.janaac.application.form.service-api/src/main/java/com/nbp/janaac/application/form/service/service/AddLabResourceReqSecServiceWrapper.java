/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabResourceReqSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSecService
 * @generated
 */
public class AddLabResourceReqSecServiceWrapper
	implements AddLabResourceReqSecService,
			   ServiceWrapper<AddLabResourceReqSecService> {

	public AddLabResourceReqSecServiceWrapper() {
		this(null);
	}

	public AddLabResourceReqSecServiceWrapper(
		AddLabResourceReqSecService addLabResourceReqSecService) {

		_addLabResourceReqSecService = addLabResourceReqSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabResourceReqSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabResourceReqSecService getWrappedService() {
		return _addLabResourceReqSecService;
	}

	@Override
	public void setWrappedService(
		AddLabResourceReqSecService addLabResourceReqSecService) {

		_addLabResourceReqSecService = addLabResourceReqSecService;
	}

	private AddLabResourceReqSecService _addLabResourceReqSecService;

}