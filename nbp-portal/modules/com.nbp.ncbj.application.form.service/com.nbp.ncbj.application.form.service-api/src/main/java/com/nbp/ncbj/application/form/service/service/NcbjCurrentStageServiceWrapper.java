/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCurrentStageService
 * @generated
 */
public class NcbjCurrentStageServiceWrapper
	implements NcbjCurrentStageService,
			   ServiceWrapper<NcbjCurrentStageService> {

	public NcbjCurrentStageServiceWrapper() {
		this(null);
	}

	public NcbjCurrentStageServiceWrapper(
		NcbjCurrentStageService ncbjCurrentStageService) {

		_ncbjCurrentStageService = ncbjCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjCurrentStageService getWrappedService() {
		return _ncbjCurrentStageService;
	}

	@Override
	public void setWrappedService(
		NcbjCurrentStageService ncbjCurrentStageService) {

		_ncbjCurrentStageService = ncbjCurrentStageService;
	}

	private NcbjCurrentStageService _ncbjCurrentStageService;

}