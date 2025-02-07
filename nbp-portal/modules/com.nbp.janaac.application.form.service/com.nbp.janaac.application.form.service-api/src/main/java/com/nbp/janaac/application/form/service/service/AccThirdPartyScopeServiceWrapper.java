/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccThirdPartyScopeService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScopeService
 * @generated
 */
public class AccThirdPartyScopeServiceWrapper
	implements AccThirdPartyScopeService,
			   ServiceWrapper<AccThirdPartyScopeService> {

	public AccThirdPartyScopeServiceWrapper() {
		this(null);
	}

	public AccThirdPartyScopeServiceWrapper(
		AccThirdPartyScopeService accThirdPartyScopeService) {

		_accThirdPartyScopeService = accThirdPartyScopeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accThirdPartyScopeService.getOSGiServiceIdentifier();
	}

	@Override
	public AccThirdPartyScopeService getWrappedService() {
		return _accThirdPartyScopeService;
	}

	@Override
	public void setWrappedService(
		AccThirdPartyScopeService accThirdPartyScopeService) {

		_accThirdPartyScopeService = accThirdPartyScopeService;
	}

	private AccThirdPartyScopeService _accThirdPartyScopeService;

}