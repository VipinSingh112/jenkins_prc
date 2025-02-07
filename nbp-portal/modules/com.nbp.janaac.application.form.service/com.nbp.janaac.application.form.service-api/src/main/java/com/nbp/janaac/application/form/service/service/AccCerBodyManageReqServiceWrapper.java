/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyManageReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReqService
 * @generated
 */
public class AccCerBodyManageReqServiceWrapper
	implements AccCerBodyManageReqService,
			   ServiceWrapper<AccCerBodyManageReqService> {

	public AccCerBodyManageReqServiceWrapper() {
		this(null);
	}

	public AccCerBodyManageReqServiceWrapper(
		AccCerBodyManageReqService accCerBodyManageReqService) {

		_accCerBodyManageReqService = accCerBodyManageReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyManageReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyManageReqService getWrappedService() {
		return _accCerBodyManageReqService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyManageReqService accCerBodyManageReqService) {

		_accCerBodyManageReqService = accCerBodyManageReqService;
	}

	private AccCerBodyManageReqService _accCerBodyManageReqService;

}