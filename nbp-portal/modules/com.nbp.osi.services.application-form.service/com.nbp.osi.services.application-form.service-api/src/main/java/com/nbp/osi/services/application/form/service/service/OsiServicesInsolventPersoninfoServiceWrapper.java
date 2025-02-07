/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesInsolventPersoninfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfoService
 * @generated
 */
public class OsiServicesInsolventPersoninfoServiceWrapper
	implements OsiServicesInsolventPersoninfoService,
			   ServiceWrapper<OsiServicesInsolventPersoninfoService> {

	public OsiServicesInsolventPersoninfoServiceWrapper() {
		this(null);
	}

	public OsiServicesInsolventPersoninfoServiceWrapper(
		OsiServicesInsolventPersoninfoService
			osiServicesInsolventPersoninfoService) {

		_osiServicesInsolventPersoninfoService =
			osiServicesInsolventPersoninfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesInsolventPersoninfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesInsolventPersoninfoService getWrappedService() {
		return _osiServicesInsolventPersoninfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesInsolventPersoninfoService
			osiServicesInsolventPersoninfoService) {

		_osiServicesInsolventPersoninfoService =
			osiServicesInsolventPersoninfoService;
	}

	private OsiServicesInsolventPersoninfoService
		_osiServicesInsolventPersoninfoService;

}