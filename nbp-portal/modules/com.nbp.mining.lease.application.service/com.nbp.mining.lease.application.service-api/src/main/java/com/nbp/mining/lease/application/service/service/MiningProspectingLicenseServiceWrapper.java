/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningProspectingLicenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseService
 * @generated
 */
public class MiningProspectingLicenseServiceWrapper
	implements MiningProspectingLicenseService,
			   ServiceWrapper<MiningProspectingLicenseService> {

	public MiningProspectingLicenseServiceWrapper() {
		this(null);
	}

	public MiningProspectingLicenseServiceWrapper(
		MiningProspectingLicenseService miningProspectingLicenseService) {

		_miningProspectingLicenseService = miningProspectingLicenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingLicenseService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningProspectingLicenseService getWrappedService() {
		return _miningProspectingLicenseService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingLicenseService miningProspectingLicenseService) {

		_miningProspectingLicenseService = miningProspectingLicenseService;
	}

	private MiningProspectingLicenseService _miningProspectingLicenseService;

}