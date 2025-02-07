/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantPrincipleOfficerService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficerService
 * @generated
 */
public class SezOccupantPrincipleOfficerServiceWrapper
	implements ServiceWrapper<SezOccupantPrincipleOfficerService>,
			   SezOccupantPrincipleOfficerService {

	public SezOccupantPrincipleOfficerServiceWrapper() {
		this(null);
	}

	public SezOccupantPrincipleOfficerServiceWrapper(
		SezOccupantPrincipleOfficerService sezOccupantPrincipleOfficerService) {

		_sezOccupantPrincipleOfficerService =
			sezOccupantPrincipleOfficerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantPrincipleOfficerService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantPrincipleOfficerService getWrappedService() {
		return _sezOccupantPrincipleOfficerService;
	}

	@Override
	public void setWrappedService(
		SezOccupantPrincipleOfficerService sezOccupantPrincipleOfficerService) {

		_sezOccupantPrincipleOfficerService =
			sezOccupantPrincipleOfficerService;
	}

	private SezOccupantPrincipleOfficerService
		_sezOccupantPrincipleOfficerService;

}