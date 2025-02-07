/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesComDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetailService
 * @generated
 */
public class MedicalFacilitiesComDetailServiceWrapper
	implements MedicalFacilitiesComDetailService,
			   ServiceWrapper<MedicalFacilitiesComDetailService> {

	public MedicalFacilitiesComDetailServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesComDetailServiceWrapper(
		MedicalFacilitiesComDetailService medicalFacilitiesComDetailService) {

		_medicalFacilitiesComDetailService = medicalFacilitiesComDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesComDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesComDetailService getWrappedService() {
		return _medicalFacilitiesComDetailService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesComDetailService medicalFacilitiesComDetailService) {

		_medicalFacilitiesComDetailService = medicalFacilitiesComDetailService;
	}

	private MedicalFacilitiesComDetailService
		_medicalFacilitiesComDetailService;

}