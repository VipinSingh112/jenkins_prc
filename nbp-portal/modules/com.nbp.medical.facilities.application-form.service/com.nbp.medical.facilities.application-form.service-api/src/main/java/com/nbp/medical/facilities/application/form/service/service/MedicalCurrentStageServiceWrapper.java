/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCurrentStageService
 * @generated
 */
public class MedicalCurrentStageServiceWrapper
	implements MedicalCurrentStageService,
			   ServiceWrapper<MedicalCurrentStageService> {

	public MedicalCurrentStageServiceWrapper() {
		this(null);
	}

	public MedicalCurrentStageServiceWrapper(
		MedicalCurrentStageService medicalCurrentStageService) {

		_medicalCurrentStageService = medicalCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalCurrentStageService getWrappedService() {
		return _medicalCurrentStageService;
	}

	@Override
	public void setWrappedService(
		MedicalCurrentStageService medicalCurrentStageService) {

		_medicalCurrentStageService = medicalCurrentStageService;
	}

	private MedicalCurrentStageService _medicalCurrentStageService;

}