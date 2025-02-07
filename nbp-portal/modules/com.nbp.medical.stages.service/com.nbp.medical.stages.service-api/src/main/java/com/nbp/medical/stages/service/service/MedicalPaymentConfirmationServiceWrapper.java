/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationService
 * @generated
 */
public class MedicalPaymentConfirmationServiceWrapper
	implements MedicalPaymentConfirmationService,
			   ServiceWrapper<MedicalPaymentConfirmationService> {

	public MedicalPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public MedicalPaymentConfirmationServiceWrapper(
		MedicalPaymentConfirmationService medicalPaymentConfirmationService) {

		_medicalPaymentConfirmationService = medicalPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalPaymentConfirmationService getWrappedService() {
		return _medicalPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		MedicalPaymentConfirmationService medicalPaymentConfirmationService) {

		_medicalPaymentConfirmationService = medicalPaymentConfirmationService;
	}

	private MedicalPaymentConfirmationService
		_medicalPaymentConfirmationService;

}