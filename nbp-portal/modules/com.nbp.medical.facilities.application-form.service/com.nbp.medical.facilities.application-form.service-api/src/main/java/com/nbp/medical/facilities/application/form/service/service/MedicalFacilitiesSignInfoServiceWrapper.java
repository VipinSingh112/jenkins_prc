/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesSignInfoService
 * @generated
 */
public class MedicalFacilitiesSignInfoServiceWrapper
	implements MedicalFacilitiesSignInfoService,
			   ServiceWrapper<MedicalFacilitiesSignInfoService> {

	public MedicalFacilitiesSignInfoServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesSignInfoServiceWrapper(
		MedicalFacilitiesSignInfoService medicalFacilitiesSignInfoService) {

		_medicalFacilitiesSignInfoService = medicalFacilitiesSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesSignInfoService getWrappedService() {
		return _medicalFacilitiesSignInfoService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesSignInfoService medicalFacilitiesSignInfoService) {

		_medicalFacilitiesSignInfoService = medicalFacilitiesSignInfoService;
	}

	private MedicalFacilitiesSignInfoService _medicalFacilitiesSignInfoService;

}