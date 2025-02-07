/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStageService
 * @generated
 */
public class PharmaCurrentStageServiceWrapper
	implements PharmaCurrentStageService,
			   ServiceWrapper<PharmaCurrentStageService> {

	public PharmaCurrentStageServiceWrapper() {
		this(null);
	}

	public PharmaCurrentStageServiceWrapper(
		PharmaCurrentStageService pharmaCurrentStageService) {

		_pharmaCurrentStageService = pharmaCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaCurrentStageService getWrappedService() {
		return _pharmaCurrentStageService;
	}

	@Override
	public void setWrappedService(
		PharmaCurrentStageService pharmaCurrentStageService) {

		_pharmaCurrentStageService = pharmaCurrentStageService;
	}

	private PharmaCurrentStageService _pharmaCurrentStageService;

}