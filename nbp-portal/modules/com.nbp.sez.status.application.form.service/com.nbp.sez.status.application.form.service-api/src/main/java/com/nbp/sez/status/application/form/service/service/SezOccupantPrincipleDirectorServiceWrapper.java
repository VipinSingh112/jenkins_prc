/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantPrincipleDirectorService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirectorService
 * @generated
 */
public class SezOccupantPrincipleDirectorServiceWrapper
	implements ServiceWrapper<SezOccupantPrincipleDirectorService>,
			   SezOccupantPrincipleDirectorService {

	public SezOccupantPrincipleDirectorServiceWrapper() {
		this(null);
	}

	public SezOccupantPrincipleDirectorServiceWrapper(
		SezOccupantPrincipleDirectorService
			sezOccupantPrincipleDirectorService) {

		_sezOccupantPrincipleDirectorService =
			sezOccupantPrincipleDirectorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantPrincipleDirectorService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantPrincipleDirectorService getWrappedService() {
		return _sezOccupantPrincipleDirectorService;
	}

	@Override
	public void setWrappedService(
		SezOccupantPrincipleDirectorService
			sezOccupantPrincipleDirectorService) {

		_sezOccupantPrincipleDirectorService =
			sezOccupantPrincipleDirectorService;
	}

	private SezOccupantPrincipleDirectorService
		_sezOccupantPrincipleDirectorService;

}