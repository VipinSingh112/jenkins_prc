/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccCerBodyPersonnelService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnelService
 * @generated
 */
public class AccCerBodyPersonnelServiceWrapper
	implements AccCerBodyPersonnelService,
			   ServiceWrapper<AccCerBodyPersonnelService> {

	public AccCerBodyPersonnelServiceWrapper() {
		this(null);
	}

	public AccCerBodyPersonnelServiceWrapper(
		AccCerBodyPersonnelService accCerBodyPersonnelService) {

		_accCerBodyPersonnelService = accCerBodyPersonnelService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyPersonnelService.getOSGiServiceIdentifier();
	}

	@Override
	public AccCerBodyPersonnelService getWrappedService() {
		return _accCerBodyPersonnelService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyPersonnelService accCerBodyPersonnelService) {

		_accCerBodyPersonnelService = accCerBodyPersonnelService;
	}

	private AccCerBodyPersonnelService _accCerBodyPersonnelService;

}