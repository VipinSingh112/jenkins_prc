/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SecuredCreditorService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditorService
 * @generated
 */
public class SecuredCreditorServiceWrapper
	implements SecuredCreditorService, ServiceWrapper<SecuredCreditorService> {

	public SecuredCreditorServiceWrapper() {
		this(null);
	}

	public SecuredCreditorServiceWrapper(
		SecuredCreditorService securedCreditorService) {

		_securedCreditorService = securedCreditorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _securedCreditorService.getOSGiServiceIdentifier();
	}

	@Override
	public SecuredCreditorService getWrappedService() {
		return _securedCreditorService;
	}

	@Override
	public void setWrappedService(
		SecuredCreditorService securedCreditorService) {

		_securedCreditorService = securedCreditorService;
	}

	private SecuredCreditorService _securedCreditorService;

}