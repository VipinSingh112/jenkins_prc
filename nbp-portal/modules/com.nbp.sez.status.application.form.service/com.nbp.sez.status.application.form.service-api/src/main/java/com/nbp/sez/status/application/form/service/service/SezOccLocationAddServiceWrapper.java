/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccLocationAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccLocationAddService
 * @generated
 */
public class SezOccLocationAddServiceWrapper
	implements ServiceWrapper<SezOccLocationAddService>,
			   SezOccLocationAddService {

	public SezOccLocationAddServiceWrapper() {
		this(null);
	}

	public SezOccLocationAddServiceWrapper(
		SezOccLocationAddService sezOccLocationAddService) {

		_sezOccLocationAddService = sezOccLocationAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccLocationAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccLocationAddService getWrappedService() {
		return _sezOccLocationAddService;
	}

	@Override
	public void setWrappedService(
		SezOccLocationAddService sezOccLocationAddService) {

		_sezOccLocationAddService = sezOccLocationAddService;
	}

	private SezOccLocationAddService _sezOccLocationAddService;

}