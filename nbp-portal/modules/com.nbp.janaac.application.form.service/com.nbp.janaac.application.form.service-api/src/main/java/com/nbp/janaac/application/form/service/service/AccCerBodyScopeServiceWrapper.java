/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyScopeService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScopeService
 * @generated
 */
public class AccCerBodyScopeServiceWrapper
	implements AccCerBodyScopeService, ServiceWrapper<AccCerBodyScopeService> {

	public AccCerBodyScopeServiceWrapper() {
		this(null);
	}

	public AccCerBodyScopeServiceWrapper(
		AccCerBodyScopeService accCerBodyScopeService) {

		_accCerBodyScopeService = accCerBodyScopeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyScopeService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyScopeService getWrappedService() {
		return _accCerBodyScopeService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyScopeService accCerBodyScopeService) {

		_accCerBodyScopeService = accCerBodyScopeService;
	}

	private AccCerBodyScopeService _accCerBodyScopeService;

}