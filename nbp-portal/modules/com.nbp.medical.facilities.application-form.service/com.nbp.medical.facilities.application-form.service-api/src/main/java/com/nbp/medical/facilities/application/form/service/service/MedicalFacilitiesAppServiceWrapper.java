/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesAppService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppService
 * @generated
 */
public class MedicalFacilitiesAppServiceWrapper
	implements MedicalFacilitiesAppService,
			   ServiceWrapper<MedicalFacilitiesAppService> {

	public MedicalFacilitiesAppServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesAppServiceWrapper(
		MedicalFacilitiesAppService medicalFacilitiesAppService) {

		_medicalFacilitiesAppService = medicalFacilitiesAppService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesAppService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesAppService getWrappedService() {
		return _medicalFacilitiesAppService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesAppService medicalFacilitiesAppService) {

		_medicalFacilitiesAppService = medicalFacilitiesAppService;
	}

	private MedicalFacilitiesAppService _medicalFacilitiesAppService;

}