/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevEmplomentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmplomentInfoService
 * @generated
 */
public class SezDevEmplomentInfoServiceWrapper
	implements ServiceWrapper<SezDevEmplomentInfoService>,
			   SezDevEmplomentInfoService {

	public SezDevEmplomentInfoServiceWrapper() {
		this(null);
	}

	public SezDevEmplomentInfoServiceWrapper(
		SezDevEmplomentInfoService sezDevEmplomentInfoService) {

		_sezDevEmplomentInfoService = sezDevEmplomentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmplomentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevEmplomentInfoService getWrappedService() {
		return _sezDevEmplomentInfoService;
	}

	@Override
	public void setWrappedService(
		SezDevEmplomentInfoService sezDevEmplomentInfoService) {

		_sezDevEmplomentInfoService = sezDevEmplomentInfoService;
	}

	private SezDevEmplomentInfoService _sezDevEmplomentInfoService;

}