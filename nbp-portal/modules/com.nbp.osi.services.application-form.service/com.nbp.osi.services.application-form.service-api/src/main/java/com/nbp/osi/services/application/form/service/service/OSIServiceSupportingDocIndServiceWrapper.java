/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSIServiceSupportingDocIndService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocIndService
 * @generated
 */
public class OSIServiceSupportingDocIndServiceWrapper
	implements OSIServiceSupportingDocIndService,
			   ServiceWrapper<OSIServiceSupportingDocIndService> {

	public OSIServiceSupportingDocIndServiceWrapper() {
		this(null);
	}

	public OSIServiceSupportingDocIndServiceWrapper(
		OSIServiceSupportingDocIndService osiServiceSupportingDocIndService) {

		_osiServiceSupportingDocIndService = osiServiceSupportingDocIndService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceSupportingDocIndService.getOSGiServiceIdentifier();
	}

	@Override
	public OSIServiceSupportingDocIndService getWrappedService() {
		return _osiServiceSupportingDocIndService;
	}

	@Override
	public void setWrappedService(
		OSIServiceSupportingDocIndService osiServiceSupportingDocIndService) {

		_osiServiceSupportingDocIndService = osiServiceSupportingDocIndService;
	}

	private OSIServiceSupportingDocIndService
		_osiServiceSupportingDocIndService;

}