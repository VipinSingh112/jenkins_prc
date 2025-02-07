/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusBoardDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionService
 * @generated
 */
public class SezStatusBoardDecisionServiceWrapper
	implements ServiceWrapper<SezStatusBoardDecisionService>,
			   SezStatusBoardDecisionService {

	public SezStatusBoardDecisionServiceWrapper() {
		this(null);
	}

	public SezStatusBoardDecisionServiceWrapper(
		SezStatusBoardDecisionService sezStatusBoardDecisionService) {

		_sezStatusBoardDecisionService = sezStatusBoardDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusBoardDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusBoardDecisionService getWrappedService() {
		return _sezStatusBoardDecisionService;
	}

	@Override
	public void setWrappedService(
		SezStatusBoardDecisionService sezStatusBoardDecisionService) {

		_sezStatusBoardDecisionService = sezStatusBoardDecisionService;
	}

	private SezStatusBoardDecisionService _sezStatusBoardDecisionService;

}