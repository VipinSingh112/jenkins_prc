/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageService
 * @generated
 */
public class JadscApplicationStageServiceWrapper
	implements JadscApplicationStageService,
			   ServiceWrapper<JadscApplicationStageService> {

	public JadscApplicationStageServiceWrapper() {
		this(null);
	}

	public JadscApplicationStageServiceWrapper(
		JadscApplicationStageService jadscApplicationStageService) {

		_jadscApplicationStageService = jadscApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscApplicationStageService getWrappedService() {
		return _jadscApplicationStageService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationStageService jadscApplicationStageService) {

		_jadscApplicationStageService = jadscApplicationStageService;
	}

	private JadscApplicationStageService _jadscApplicationStageService;

}