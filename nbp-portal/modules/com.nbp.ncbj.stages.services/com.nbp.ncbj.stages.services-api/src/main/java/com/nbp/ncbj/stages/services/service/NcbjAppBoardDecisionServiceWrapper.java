/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjAppBoardDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionService
 * @generated
 */
public class NcbjAppBoardDecisionServiceWrapper
	implements NcbjAppBoardDecisionService,
			   ServiceWrapper<NcbjAppBoardDecisionService> {

	public NcbjAppBoardDecisionServiceWrapper() {
		this(null);
	}

	public NcbjAppBoardDecisionServiceWrapper(
		NcbjAppBoardDecisionService ncbjAppBoardDecisionService) {

		_ncbjAppBoardDecisionService = ncbjAppBoardDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAppBoardDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjAppBoardDecisionService getWrappedService() {
		return _ncbjAppBoardDecisionService;
	}

	@Override
	public void setWrappedService(
		NcbjAppBoardDecisionService ncbjAppBoardDecisionService) {

		_ncbjAppBoardDecisionService = ncbjAppBoardDecisionService;
	}

	private NcbjAppBoardDecisionService _ncbjAppBoardDecisionService;

}