/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabPhysicalResourceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourceService
 * @generated
 */
public class AccMediLabPhysicalResourceServiceWrapper
	implements AccMediLabPhysicalResourceService,
			   ServiceWrapper<AccMediLabPhysicalResourceService> {

	public AccMediLabPhysicalResourceServiceWrapper() {
		this(null);
	}

	public AccMediLabPhysicalResourceServiceWrapper(
		AccMediLabPhysicalResourceService accMediLabPhysicalResourceService) {

		_accMediLabPhysicalResourceService = accMediLabPhysicalResourceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabPhysicalResourceService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabPhysicalResourceService getWrappedService() {
		return _accMediLabPhysicalResourceService;
	}

	@Override
	public void setWrappedService(
		AccMediLabPhysicalResourceService accMediLabPhysicalResourceService) {

		_accMediLabPhysicalResourceService = accMediLabPhysicalResourceService;
	}

	private AccMediLabPhysicalResourceService
		_accMediLabPhysicalResourceService;

}