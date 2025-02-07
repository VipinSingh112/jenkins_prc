/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccInsBodiesManageSysService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSysService
 * @generated
 */
public class AccInsBodiesManageSysServiceWrapper
	implements AccInsBodiesManageSysService,
			   ServiceWrapper<AccInsBodiesManageSysService> {

	public AccInsBodiesManageSysServiceWrapper() {
		this(null);
	}

	public AccInsBodiesManageSysServiceWrapper(
		AccInsBodiesManageSysService accInsBodiesManageSysService) {

		_accInsBodiesManageSysService = accInsBodiesManageSysService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesManageSysService.getOSGiServiceIdentifier();
	}

	@Override
	public AccInsBodiesManageSysService getWrappedService() {
		return _accInsBodiesManageSysService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesManageSysService accInsBodiesManageSysService) {

		_accInsBodiesManageSysService = accInsBodiesManageSysService;
	}

	private AccInsBodiesManageSysService _accInsBodiesManageSysService;

}