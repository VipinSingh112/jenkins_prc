/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesService
 * @generated
 */
public class JanaacApplicationStagesServiceWrapper
	implements JanaacApplicationStagesService,
			   ServiceWrapper<JanaacApplicationStagesService> {

	public JanaacApplicationStagesServiceWrapper() {
		this(null);
	}

	public JanaacApplicationStagesServiceWrapper(
		JanaacApplicationStagesService janaacApplicationStagesService) {

		_janaacApplicationStagesService = janaacApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacApplicationStagesService getWrappedService() {
		return _janaacApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationStagesService janaacApplicationStagesService) {

		_janaacApplicationStagesService = janaacApplicationStagesService;
	}

	private JanaacApplicationStagesService _janaacApplicationStagesService;

}