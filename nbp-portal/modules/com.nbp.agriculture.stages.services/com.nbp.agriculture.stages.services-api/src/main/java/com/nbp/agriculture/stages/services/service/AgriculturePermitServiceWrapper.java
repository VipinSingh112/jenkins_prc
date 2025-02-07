/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgriculturePermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermitService
 * @generated
 */
public class AgriculturePermitServiceWrapper
	implements AgriculturePermitService,
			   ServiceWrapper<AgriculturePermitService> {

	public AgriculturePermitServiceWrapper() {
		this(null);
	}

	public AgriculturePermitServiceWrapper(
		AgriculturePermitService agriculturePermitService) {

		_agriculturePermitService = agriculturePermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriculturePermitService.getOSGiServiceIdentifier();
	}

	@Override
	public AgriculturePermitService getWrappedService() {
		return _agriculturePermitService;
	}

	@Override
	public void setWrappedService(
		AgriculturePermitService agriculturePermitService) {

		_agriculturePermitService = agriculturePermitService;
	}

	private AgriculturePermitService _agriculturePermitService;

}