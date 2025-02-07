/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WraApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStageService
 * @generated
 */
public class WraApplicationStageServiceWrapper
	implements ServiceWrapper<WraApplicationStageService>,
			   WraApplicationStageService {

	public WraApplicationStageServiceWrapper() {
		this(null);
	}

	public WraApplicationStageServiceWrapper(
		WraApplicationStageService wraApplicationStageService) {

		_wraApplicationStageService = wraApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public WraApplicationStageService getWrappedService() {
		return _wraApplicationStageService;
	}

	@Override
	public void setWrappedService(
		WraApplicationStageService wraApplicationStageService) {

		_wraApplicationStageService = wraApplicationStageService;
	}

	private WraApplicationStageService _wraApplicationStageService;

}