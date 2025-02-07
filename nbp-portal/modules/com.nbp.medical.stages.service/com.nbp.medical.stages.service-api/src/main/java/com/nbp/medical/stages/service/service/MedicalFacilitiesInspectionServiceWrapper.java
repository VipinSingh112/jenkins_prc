/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesInspectionService
 * @generated
 */
public class MedicalFacilitiesInspectionServiceWrapper
	implements MedicalFacilitiesInspectionService,
			   ServiceWrapper<MedicalFacilitiesInspectionService> {

	public MedicalFacilitiesInspectionServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesInspectionServiceWrapper(
		MedicalFacilitiesInspectionService medicalFacilitiesInspectionService) {

		_medicalFacilitiesInspectionService =
			medicalFacilitiesInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesInspectionService getWrappedService() {
		return _medicalFacilitiesInspectionService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesInspectionService medicalFacilitiesInspectionService) {

		_medicalFacilitiesInspectionService =
			medicalFacilitiesInspectionService;
	}

	private MedicalFacilitiesInspectionService
		_medicalFacilitiesInspectionService;

}