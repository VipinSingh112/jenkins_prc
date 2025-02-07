/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyInfoService
 * @generated
 */
public class AccCerBodyInfoServiceWrapper
	implements AccCerBodyInfoService, ServiceWrapper<AccCerBodyInfoService> {

	public AccCerBodyInfoServiceWrapper() {
		this(null);
	}

	public AccCerBodyInfoServiceWrapper(
		AccCerBodyInfoService accCerBodyInfoService) {

		_accCerBodyInfoService = accCerBodyInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyInfoService getWrappedService() {
		return _accCerBodyInfoService;
	}

	@Override
	public void setWrappedService(AccCerBodyInfoService accCerBodyInfoService) {
		_accCerBodyInfoService = accCerBodyInfoService;
	}

	private AccCerBodyInfoService _accCerBodyInfoService;

}