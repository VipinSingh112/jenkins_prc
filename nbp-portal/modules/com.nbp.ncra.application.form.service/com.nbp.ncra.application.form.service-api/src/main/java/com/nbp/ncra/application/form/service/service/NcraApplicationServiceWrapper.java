/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationService
 * @generated
 */
public class NcraApplicationServiceWrapper
	implements NcraApplicationService, ServiceWrapper<NcraApplicationService> {

	public NcraApplicationServiceWrapper() {
		this(null);
	}

	public NcraApplicationServiceWrapper(
		NcraApplicationService ncraApplicationService) {

		_ncraApplicationService = ncraApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraApplicationService getWrappedService() {
		return _ncraApplicationService;
	}

	@Override
	public void setWrappedService(
		NcraApplicationService ncraApplicationService) {

		_ncraApplicationService = ncraApplicationService;
	}

	private NcraApplicationService _ncraApplicationService;

}