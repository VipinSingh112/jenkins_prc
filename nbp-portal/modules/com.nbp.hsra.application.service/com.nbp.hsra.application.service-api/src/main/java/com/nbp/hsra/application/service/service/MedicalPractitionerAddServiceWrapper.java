/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalPractitionerAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPractitionerAddService
 * @generated
 */
public class MedicalPractitionerAddServiceWrapper
	implements MedicalPractitionerAddService,
			   ServiceWrapper<MedicalPractitionerAddService> {

	public MedicalPractitionerAddServiceWrapper() {
		this(null);
	}

	public MedicalPractitionerAddServiceWrapper(
		MedicalPractitionerAddService medicalPractitionerAddService) {

		_medicalPractitionerAddService = medicalPractitionerAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalPractitionerAddService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalPractitionerAddService getWrappedService() {
		return _medicalPractitionerAddService;
	}

	@Override
	public void setWrappedService(
		MedicalPractitionerAddService medicalPractitionerAddService) {

		_medicalPractitionerAddService = medicalPractitionerAddService;
	}

	private MedicalPractitionerAddService _medicalPractitionerAddService;

}