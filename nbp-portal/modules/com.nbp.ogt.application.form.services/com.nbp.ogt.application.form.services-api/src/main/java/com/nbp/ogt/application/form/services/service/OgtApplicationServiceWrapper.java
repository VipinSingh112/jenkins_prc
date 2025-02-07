/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationService
 * @generated
 */
public class OgtApplicationServiceWrapper
	implements OgtApplicationService, ServiceWrapper<OgtApplicationService> {

	public OgtApplicationServiceWrapper() {
		this(null);
	}

	public OgtApplicationServiceWrapper(
		OgtApplicationService ogtApplicationService) {

		_ogtApplicationService = ogtApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtApplicationService getWrappedService() {
		return _ogtApplicationService;
	}

	@Override
	public void setWrappedService(OgtApplicationService ogtApplicationService) {
		_ogtApplicationService = ogtApplicationService;
	}

	private OgtApplicationService _ogtApplicationService;

}