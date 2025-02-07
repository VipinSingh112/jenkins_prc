/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyMngReqTwoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoService
 * @generated
 */
public class AccCerBodyMngReqTwoServiceWrapper
	implements AccCerBodyMngReqTwoService,
			   ServiceWrapper<AccCerBodyMngReqTwoService> {

	public AccCerBodyMngReqTwoServiceWrapper() {
		this(null);
	}

	public AccCerBodyMngReqTwoServiceWrapper(
		AccCerBodyMngReqTwoService accCerBodyMngReqTwoService) {

		_accCerBodyMngReqTwoService = accCerBodyMngReqTwoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyMngReqTwoService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyMngReqTwoService getWrappedService() {
		return _accCerBodyMngReqTwoService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyMngReqTwoService accCerBodyMngReqTwoService) {

		_accCerBodyMngReqTwoService = accCerBodyMngReqTwoService;
	}

	private AccCerBodyMngReqTwoService _accCerBodyMngReqTwoService;

}