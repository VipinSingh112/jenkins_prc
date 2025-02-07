/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCurrentStageService
 * @generated
 */
public class JADSCCurrentStageServiceWrapper
	implements JADSCCurrentStageService,
			   ServiceWrapper<JADSCCurrentStageService> {

	public JADSCCurrentStageServiceWrapper() {
		this(null);
	}

	public JADSCCurrentStageServiceWrapper(
		JADSCCurrentStageService jadscCurrentStageService) {

		_jadscCurrentStageService = jadscCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCCurrentStageService getWrappedService() {
		return _jadscCurrentStageService;
	}

	@Override
	public void setWrappedService(
		JADSCCurrentStageService jadscCurrentStageService) {

		_jadscCurrentStageService = jadscCurrentStageService;
	}

	private JADSCCurrentStageService _jadscCurrentStageService;

}