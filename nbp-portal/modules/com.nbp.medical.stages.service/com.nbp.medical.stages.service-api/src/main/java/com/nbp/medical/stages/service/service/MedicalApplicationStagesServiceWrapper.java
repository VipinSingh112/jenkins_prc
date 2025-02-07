/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesService
 * @generated
 */
public class MedicalApplicationStagesServiceWrapper
	implements MedicalApplicationStagesService,
			   ServiceWrapper<MedicalApplicationStagesService> {

	public MedicalApplicationStagesServiceWrapper() {
		this(null);
	}

	public MedicalApplicationStagesServiceWrapper(
		MedicalApplicationStagesService medicalApplicationStagesService) {

		_medicalApplicationStagesService = medicalApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalApplicationStagesService getWrappedService() {
		return _medicalApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		MedicalApplicationStagesService medicalApplicationStagesService) {

		_medicalApplicationStagesService = medicalApplicationStagesService;
	}

	private MedicalApplicationStagesService _medicalApplicationStagesService;

}