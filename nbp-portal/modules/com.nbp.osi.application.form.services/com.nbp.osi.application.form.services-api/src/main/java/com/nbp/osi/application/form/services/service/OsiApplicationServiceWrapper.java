/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationService
 * @generated
 */
public class OsiApplicationServiceWrapper
	implements OsiApplicationService, ServiceWrapper<OsiApplicationService> {

	public OsiApplicationServiceWrapper() {
		this(null);
	}

	public OsiApplicationServiceWrapper(
		OsiApplicationService osiApplicationService) {

		_osiApplicationService = osiApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiApplicationService getWrappedService() {
		return _osiApplicationService;
	}

	@Override
	public void setWrappedService(OsiApplicationService osiApplicationService) {
		_osiApplicationService = osiApplicationService;
	}

	private OsiApplicationService _osiApplicationService;

}