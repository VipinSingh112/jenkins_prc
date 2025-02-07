/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesNurseDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailService
 * @generated
 */
public class MedicalFacilitiesNurseDetailServiceWrapper
	implements MedicalFacilitiesNurseDetailService,
			   ServiceWrapper<MedicalFacilitiesNurseDetailService> {

	public MedicalFacilitiesNurseDetailServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesNurseDetailServiceWrapper(
		MedicalFacilitiesNurseDetailService
			medicalFacilitiesNurseDetailService) {

		_medicalFacilitiesNurseDetailService =
			medicalFacilitiesNurseDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesNurseDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesNurseDetailService getWrappedService() {
		return _medicalFacilitiesNurseDetailService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesNurseDetailService
			medicalFacilitiesNurseDetailService) {

		_medicalFacilitiesNurseDetailService =
			medicalFacilitiesNurseDetailService;
	}

	private MedicalFacilitiesNurseDetailService
		_medicalFacilitiesNurseDetailService;

}