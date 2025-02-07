/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevShareholdingInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfoService
 * @generated
 */
public class SezDevShareholdingInfoServiceWrapper
	implements ServiceWrapper<SezDevShareholdingInfoService>,
			   SezDevShareholdingInfoService {

	public SezDevShareholdingInfoServiceWrapper() {
		this(null);
	}

	public SezDevShareholdingInfoServiceWrapper(
		SezDevShareholdingInfoService sezDevShareholdingInfoService) {

		_sezDevShareholdingInfoService = sezDevShareholdingInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareholdingInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevShareholdingInfoService getWrappedService() {
		return _sezDevShareholdingInfoService;
	}

	@Override
	public void setWrappedService(
		SezDevShareholdingInfoService sezDevShareholdingInfoService) {

		_sezDevShareholdingInfoService = sezDevShareholdingInfoService;
	}

	private SezDevShareholdingInfoService _sezDevShareholdingInfoService;

}