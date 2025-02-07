/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesQNurseService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseService
 * @generated
 */
public class MedicalFacilitiesQNurseServiceWrapper
	implements MedicalFacilitiesQNurseService,
			   ServiceWrapper<MedicalFacilitiesQNurseService> {

	public MedicalFacilitiesQNurseServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesQNurseServiceWrapper(
		MedicalFacilitiesQNurseService medicalFacilitiesQNurseService) {

		_medicalFacilitiesQNurseService = medicalFacilitiesQNurseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesQNurseService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesQNurseService getWrappedService() {
		return _medicalFacilitiesQNurseService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesQNurseService medicalFacilitiesQNurseService) {

		_medicalFacilitiesQNurseService = medicalFacilitiesQNurseService;
	}

	private MedicalFacilitiesQNurseService _medicalFacilitiesQNurseService;

}