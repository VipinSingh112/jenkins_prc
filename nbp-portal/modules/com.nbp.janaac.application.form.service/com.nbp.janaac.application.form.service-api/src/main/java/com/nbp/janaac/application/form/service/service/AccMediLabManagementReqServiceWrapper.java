/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabManagementReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReqService
 * @generated
 */
public class AccMediLabManagementReqServiceWrapper
	implements AccMediLabManagementReqService,
			   ServiceWrapper<AccMediLabManagementReqService> {

	public AccMediLabManagementReqServiceWrapper() {
		this(null);
	}

	public AccMediLabManagementReqServiceWrapper(
		AccMediLabManagementReqService accMediLabManagementReqService) {

		_accMediLabManagementReqService = accMediLabManagementReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabManagementReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabManagementReqService getWrappedService() {
		return _accMediLabManagementReqService;
	}

	@Override
	public void setWrappedService(
		AccMediLabManagementReqService accMediLabManagementReqService) {

		_accMediLabManagementReqService = accMediLabManagementReqService;
	}

	private AccMediLabManagementReqService _accMediLabManagementReqService;

}