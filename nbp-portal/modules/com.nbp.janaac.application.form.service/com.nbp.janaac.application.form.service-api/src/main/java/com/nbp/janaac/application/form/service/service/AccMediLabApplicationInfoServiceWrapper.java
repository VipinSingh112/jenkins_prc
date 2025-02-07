/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabApplicationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfoService
 * @generated
 */
public class AccMediLabApplicationInfoServiceWrapper
	implements AccMediLabApplicationInfoService,
			   ServiceWrapper<AccMediLabApplicationInfoService> {

	public AccMediLabApplicationInfoServiceWrapper() {
		this(null);
	}

	public AccMediLabApplicationInfoServiceWrapper(
		AccMediLabApplicationInfoService accMediLabApplicationInfoService) {

		_accMediLabApplicationInfoService = accMediLabApplicationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabApplicationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabApplicationInfoService getWrappedService() {
		return _accMediLabApplicationInfoService;
	}

	@Override
	public void setWrappedService(
		AccMediLabApplicationInfoService accMediLabApplicationInfoService) {

		_accMediLabApplicationInfoService = accMediLabApplicationInfoService;
	}

	private AccMediLabApplicationInfoService _accMediLabApplicationInfoService;

}