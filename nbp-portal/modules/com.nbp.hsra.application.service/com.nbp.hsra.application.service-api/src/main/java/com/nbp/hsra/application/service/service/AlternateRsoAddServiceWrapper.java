/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AlternateRsoAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAddService
 * @generated
 */
public class AlternateRsoAddServiceWrapper
	implements AlternateRsoAddService, ServiceWrapper<AlternateRsoAddService> {

	public AlternateRsoAddServiceWrapper() {
		this(null);
	}

	public AlternateRsoAddServiceWrapper(
		AlternateRsoAddService alternateRsoAddService) {

		_alternateRsoAddService = alternateRsoAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _alternateRsoAddService.getOSGiServiceIdentifier();
	}

	@Override
	public AlternateRsoAddService getWrappedService() {
		return _alternateRsoAddService;
	}

	@Override
	public void setWrappedService(
		AlternateRsoAddService alternateRsoAddService) {

		_alternateRsoAddService = alternateRsoAddService;
	}

	private AlternateRsoAddService _alternateRsoAddService;

}