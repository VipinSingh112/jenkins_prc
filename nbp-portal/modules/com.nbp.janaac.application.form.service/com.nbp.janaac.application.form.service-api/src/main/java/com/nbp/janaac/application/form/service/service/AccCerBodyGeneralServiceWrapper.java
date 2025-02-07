/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyGeneralService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyGeneralService
 * @generated
 */
public class AccCerBodyGeneralServiceWrapper
	implements AccCerBodyGeneralService,
			   ServiceWrapper<AccCerBodyGeneralService> {

	public AccCerBodyGeneralServiceWrapper() {
		this(null);
	}

	public AccCerBodyGeneralServiceWrapper(
		AccCerBodyGeneralService accCerBodyGeneralService) {

		_accCerBodyGeneralService = accCerBodyGeneralService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyGeneralService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyGeneralService getWrappedService() {
		return _accCerBodyGeneralService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyGeneralService accCerBodyGeneralService) {

		_accCerBodyGeneralService = accCerBodyGeneralService;
	}

	private AccCerBodyGeneralService _accCerBodyGeneralService;

}