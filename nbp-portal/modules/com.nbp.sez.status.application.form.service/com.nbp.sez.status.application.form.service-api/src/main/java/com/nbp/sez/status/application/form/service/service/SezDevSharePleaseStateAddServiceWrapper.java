/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevSharePleaseStateAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePleaseStateAddService
 * @generated
 */
public class SezDevSharePleaseStateAddServiceWrapper
	implements ServiceWrapper<SezDevSharePleaseStateAddService>,
			   SezDevSharePleaseStateAddService {

	public SezDevSharePleaseStateAddServiceWrapper() {
		this(null);
	}

	public SezDevSharePleaseStateAddServiceWrapper(
		SezDevSharePleaseStateAddService sezDevSharePleaseStateAddService) {

		_sezDevSharePleaseStateAddService = sezDevSharePleaseStateAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevSharePleaseStateAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevSharePleaseStateAddService getWrappedService() {
		return _sezDevSharePleaseStateAddService;
	}

	@Override
	public void setWrappedService(
		SezDevSharePleaseStateAddService sezDevSharePleaseStateAddService) {

		_sezDevSharePleaseStateAddService = sezDevSharePleaseStateAddService;
	}

	private SezDevSharePleaseStateAddService _sezDevSharePleaseStateAddService;

}