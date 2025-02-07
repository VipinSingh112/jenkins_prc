/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevGenBusinessInfoAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAddService
 * @generated
 */
public class SezDevGenBusinessInfoAddServiceWrapper
	implements ServiceWrapper<SezDevGenBusinessInfoAddService>,
			   SezDevGenBusinessInfoAddService {

	public SezDevGenBusinessInfoAddServiceWrapper() {
		this(null);
	}

	public SezDevGenBusinessInfoAddServiceWrapper(
		SezDevGenBusinessInfoAddService sezDevGenBusinessInfoAddService) {

		_sezDevGenBusinessInfoAddService = sezDevGenBusinessInfoAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevGenBusinessInfoAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevGenBusinessInfoAddService getWrappedService() {
		return _sezDevGenBusinessInfoAddService;
	}

	@Override
	public void setWrappedService(
		SezDevGenBusinessInfoAddService sezDevGenBusinessInfoAddService) {

		_sezDevGenBusinessInfoAddService = sezDevGenBusinessInfoAddService;
	}

	private SezDevGenBusinessInfoAddService _sezDevGenBusinessInfoAddService;

}