/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStageService
 * @generated
 */
public class NcraCurrentStageServiceWrapper
	implements NcraCurrentStageService,
			   ServiceWrapper<NcraCurrentStageService> {

	public NcraCurrentStageServiceWrapper() {
		this(null);
	}

	public NcraCurrentStageServiceWrapper(
		NcraCurrentStageService ncraCurrentStageService) {

		_ncraCurrentStageService = ncraCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraCurrentStageService getWrappedService() {
		return _ncraCurrentStageService;
	}

	@Override
	public void setWrappedService(
		NcraCurrentStageService ncraCurrentStageService) {

		_ncraCurrentStageService = ncraCurrentStageService;
	}

	private NcraCurrentStageService _ncraCurrentStageService;

}