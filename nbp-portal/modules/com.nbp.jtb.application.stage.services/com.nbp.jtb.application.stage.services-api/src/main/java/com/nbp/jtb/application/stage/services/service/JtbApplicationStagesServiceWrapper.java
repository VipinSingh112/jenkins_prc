/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesService
 * @generated
 */
public class JtbApplicationStagesServiceWrapper
	implements JtbApplicationStagesService,
			   ServiceWrapper<JtbApplicationStagesService> {

	public JtbApplicationStagesServiceWrapper() {
		this(null);
	}

	public JtbApplicationStagesServiceWrapper(
		JtbApplicationStagesService jtbApplicationStagesService) {

		_jtbApplicationStagesService = jtbApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbApplicationStagesService getWrappedService() {
		return _jtbApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		JtbApplicationStagesService jtbApplicationStagesService) {

		_jtbApplicationStagesService = jtbApplicationStagesService;
	}

	private JtbApplicationStagesService _jtbApplicationStagesService;

}