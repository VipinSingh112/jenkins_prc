/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacAppliCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacAppliCurrentStageService
 * @generated
 */
public class JanaacAppliCurrentStageServiceWrapper
	implements JanaacAppliCurrentStageService,
			   ServiceWrapper<JanaacAppliCurrentStageService> {

	public JanaacAppliCurrentStageServiceWrapper() {
		this(null);
	}

	public JanaacAppliCurrentStageServiceWrapper(
		JanaacAppliCurrentStageService janaacAppliCurrentStageService) {

		_janaacAppliCurrentStageService = janaacAppliCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacAppliCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacAppliCurrentStageService getWrappedService() {
		return _janaacAppliCurrentStageService;
	}

	@Override
	public void setWrappedService(
		JanaacAppliCurrentStageService janaacAppliCurrentStageService) {

		_janaacAppliCurrentStageService = janaacAppliCurrentStageService;
	}

	private JanaacAppliCurrentStageService _janaacAppliCurrentStageService;

}