/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalNurseStaffPremisesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesService
 * @generated
 */
public class MedicalNurseStaffPremisesServiceWrapper
	implements MedicalNurseStaffPremisesService,
			   ServiceWrapper<MedicalNurseStaffPremisesService> {

	public MedicalNurseStaffPremisesServiceWrapper() {
		this(null);
	}

	public MedicalNurseStaffPremisesServiceWrapper(
		MedicalNurseStaffPremisesService medicalNurseStaffPremisesService) {

		_medicalNurseStaffPremisesService = medicalNurseStaffPremisesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalNurseStaffPremisesService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalNurseStaffPremisesService getWrappedService() {
		return _medicalNurseStaffPremisesService;
	}

	@Override
	public void setWrappedService(
		MedicalNurseStaffPremisesService medicalNurseStaffPremisesService) {

		_medicalNurseStaffPremisesService = medicalNurseStaffPremisesService;
	}

	private MedicalNurseStaffPremisesService _medicalNurseStaffPremisesService;

}