/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusWFMLocationAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAddService
 * @generated
 */
public class SezStatusWFMLocationAddServiceWrapper
	implements ServiceWrapper<SezStatusWFMLocationAddService>,
			   SezStatusWFMLocationAddService {

	public SezStatusWFMLocationAddServiceWrapper() {
		this(null);
	}

	public SezStatusWFMLocationAddServiceWrapper(
		SezStatusWFMLocationAddService sezStatusWFMLocationAddService) {

		_sezStatusWFMLocationAddService = sezStatusWFMLocationAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWFMLocationAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusWFMLocationAddService getWrappedService() {
		return _sezStatusWFMLocationAddService;
	}

	@Override
	public void setWrappedService(
		SezStatusWFMLocationAddService sezStatusWFMLocationAddService) {

		_sezStatusWFMLocationAddService = sezStatusWFMLocationAddService;
	}

	private SezStatusWFMLocationAddService _sezStatusWFMLocationAddService;

}