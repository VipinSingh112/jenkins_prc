/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevShareComDirectorShipAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddService
 * @generated
 */
public class SezDevShareComDirectorShipAddServiceWrapper
	implements ServiceWrapper<SezDevShareComDirectorShipAddService>,
			   SezDevShareComDirectorShipAddService {

	public SezDevShareComDirectorShipAddServiceWrapper() {
		this(null);
	}

	public SezDevShareComDirectorShipAddServiceWrapper(
		SezDevShareComDirectorShipAddService
			sezDevShareComDirectorShipAddService) {

		_sezDevShareComDirectorShipAddService =
			sezDevShareComDirectorShipAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareComDirectorShipAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevShareComDirectorShipAddService getWrappedService() {
		return _sezDevShareComDirectorShipAddService;
	}

	@Override
	public void setWrappedService(
		SezDevShareComDirectorShipAddService
			sezDevShareComDirectorShipAddService) {

		_sezDevShareComDirectorShipAddService =
			sezDevShareComDirectorShipAddService;
	}

	private SezDevShareComDirectorShipAddService
		_sezDevShareComDirectorShipAddService;

}