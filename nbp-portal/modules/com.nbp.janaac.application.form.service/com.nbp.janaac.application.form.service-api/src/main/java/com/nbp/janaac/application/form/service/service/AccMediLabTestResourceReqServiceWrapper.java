/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabTestResourceReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReqService
 * @generated
 */
public class AccMediLabTestResourceReqServiceWrapper
	implements AccMediLabTestResourceReqService,
			   ServiceWrapper<AccMediLabTestResourceReqService> {

	public AccMediLabTestResourceReqServiceWrapper() {
		this(null);
	}

	public AccMediLabTestResourceReqServiceWrapper(
		AccMediLabTestResourceReqService accMediLabTestResourceReqService) {

		_accMediLabTestResourceReqService = accMediLabTestResourceReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestResourceReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabTestResourceReqService getWrappedService() {
		return _accMediLabTestResourceReqService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestResourceReqService accMediLabTestResourceReqService) {

		_accMediLabTestResourceReqService = accMediLabTestResourceReqService;
	}

	private AccMediLabTestResourceReqService _accMediLabTestResourceReqService;

}