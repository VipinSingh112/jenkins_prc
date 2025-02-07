/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningApplicationMinisterialDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionService
 * @generated
 */
public class MiningApplicationMinisterialDecisionServiceWrapper
	implements MiningApplicationMinisterialDecisionService,
			   ServiceWrapper<MiningApplicationMinisterialDecisionService> {

	public MiningApplicationMinisterialDecisionServiceWrapper() {
		this(null);
	}

	public MiningApplicationMinisterialDecisionServiceWrapper(
		MiningApplicationMinisterialDecisionService
			miningApplicationMinisterialDecisionService) {

		_miningApplicationMinisterialDecisionService =
			miningApplicationMinisterialDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationMinisterialDecisionService.
			getOSGiServiceIdentifier();
	}

	@Override
	public MiningApplicationMinisterialDecisionService getWrappedService() {
		return _miningApplicationMinisterialDecisionService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationMinisterialDecisionService
			miningApplicationMinisterialDecisionService) {

		_miningApplicationMinisterialDecisionService =
			miningApplicationMinisterialDecisionService;
	}

	private MiningApplicationMinisterialDecisionService
		_miningApplicationMinisterialDecisionService;

}