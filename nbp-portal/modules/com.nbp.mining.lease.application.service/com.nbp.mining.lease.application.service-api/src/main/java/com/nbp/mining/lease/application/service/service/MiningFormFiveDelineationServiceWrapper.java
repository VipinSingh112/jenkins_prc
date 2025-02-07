/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningFormFiveDelineationService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationService
 * @generated
 */
public class MiningFormFiveDelineationServiceWrapper
	implements MiningFormFiveDelineationService,
			   ServiceWrapper<MiningFormFiveDelineationService> {

	public MiningFormFiveDelineationServiceWrapper() {
		this(null);
	}

	public MiningFormFiveDelineationServiceWrapper(
		MiningFormFiveDelineationService miningFormFiveDelineationService) {

		_miningFormFiveDelineationService = miningFormFiveDelineationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningFormFiveDelineationService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningFormFiveDelineationService getWrappedService() {
		return _miningFormFiveDelineationService;
	}

	@Override
	public void setWrappedService(
		MiningFormFiveDelineationService miningFormFiveDelineationService) {

		_miningFormFiveDelineationService = miningFormFiveDelineationService;
	}

	private MiningFormFiveDelineationService _miningFormFiveDelineationService;

}