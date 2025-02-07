/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationCurrentStageService
 * @generated
 */
public class MiicApplicationCurrentStageServiceWrapper
	implements MiicApplicationCurrentStageService,
			   ServiceWrapper<MiicApplicationCurrentStageService> {

	public MiicApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public MiicApplicationCurrentStageServiceWrapper(
		MiicApplicationCurrentStageService miicApplicationCurrentStageService) {

		_miicApplicationCurrentStageService =
			miicApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicApplicationCurrentStageService getWrappedService() {
		return _miicApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationCurrentStageService miicApplicationCurrentStageService) {

		_miicApplicationCurrentStageService =
			miicApplicationCurrentStageService;
	}

	private MiicApplicationCurrentStageService
		_miicApplicationCurrentStageService;

}