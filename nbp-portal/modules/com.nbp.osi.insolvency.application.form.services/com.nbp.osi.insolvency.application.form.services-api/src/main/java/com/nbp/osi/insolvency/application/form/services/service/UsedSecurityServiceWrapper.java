/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsedSecurityService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsedSecurityService
 * @generated
 */
public class UsedSecurityServiceWrapper
	implements ServiceWrapper<UsedSecurityService>, UsedSecurityService {

	public UsedSecurityServiceWrapper() {
		this(null);
	}

	public UsedSecurityServiceWrapper(UsedSecurityService usedSecurityService) {
		_usedSecurityService = usedSecurityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _usedSecurityService.getOSGiServiceIdentifier();
	}

	@Override
	public UsedSecurityService getWrappedService() {
		return _usedSecurityService;
	}

	@Override
	public void setWrappedService(UsedSecurityService usedSecurityService) {
		_usedSecurityService = usedSecurityService;
	}

	private UsedSecurityService _usedSecurityService;

}