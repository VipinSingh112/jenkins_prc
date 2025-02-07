/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesNurseStaffService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaffService
 * @generated
 */
public class MedicalFacilitiesNurseStaffServiceWrapper
	implements MedicalFacilitiesNurseStaffService,
			   ServiceWrapper<MedicalFacilitiesNurseStaffService> {

	public MedicalFacilitiesNurseStaffServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesNurseStaffServiceWrapper(
		MedicalFacilitiesNurseStaffService medicalFacilitiesNurseStaffService) {

		_medicalFacilitiesNurseStaffService =
			medicalFacilitiesNurseStaffService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesNurseStaffService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesNurseStaffService getWrappedService() {
		return _medicalFacilitiesNurseStaffService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesNurseStaffService medicalFacilitiesNurseStaffService) {

		_medicalFacilitiesNurseStaffService =
			medicalFacilitiesNurseStaffService;
	}

	private MedicalFacilitiesNurseStaffService
		_medicalFacilitiesNurseStaffService;

}