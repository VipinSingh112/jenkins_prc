/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevShareDirectorAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAddService
 * @generated
 */
public class SezDevShareDirectorAddServiceWrapper
	implements ServiceWrapper<SezDevShareDirectorAddService>,
			   SezDevShareDirectorAddService {

	public SezDevShareDirectorAddServiceWrapper() {
		this(null);
	}

	public SezDevShareDirectorAddServiceWrapper(
		SezDevShareDirectorAddService sezDevShareDirectorAddService) {

		_sezDevShareDirectorAddService = sezDevShareDirectorAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareDirectorAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevShareDirectorAddService getWrappedService() {
		return _sezDevShareDirectorAddService;
	}

	@Override
	public void setWrappedService(
		SezDevShareDirectorAddService sezDevShareDirectorAddService) {

		_sezDevShareDirectorAddService = sezDevShareDirectorAddService;
	}

	private SezDevShareDirectorAddService _sezDevShareDirectorAddService;

}