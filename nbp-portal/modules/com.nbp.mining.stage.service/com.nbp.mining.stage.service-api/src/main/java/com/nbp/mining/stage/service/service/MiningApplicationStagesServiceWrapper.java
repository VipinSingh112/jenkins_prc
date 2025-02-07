/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesService
 * @generated
 */
public class MiningApplicationStagesServiceWrapper
	implements MiningApplicationStagesService,
			   ServiceWrapper<MiningApplicationStagesService> {

	public MiningApplicationStagesServiceWrapper() {
		this(null);
	}

	public MiningApplicationStagesServiceWrapper(
		MiningApplicationStagesService miningApplicationStagesService) {

		_miningApplicationStagesService = miningApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningApplicationStagesService getWrappedService() {
		return _miningApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationStagesService miningApplicationStagesService) {

		_miningApplicationStagesService = miningApplicationStagesService;
	}

	private MiningApplicationStagesService _miningApplicationStagesService;

}