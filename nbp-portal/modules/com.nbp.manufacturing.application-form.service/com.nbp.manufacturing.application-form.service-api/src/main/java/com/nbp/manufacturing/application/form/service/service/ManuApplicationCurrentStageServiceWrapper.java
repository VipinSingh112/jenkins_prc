/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuApplicationCurrentStageService
 * @generated
 */
public class ManuApplicationCurrentStageServiceWrapper
	implements ManuApplicationCurrentStageService,
			   ServiceWrapper<ManuApplicationCurrentStageService> {

	public ManuApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public ManuApplicationCurrentStageServiceWrapper(
		ManuApplicationCurrentStageService manuApplicationCurrentStageService) {

		_manuApplicationCurrentStageService =
			manuApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuApplicationCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuApplicationCurrentStageService getWrappedService() {
		return _manuApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		ManuApplicationCurrentStageService manuApplicationCurrentStageService) {

		_manuApplicationCurrentStageService =
			manuApplicationCurrentStageService;
	}

	private ManuApplicationCurrentStageService
		_manuApplicationCurrentStageService;

}