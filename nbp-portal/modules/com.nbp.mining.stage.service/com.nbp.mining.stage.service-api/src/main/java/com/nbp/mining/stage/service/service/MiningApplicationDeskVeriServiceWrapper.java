/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningApplicationDeskVeriService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeriService
 * @generated
 */
public class MiningApplicationDeskVeriServiceWrapper
	implements MiningApplicationDeskVeriService,
			   ServiceWrapper<MiningApplicationDeskVeriService> {

	public MiningApplicationDeskVeriServiceWrapper() {
		this(null);
	}

	public MiningApplicationDeskVeriServiceWrapper(
		MiningApplicationDeskVeriService miningApplicationDeskVeriService) {

		_miningApplicationDeskVeriService = miningApplicationDeskVeriService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationDeskVeriService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningApplicationDeskVeriService getWrappedService() {
		return _miningApplicationDeskVeriService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationDeskVeriService miningApplicationDeskVeriService) {

		_miningApplicationDeskVeriService = miningApplicationDeskVeriService;
	}

	private MiningApplicationDeskVeriService _miningApplicationDeskVeriService;

}