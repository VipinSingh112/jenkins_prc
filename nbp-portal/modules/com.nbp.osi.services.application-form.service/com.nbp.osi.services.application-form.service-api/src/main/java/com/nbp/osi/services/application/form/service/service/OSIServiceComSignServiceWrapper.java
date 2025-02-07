/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServiceComSignService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSignService
 * @generated
 */
public class OSIServiceComSignServiceWrapper
	implements OSIServiceComSignService,
			   ServiceWrapper<OSIServiceComSignService> {

	public OSIServiceComSignServiceWrapper() {
		this(null);
	}

	public OSIServiceComSignServiceWrapper(
		OSIServiceComSignService osiServiceComSignService) {

		_osiServiceComSignService = osiServiceComSignService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceComSignService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServiceComSignService getWrappedService() {
		return _osiServiceComSignService;
	}

	@Override
	public void setWrappedService(
		OSIServiceComSignService osiServiceComSignService) {

		_osiServiceComSignService = osiServiceComSignService;
	}

	private OSIServiceComSignService _osiServiceComSignService;

}