/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningLeaseApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationService
 * @generated
 */
public class MiningLeaseApplicationServiceWrapper
	implements MiningLeaseApplicationService,
			   ServiceWrapper<MiningLeaseApplicationService> {

	public MiningLeaseApplicationServiceWrapper() {
		this(null);
	}

	public MiningLeaseApplicationServiceWrapper(
		MiningLeaseApplicationService miningLeaseApplicationService) {

		_miningLeaseApplicationService = miningLeaseApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningLeaseApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningLeaseApplicationService getWrappedService() {
		return _miningLeaseApplicationService;
	}

	@Override
	public void setWrappedService(
		MiningLeaseApplicationService miningLeaseApplicationService) {

		_miningLeaseApplicationService = miningLeaseApplicationService;
	}

	private MiningLeaseApplicationService _miningLeaseApplicationService;

}