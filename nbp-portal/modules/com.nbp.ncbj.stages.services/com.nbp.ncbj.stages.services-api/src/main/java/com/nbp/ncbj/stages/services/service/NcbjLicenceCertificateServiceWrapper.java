/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjLicenceCertificateService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateService
 * @generated
 */
public class NcbjLicenceCertificateServiceWrapper
	implements NcbjLicenceCertificateService,
			   ServiceWrapper<NcbjLicenceCertificateService> {

	public NcbjLicenceCertificateServiceWrapper() {
		this(null);
	}

	public NcbjLicenceCertificateServiceWrapper(
		NcbjLicenceCertificateService ncbjLicenceCertificateService) {

		_ncbjLicenceCertificateService = ncbjLicenceCertificateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjLicenceCertificateService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjLicenceCertificateService getWrappedService() {
		return _ncbjLicenceCertificateService;
	}

	@Override
	public void setWrappedService(
		NcbjLicenceCertificateService ncbjLicenceCertificateService) {

		_ncbjLicenceCertificateService = ncbjLicenceCertificateService;
	}

	private NcbjLicenceCertificateService _ncbjLicenceCertificateService;

}