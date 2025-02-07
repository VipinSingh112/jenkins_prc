/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalFaciltiesPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFaciltiesPaymentService
 * @generated
 */
public class MedicalFaciltiesPaymentServiceWrapper
	implements MedicalFaciltiesPaymentService,
			   ServiceWrapper<MedicalFaciltiesPaymentService> {

	public MedicalFaciltiesPaymentServiceWrapper() {
		this(null);
	}

	public MedicalFaciltiesPaymentServiceWrapper(
		MedicalFaciltiesPaymentService medicalFaciltiesPaymentService) {

		_medicalFaciltiesPaymentService = medicalFaciltiesPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFaciltiesPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalFaciltiesPaymentService getWrappedService() {
		return _medicalFaciltiesPaymentService;
	}

	@Override
	public void setWrappedService(
		MedicalFaciltiesPaymentService medicalFaciltiesPaymentService) {

		_medicalFaciltiesPaymentService = medicalFaciltiesPaymentService;
	}

	private MedicalFaciltiesPaymentService _medicalFaciltiesPaymentService;

}