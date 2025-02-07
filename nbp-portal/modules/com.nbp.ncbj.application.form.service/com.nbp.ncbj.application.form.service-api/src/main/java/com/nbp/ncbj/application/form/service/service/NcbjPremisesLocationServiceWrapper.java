/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjPremisesLocationService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocationService
 * @generated
 */
public class NcbjPremisesLocationServiceWrapper
	implements NcbjPremisesLocationService,
			   ServiceWrapper<NcbjPremisesLocationService> {

	public NcbjPremisesLocationServiceWrapper() {
		this(null);
	}

	public NcbjPremisesLocationServiceWrapper(
		NcbjPremisesLocationService ncbjPremisesLocationService) {

		_ncbjPremisesLocationService = ncbjPremisesLocationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjPremisesLocationService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjPremisesLocationService getWrappedService() {
		return _ncbjPremisesLocationService;
	}

	@Override
	public void setWrappedService(
		NcbjPremisesLocationService ncbjPremisesLocationService) {

		_ncbjPremisesLocationService = ncbjPremisesLocationService;
	}

	private NcbjPremisesLocationService _ncbjPremisesLocationService;

}