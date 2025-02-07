/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationService
 * @generated
 */
public class QuarryApplicationServiceWrapper
	implements QuarryApplicationService,
			   ServiceWrapper<QuarryApplicationService> {

	public QuarryApplicationServiceWrapper() {
		this(null);
	}

	public QuarryApplicationServiceWrapper(
		QuarryApplicationService quarryApplicationService) {

		_quarryApplicationService = quarryApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryApplicationService getWrappedService() {
		return _quarryApplicationService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationService quarryApplicationService) {

		_quarryApplicationService = quarryApplicationService;
	}

	private QuarryApplicationService _quarryApplicationService;

}