/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningProspectingLicenseAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAddService
 * @generated
 */
public class MiningProspectingLicenseAddServiceWrapper
	implements MiningProspectingLicenseAddService,
			   ServiceWrapper<MiningProspectingLicenseAddService> {

	public MiningProspectingLicenseAddServiceWrapper() {
		this(null);
	}

	public MiningProspectingLicenseAddServiceWrapper(
		MiningProspectingLicenseAddService miningProspectingLicenseAddService) {

		_miningProspectingLicenseAddService =
			miningProspectingLicenseAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingLicenseAddService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningProspectingLicenseAddService getWrappedService() {
		return _miningProspectingLicenseAddService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingLicenseAddService miningProspectingLicenseAddService) {

		_miningProspectingLicenseAddService =
			miningProspectingLicenseAddService;
	}

	private MiningProspectingLicenseAddService
		_miningProspectingLicenseAddService;

}