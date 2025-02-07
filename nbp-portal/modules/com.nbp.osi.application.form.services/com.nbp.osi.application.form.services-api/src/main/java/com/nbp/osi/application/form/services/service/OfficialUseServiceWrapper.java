/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OfficialUseService}.
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUseService
 * @generated
 */
public class OfficialUseServiceWrapper
	implements OfficialUseService, ServiceWrapper<OfficialUseService> {

	public OfficialUseServiceWrapper() {
		this(null);
	}

	public OfficialUseServiceWrapper(OfficialUseService officialUseService) {
		_officialUseService = officialUseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _officialUseService.getOSGiServiceIdentifier();
	}

	@Override
	public OfficialUseService getWrappedService() {
		return _officialUseService;
	}

	@Override
	public void setWrappedService(OfficialUseService officialUseService) {
		_officialUseService = officialUseService;
	}

	private OfficialUseService _officialUseService;

}