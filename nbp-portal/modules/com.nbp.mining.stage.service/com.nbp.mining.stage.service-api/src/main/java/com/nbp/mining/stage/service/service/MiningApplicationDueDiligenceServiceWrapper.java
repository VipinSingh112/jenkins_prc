/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningApplicationDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligenceService
 * @generated
 */
public class MiningApplicationDueDiligenceServiceWrapper
	implements MiningApplicationDueDiligenceService,
			   ServiceWrapper<MiningApplicationDueDiligenceService> {

	public MiningApplicationDueDiligenceServiceWrapper() {
		this(null);
	}

	public MiningApplicationDueDiligenceServiceWrapper(
		MiningApplicationDueDiligenceService
			miningApplicationDueDiligenceService) {

		_miningApplicationDueDiligenceService =
			miningApplicationDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningApplicationDueDiligenceService getWrappedService() {
		return _miningApplicationDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationDueDiligenceService
			miningApplicationDueDiligenceService) {

		_miningApplicationDueDiligenceService =
			miningApplicationDueDiligenceService;
	}

	private MiningApplicationDueDiligenceService
		_miningApplicationDueDiligenceService;

}