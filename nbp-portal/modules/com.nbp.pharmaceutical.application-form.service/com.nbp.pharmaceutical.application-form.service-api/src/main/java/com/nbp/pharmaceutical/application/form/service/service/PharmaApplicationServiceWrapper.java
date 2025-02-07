/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationService
 * @generated
 */
public class PharmaApplicationServiceWrapper
	implements PharmaApplicationService,
			   ServiceWrapper<PharmaApplicationService> {

	public PharmaApplicationServiceWrapper() {
		this(null);
	}

	public PharmaApplicationServiceWrapper(
		PharmaApplicationService pharmaApplicationService) {

		_pharmaApplicationService = pharmaApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationService getWrappedService() {
		return _pharmaApplicationService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationService pharmaApplicationService) {

		_pharmaApplicationService = pharmaApplicationService;
	}

	private PharmaApplicationService _pharmaApplicationService;

}