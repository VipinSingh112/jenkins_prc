/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccMediLabTestStructuralService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestStructuralService
 * @generated
 */
public class AccMediLabTestStructuralServiceWrapper
	implements AccMediLabTestStructuralService,
			   ServiceWrapper<AccMediLabTestStructuralService> {

	public AccMediLabTestStructuralServiceWrapper() {
		this(null);
	}

	public AccMediLabTestStructuralServiceWrapper(
		AccMediLabTestStructuralService accMediLabTestStructuralService) {

		_accMediLabTestStructuralService = accMediLabTestStructuralService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestStructuralService.getOSGiServiceIdentifier();
	}

	@Override
	public AccMediLabTestStructuralService getWrappedService() {
		return _accMediLabTestStructuralService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestStructuralService accMediLabTestStructuralService) {

		_accMediLabTestStructuralService = accMediLabTestStructuralService;
	}

	private AccMediLabTestStructuralService _accMediLabTestStructuralService;

}