/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevGeneralBusinessIfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfoService
 * @generated
 */
public class SezDevGeneralBusinessIfoServiceWrapper
	implements ServiceWrapper<SezDevGeneralBusinessIfoService>,
			   SezDevGeneralBusinessIfoService {

	public SezDevGeneralBusinessIfoServiceWrapper() {
		this(null);
	}

	public SezDevGeneralBusinessIfoServiceWrapper(
		SezDevGeneralBusinessIfoService sezDevGeneralBusinessIfoService) {

		_sezDevGeneralBusinessIfoService = sezDevGeneralBusinessIfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevGeneralBusinessIfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevGeneralBusinessIfoService getWrappedService() {
		return _sezDevGeneralBusinessIfoService;
	}

	@Override
	public void setWrappedService(
		SezDevGeneralBusinessIfoService sezDevGeneralBusinessIfoService) {

		_sezDevGeneralBusinessIfoService = sezDevGeneralBusinessIfoService;
	}

	private SezDevGeneralBusinessIfoService _sezDevGeneralBusinessIfoService;

}