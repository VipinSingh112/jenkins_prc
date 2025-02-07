/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WRAApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationService
 * @generated
 */
public class WRAApplicationServiceWrapper
	implements ServiceWrapper<WRAApplicationService>, WRAApplicationService {

	public WRAApplicationServiceWrapper() {
		this(null);
	}

	public WRAApplicationServiceWrapper(
		WRAApplicationService wraApplicationService) {

		_wraApplicationService = wraApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public WRAApplicationService getWrappedService() {
		return _wraApplicationService;
	}

	@Override
	public void setWrappedService(WRAApplicationService wraApplicationService) {
		_wraApplicationService = wraApplicationService;
	}

	private WRAApplicationService _wraApplicationService;

}