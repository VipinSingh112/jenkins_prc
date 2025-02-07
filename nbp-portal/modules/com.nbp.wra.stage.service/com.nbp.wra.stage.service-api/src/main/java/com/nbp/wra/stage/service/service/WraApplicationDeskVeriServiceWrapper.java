/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WraApplicationDeskVeriService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeriService
 * @generated
 */
public class WraApplicationDeskVeriServiceWrapper
	implements ServiceWrapper<WraApplicationDeskVeriService>,
			   WraApplicationDeskVeriService {

	public WraApplicationDeskVeriServiceWrapper() {
		this(null);
	}

	public WraApplicationDeskVeriServiceWrapper(
		WraApplicationDeskVeriService wraApplicationDeskVeriService) {

		_wraApplicationDeskVeriService = wraApplicationDeskVeriService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationDeskVeriService.getOSGiServiceIdentifier();
	}

	@Override
	public WraApplicationDeskVeriService getWrappedService() {
		return _wraApplicationDeskVeriService;
	}

	@Override
	public void setWrappedService(
		WraApplicationDeskVeriService wraApplicationDeskVeriService) {

		_wraApplicationDeskVeriService = wraApplicationDeskVeriService;
	}

	private WraApplicationDeskVeriService _wraApplicationDeskVeriService;

}