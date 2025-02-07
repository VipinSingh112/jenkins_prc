/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabTestManageReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestManageReqService
 * @generated
 */
public class AccMediLabTestManageReqServiceWrapper
	implements AccMediLabTestManageReqService,
			   ServiceWrapper<AccMediLabTestManageReqService> {

	public AccMediLabTestManageReqServiceWrapper() {
		this(null);
	}

	public AccMediLabTestManageReqServiceWrapper(
		AccMediLabTestManageReqService accMediLabTestManageReqService) {

		_accMediLabTestManageReqService = accMediLabTestManageReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestManageReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabTestManageReqService getWrappedService() {
		return _accMediLabTestManageReqService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestManageReqService accMediLabTestManageReqService) {

		_accMediLabTestManageReqService = accMediLabTestManageReqService;
	}

	private AccMediLabTestManageReqService _accMediLabTestManageReqService;

}