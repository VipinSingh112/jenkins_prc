/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFacilitiesMaterHomeService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHomeService
 * @generated
 */
public class MedicalFacilitiesMaterHomeServiceWrapper
	implements MedicalFacilitiesMaterHomeService,
			   ServiceWrapper<MedicalFacilitiesMaterHomeService> {

	public MedicalFacilitiesMaterHomeServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesMaterHomeServiceWrapper(
		MedicalFacilitiesMaterHomeService medicalFacilitiesMaterHomeService) {

		_medicalFacilitiesMaterHomeService = medicalFacilitiesMaterHomeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesMaterHomeService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFacilitiesMaterHomeService getWrappedService() {
		return _medicalFacilitiesMaterHomeService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesMaterHomeService medicalFacilitiesMaterHomeService) {

		_medicalFacilitiesMaterHomeService = medicalFacilitiesMaterHomeService;
	}

	private MedicalFacilitiesMaterHomeService
		_medicalFacilitiesMaterHomeService;

}