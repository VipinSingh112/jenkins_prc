/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantEmploymentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfoService
 * @generated
 */
public class SezOccupantEmploymentInfoServiceWrapper
	implements ServiceWrapper<SezOccupantEmploymentInfoService>,
			   SezOccupantEmploymentInfoService {

	public SezOccupantEmploymentInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantEmploymentInfoServiceWrapper(
		SezOccupantEmploymentInfoService sezOccupantEmploymentInfoService) {

		_sezOccupantEmploymentInfoService = sezOccupantEmploymentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantEmploymentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantEmploymentInfoService getWrappedService() {
		return _sezOccupantEmploymentInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantEmploymentInfoService sezOccupantEmploymentInfoService) {

		_sezOccupantEmploymentInfoService = sezOccupantEmploymentInfoService;
	}

	private SezOccupantEmploymentInfoService _sezOccupantEmploymentInfoService;

}