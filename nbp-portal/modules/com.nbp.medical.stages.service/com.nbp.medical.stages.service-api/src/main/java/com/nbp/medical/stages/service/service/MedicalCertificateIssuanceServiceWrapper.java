/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MedicalCertificateIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceService
 * @generated
 */
public class MedicalCertificateIssuanceServiceWrapper
	implements MedicalCertificateIssuanceService,
			   ServiceWrapper<MedicalCertificateIssuanceService> {

	public MedicalCertificateIssuanceServiceWrapper() {
		this(null);
	}

	public MedicalCertificateIssuanceServiceWrapper(
		MedicalCertificateIssuanceService medicalCertificateIssuanceService) {

		_medicalCertificateIssuanceService = medicalCertificateIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalCertificateIssuanceService.getOSGiServiceIdentifier();
	}

	@Override
	public MedicalCertificateIssuanceService getWrappedService() {
		return _medicalCertificateIssuanceService;
	}

	@Override
	public void setWrappedService(
		MedicalCertificateIssuanceService medicalCertificateIssuanceService) {

		_medicalCertificateIssuanceService = medicalCertificateIssuanceService;
	}

	private MedicalCertificateIssuanceService
		_medicalCertificateIssuanceService;

}