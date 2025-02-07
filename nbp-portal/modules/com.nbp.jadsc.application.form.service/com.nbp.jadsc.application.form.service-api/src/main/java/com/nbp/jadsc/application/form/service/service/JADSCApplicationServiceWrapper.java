/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplicationService
 * @generated
 */
public class JADSCApplicationServiceWrapper
	implements JADSCApplicationService,
			   ServiceWrapper<JADSCApplicationService> {

	public JADSCApplicationServiceWrapper() {
		this(null);
	}

	public JADSCApplicationServiceWrapper(
		JADSCApplicationService jadscApplicationService) {

		_jadscApplicationService = jadscApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCApplicationService getWrappedService() {
		return _jadscApplicationService;
	}

	@Override
	public void setWrappedService(
		JADSCApplicationService jadscApplicationService) {

		_jadscApplicationService = jadscApplicationService;
	}

	private JADSCApplicationService _jadscApplicationService;

}