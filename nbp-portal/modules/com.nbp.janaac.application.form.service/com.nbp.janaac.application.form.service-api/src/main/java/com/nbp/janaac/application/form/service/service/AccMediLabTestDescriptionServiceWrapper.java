/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabTestDescriptionService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionService
 * @generated
 */
public class AccMediLabTestDescriptionServiceWrapper
	implements AccMediLabTestDescriptionService,
			   ServiceWrapper<AccMediLabTestDescriptionService> {

	public AccMediLabTestDescriptionServiceWrapper() {
		this(null);
	}

	public AccMediLabTestDescriptionServiceWrapper(
		AccMediLabTestDescriptionService accMediLabTestDescriptionService) {

		_accMediLabTestDescriptionService = accMediLabTestDescriptionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestDescriptionService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabTestDescriptionService getWrappedService() {
		return _accMediLabTestDescriptionService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestDescriptionService accMediLabTestDescriptionService) {

		_accMediLabTestDescriptionService = accMediLabTestDescriptionService;
	}

	private AccMediLabTestDescriptionService _accMediLabTestDescriptionService;

}