/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyProdScopeService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyProdScopeService
 * @generated
 */
public class AccCerBodyProdScopeServiceWrapper
	implements AccCerBodyProdScopeService,
			   ServiceWrapper<AccCerBodyProdScopeService> {

	public AccCerBodyProdScopeServiceWrapper() {
		this(null);
	}

	public AccCerBodyProdScopeServiceWrapper(
		AccCerBodyProdScopeService accCerBodyProdScopeService) {

		_accCerBodyProdScopeService = accCerBodyProdScopeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyProdScopeService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyProdScopeService getWrappedService() {
		return _accCerBodyProdScopeService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyProdScopeService accCerBodyProdScopeService) {

		_accCerBodyProdScopeService = accCerBodyProdScopeService;
	}

	private AccCerBodyProdScopeService _accCerBodyProdScopeService;

}