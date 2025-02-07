/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningRenewalLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicenceService
 * @generated
 */
public class MiningRenewalLicenceServiceWrapper
	implements MiningRenewalLicenceService,
			   ServiceWrapper<MiningRenewalLicenceService> {

	public MiningRenewalLicenceServiceWrapper() {
		this(null);
	}

	public MiningRenewalLicenceServiceWrapper(
		MiningRenewalLicenceService miningRenewalLicenceService) {

		_miningRenewalLicenceService = miningRenewalLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningRenewalLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningRenewalLicenceService getWrappedService() {
		return _miningRenewalLicenceService;
	}

	@Override
	public void setWrappedService(
		MiningRenewalLicenceService miningRenewalLicenceService) {

		_miningRenewalLicenceService = miningRenewalLicenceService;
	}

	private MiningRenewalLicenceService _miningRenewalLicenceService;

}