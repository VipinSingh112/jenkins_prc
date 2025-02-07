/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningAppCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStageService
 * @generated
 */
public class MiningAppCurrentStageServiceWrapper
	implements MiningAppCurrentStageService,
			   ServiceWrapper<MiningAppCurrentStageService> {

	public MiningAppCurrentStageServiceWrapper() {
		this(null);
	}

	public MiningAppCurrentStageServiceWrapper(
		MiningAppCurrentStageService miningAppCurrentStageService) {

		_miningAppCurrentStageService = miningAppCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningAppCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningAppCurrentStageService getWrappedService() {
		return _miningAppCurrentStageService;
	}

	@Override
	public void setWrappedService(
		MiningAppCurrentStageService miningAppCurrentStageService) {

		_miningAppCurrentStageService = miningAppCurrentStageService;
	}

	private MiningAppCurrentStageService _miningAppCurrentStageService;

}