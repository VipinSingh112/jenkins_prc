/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevShareCorporationBusAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareCorporationBusAddService
 * @generated
 */
public class SezDevShareCorporationBusAddServiceWrapper
	implements ServiceWrapper<SezDevShareCorporationBusAddService>,
			   SezDevShareCorporationBusAddService {

	public SezDevShareCorporationBusAddServiceWrapper() {
		this(null);
	}

	public SezDevShareCorporationBusAddServiceWrapper(
		SezDevShareCorporationBusAddService
			sezDevShareCorporationBusAddService) {

		_sezDevShareCorporationBusAddService =
			sezDevShareCorporationBusAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareCorporationBusAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevShareCorporationBusAddService getWrappedService() {
		return _sezDevShareCorporationBusAddService;
	}

	@Override
	public void setWrappedService(
		SezDevShareCorporationBusAddService
			sezDevShareCorporationBusAddService) {

		_sezDevShareCorporationBusAddService =
			sezDevShareCorporationBusAddService;
	}

	private SezDevShareCorporationBusAddService
		_sezDevShareCorporationBusAddService;

}