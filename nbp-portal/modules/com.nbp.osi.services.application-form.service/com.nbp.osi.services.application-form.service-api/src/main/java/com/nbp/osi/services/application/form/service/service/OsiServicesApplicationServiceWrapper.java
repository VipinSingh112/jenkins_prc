/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicationService
 * @generated
 */
public class OsiServicesApplicationServiceWrapper
	implements OsiServicesApplicationService,
			   ServiceWrapper<OsiServicesApplicationService> {

	public OsiServicesApplicationServiceWrapper() {
		this(null);
	}

	public OsiServicesApplicationServiceWrapper(
		OsiServicesApplicationService osiServicesApplicationService) {

		_osiServicesApplicationService = osiServicesApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesApplicationService getWrappedService() {
		return _osiServicesApplicationService;
	}

	@Override
	public void setWrappedService(
		OsiServicesApplicationService osiServicesApplicationService) {

		_osiServicesApplicationService = osiServicesApplicationService;
	}

	private OsiServicesApplicationService _osiServicesApplicationService;

}