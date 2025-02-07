/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneFinancialInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfoService
 * @generated
 */
public class SezZoneFinancialInfoServiceWrapper
	implements ServiceWrapper<SezZoneFinancialInfoService>,
			   SezZoneFinancialInfoService {

	public SezZoneFinancialInfoServiceWrapper() {
		this(null);
	}

	public SezZoneFinancialInfoServiceWrapper(
		SezZoneFinancialInfoService sezZoneFinancialInfoService) {

		_sezZoneFinancialInfoService = sezZoneFinancialInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneFinancialInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneFinancialInfoService getWrappedService() {
		return _sezZoneFinancialInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneFinancialInfoService sezZoneFinancialInfoService) {

		_sezZoneFinancialInfoService = sezZoneFinancialInfoService;
	}

	private SezZoneFinancialInfoService _sezZoneFinancialInfoService;

}