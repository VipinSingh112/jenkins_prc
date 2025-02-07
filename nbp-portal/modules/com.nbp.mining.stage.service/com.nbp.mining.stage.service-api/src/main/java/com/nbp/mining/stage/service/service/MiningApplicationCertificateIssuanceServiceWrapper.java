/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningApplicationCertificateIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationCertificateIssuanceService
 * @generated
 */
public class MiningApplicationCertificateIssuanceServiceWrapper
	implements MiningApplicationCertificateIssuanceService,
			   ServiceWrapper<MiningApplicationCertificateIssuanceService> {

	public MiningApplicationCertificateIssuanceServiceWrapper() {
		this(null);
	}

	public MiningApplicationCertificateIssuanceServiceWrapper(
		MiningApplicationCertificateIssuanceService
			miningApplicationCertificateIssuanceService) {

		_miningApplicationCertificateIssuanceService =
			miningApplicationCertificateIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationCertificateIssuanceService.
			getOSGiServiceIdentifier();
	}

	@Override
	public MiningApplicationCertificateIssuanceService getWrappedService() {
		return _miningApplicationCertificateIssuanceService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationCertificateIssuanceService
			miningApplicationCertificateIssuanceService) {

		_miningApplicationCertificateIssuanceService =
			miningApplicationCertificateIssuanceService;
	}

	private MiningApplicationCertificateIssuanceService
		_miningApplicationCertificateIssuanceService;

}