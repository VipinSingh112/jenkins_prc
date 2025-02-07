/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAppBoardDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecisionService
 * @generated
 */
public class JtbAppBoardDecisionServiceWrapper
	implements JtbAppBoardDecisionService,
			   ServiceWrapper<JtbAppBoardDecisionService> {

	public JtbAppBoardDecisionServiceWrapper() {
		this(null);
	}

	public JtbAppBoardDecisionServiceWrapper(
		JtbAppBoardDecisionService jtbAppBoardDecisionService) {

		_jtbAppBoardDecisionService = jtbAppBoardDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAppBoardDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAppBoardDecisionService getWrappedService() {
		return _jtbAppBoardDecisionService;
	}

	@Override
	public void setWrappedService(
		JtbAppBoardDecisionService jtbAppBoardDecisionService) {

		_jtbAppBoardDecisionService = jtbAppBoardDecisionService;
	}

	private JtbAppBoardDecisionService _jtbAppBoardDecisionService;

}