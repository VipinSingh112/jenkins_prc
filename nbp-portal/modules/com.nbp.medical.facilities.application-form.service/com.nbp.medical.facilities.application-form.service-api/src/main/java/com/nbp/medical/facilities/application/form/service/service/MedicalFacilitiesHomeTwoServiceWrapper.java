/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesHomeTwoService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwoService
 * @generated
 */
public class MedicalFacilitiesHomeTwoServiceWrapper
	implements MedicalFacilitiesHomeTwoService,
			   ServiceWrapper<MedicalFacilitiesHomeTwoService> {

	public MedicalFacilitiesHomeTwoServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesHomeTwoServiceWrapper(
		MedicalFacilitiesHomeTwoService medicalFacilitiesHomeTwoService) {

		_medicalFacilitiesHomeTwoService = medicalFacilitiesHomeTwoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesHomeTwoService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesHomeTwoService getWrappedService() {
		return _medicalFacilitiesHomeTwoService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesHomeTwoService medicalFacilitiesHomeTwoService) {

		_medicalFacilitiesHomeTwoService = medicalFacilitiesHomeTwoService;
	}

	private MedicalFacilitiesHomeTwoService _medicalFacilitiesHomeTwoService;

}