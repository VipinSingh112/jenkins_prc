/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationService
 * @generated
 */
public class NcbjApplicationServiceWrapper
	implements NcbjApplicationService, ServiceWrapper<NcbjApplicationService> {

	public NcbjApplicationServiceWrapper() {
		this(null);
	}

	public NcbjApplicationServiceWrapper(
		NcbjApplicationService ncbjApplicationService) {

		_ncbjApplicationService = ncbjApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjApplicationService getWrappedService() {
		return _ncbjApplicationService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationService ncbjApplicationService) {

		_ncbjApplicationService = ncbjApplicationService;
	}

	private NcbjApplicationService _ncbjApplicationService;

}