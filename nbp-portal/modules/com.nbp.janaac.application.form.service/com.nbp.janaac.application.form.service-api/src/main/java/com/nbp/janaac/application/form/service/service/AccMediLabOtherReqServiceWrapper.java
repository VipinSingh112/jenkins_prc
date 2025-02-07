/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabOtherReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOtherReqService
 * @generated
 */
public class AccMediLabOtherReqServiceWrapper
	implements AccMediLabOtherReqService,
			   ServiceWrapper<AccMediLabOtherReqService> {

	public AccMediLabOtherReqServiceWrapper() {
		this(null);
	}

	public AccMediLabOtherReqServiceWrapper(
		AccMediLabOtherReqService accMediLabOtherReqService) {

		_accMediLabOtherReqService = accMediLabOtherReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabOtherReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabOtherReqService getWrappedService() {
		return _accMediLabOtherReqService;
	}

	@Override
	public void setWrappedService(
		AccMediLabOtherReqService accMediLabOtherReqService) {

		_accMediLabOtherReqService = accMediLabOtherReqService;
	}

	private AccMediLabOtherReqService _accMediLabOtherReqService;

}