/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AlternateRsoOneAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAddService
 * @generated
 */
public class AlternateRsoOneAddServiceWrapper
	implements AlternateRsoOneAddService,
			   ServiceWrapper<AlternateRsoOneAddService> {

	public AlternateRsoOneAddServiceWrapper() {
		this(null);
	}

	public AlternateRsoOneAddServiceWrapper(
		AlternateRsoOneAddService alternateRsoOneAddService) {

		_alternateRsoOneAddService = alternateRsoOneAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _alternateRsoOneAddService.getOSGiServiceIdentifier();
	}

	@Override
	public AlternateRsoOneAddService getWrappedService() {
		return _alternateRsoOneAddService;
	}

	@Override
	public void setWrappedService(
		AlternateRsoOneAddService alternateRsoOneAddService) {

		_alternateRsoOneAddService = alternateRsoOneAddService;
	}

	private AlternateRsoOneAddService _alternateRsoOneAddService;

}