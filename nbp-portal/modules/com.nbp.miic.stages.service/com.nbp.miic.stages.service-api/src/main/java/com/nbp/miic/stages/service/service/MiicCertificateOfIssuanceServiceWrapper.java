/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicCertificateOfIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuanceService
 * @generated
 */
public class MiicCertificateOfIssuanceServiceWrapper
	implements MiicCertificateOfIssuanceService,
			   ServiceWrapper<MiicCertificateOfIssuanceService> {

	public MiicCertificateOfIssuanceServiceWrapper() {
		this(null);
	}

	public MiicCertificateOfIssuanceServiceWrapper(
		MiicCertificateOfIssuanceService miicCertificateOfIssuanceService) {

		_miicCertificateOfIssuanceService = miicCertificateOfIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicCertificateOfIssuanceService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicCertificateOfIssuanceService getWrappedService() {
		return _miicCertificateOfIssuanceService;
	}

	@Override
	public void setWrappedService(
		MiicCertificateOfIssuanceService miicCertificateOfIssuanceService) {

		_miicCertificateOfIssuanceService = miicCertificateOfIssuanceService;
	}

	private MiicCertificateOfIssuanceService _miicCertificateOfIssuanceService;

}