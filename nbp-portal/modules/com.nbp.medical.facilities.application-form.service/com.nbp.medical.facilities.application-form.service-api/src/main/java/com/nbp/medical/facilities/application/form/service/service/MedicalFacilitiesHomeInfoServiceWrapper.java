/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesHomeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfoService
 * @generated
 */
public class MedicalFacilitiesHomeInfoServiceWrapper
	implements MedicalFacilitiesHomeInfoService,
			   ServiceWrapper<MedicalFacilitiesHomeInfoService> {

	public MedicalFacilitiesHomeInfoServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesHomeInfoServiceWrapper(
		MedicalFacilitiesHomeInfoService medicalFacilitiesHomeInfoService) {

		_medicalFacilitiesHomeInfoService = medicalFacilitiesHomeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesHomeInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesHomeInfoService getWrappedService() {
		return _medicalFacilitiesHomeInfoService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesHomeInfoService medicalFacilitiesHomeInfoService) {

		_medicalFacilitiesHomeInfoService = medicalFacilitiesHomeInfoService;
	}

	private MedicalFacilitiesHomeInfoService _medicalFacilitiesHomeInfoService;

}