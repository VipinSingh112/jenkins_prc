/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCOathRequestService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestService
 * @generated
 */
public class JADSCOathRequestServiceWrapper
	implements JADSCOathRequestService,
			   ServiceWrapper<JADSCOathRequestService> {

	public JADSCOathRequestServiceWrapper() {
		this(null);
	}

	public JADSCOathRequestServiceWrapper(
		JADSCOathRequestService jadscOathRequestService) {

		_jadscOathRequestService = jadscOathRequestService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscOathRequestService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCOathRequestService getWrappedService() {
		return _jadscOathRequestService;
	}

	@Override
	public void setWrappedService(
		JADSCOathRequestService jadscOathRequestService) {

		_jadscOathRequestService = jadscOathRequestService;
	}

	private JADSCOathRequestService _jadscOathRequestService;

}