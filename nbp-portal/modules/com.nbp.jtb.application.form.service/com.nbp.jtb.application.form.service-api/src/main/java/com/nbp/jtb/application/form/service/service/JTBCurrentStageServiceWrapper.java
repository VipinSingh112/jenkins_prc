/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTBCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStageService
 * @generated
 */
public class JTBCurrentStageServiceWrapper
	implements JTBCurrentStageService, ServiceWrapper<JTBCurrentStageService> {

	public JTBCurrentStageServiceWrapper() {
		this(null);
	}

	public JTBCurrentStageServiceWrapper(
		JTBCurrentStageService jtbCurrentStageService) {

		_jtbCurrentStageService = jtbCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public JTBCurrentStageService getWrappedService() {
		return _jtbCurrentStageService;
	}

	@Override
	public void setWrappedService(
		JTBCurrentStageService jtbCurrentStageService) {

		_jtbCurrentStageService = jtbCurrentStageService;
	}

	private JTBCurrentStageService _jtbCurrentStageService;

}