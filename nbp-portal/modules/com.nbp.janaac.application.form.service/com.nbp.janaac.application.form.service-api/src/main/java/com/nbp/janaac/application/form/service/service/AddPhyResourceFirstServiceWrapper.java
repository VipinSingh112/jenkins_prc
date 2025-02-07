/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddPhyResourceFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirstService
 * @generated
 */
public class AddPhyResourceFirstServiceWrapper
	implements AddPhyResourceFirstService,
			   ServiceWrapper<AddPhyResourceFirstService> {

	public AddPhyResourceFirstServiceWrapper() {
		this(null);
	}

	public AddPhyResourceFirstServiceWrapper(
		AddPhyResourceFirstService addPhyResourceFirstService) {

		_addPhyResourceFirstService = addPhyResourceFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addPhyResourceFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddPhyResourceFirstService getWrappedService() {
		return _addPhyResourceFirstService;
	}

	@Override
	public void setWrappedService(
		AddPhyResourceFirstService addPhyResourceFirstService) {

		_addPhyResourceFirstService = addPhyResourceFirstService;
	}

	private AddPhyResourceFirstService _addPhyResourceFirstService;

}