/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesAppliInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfoService
 * @generated
 */
public class MedicalFacilitiesAppliInfoServiceWrapper
	implements MedicalFacilitiesAppliInfoService,
			   ServiceWrapper<MedicalFacilitiesAppliInfoService> {

	public MedicalFacilitiesAppliInfoServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesAppliInfoServiceWrapper(
		MedicalFacilitiesAppliInfoService medicalFacilitiesAppliInfoService) {

		_medicalFacilitiesAppliInfoService = medicalFacilitiesAppliInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesAppliInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesAppliInfoService getWrappedService() {
		return _medicalFacilitiesAppliInfoService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesAppliInfoService medicalFacilitiesAppliInfoService) {

		_medicalFacilitiesAppliInfoService = medicalFacilitiesAppliInfoService;
	}

	private MedicalFacilitiesAppliInfoService
		_medicalFacilitiesAppliInfoService;

}