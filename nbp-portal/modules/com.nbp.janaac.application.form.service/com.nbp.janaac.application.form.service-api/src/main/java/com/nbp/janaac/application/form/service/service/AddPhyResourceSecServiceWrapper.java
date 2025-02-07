/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddPhyResourceSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecService
 * @generated
 */
public class AddPhyResourceSecServiceWrapper
	implements AddPhyResourceSecService,
			   ServiceWrapper<AddPhyResourceSecService> {

	public AddPhyResourceSecServiceWrapper() {
		this(null);
	}

	public AddPhyResourceSecServiceWrapper(
		AddPhyResourceSecService addPhyResourceSecService) {

		_addPhyResourceSecService = addPhyResourceSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addPhyResourceSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddPhyResourceSecService getWrappedService() {
		return _addPhyResourceSecService;
	}

	@Override
	public void setWrappedService(
		AddPhyResourceSecService addPhyResourceSecService) {

		_addPhyResourceSecService = addPhyResourceSecService;
	}

	private AddPhyResourceSecService _addPhyResourceSecService;

}