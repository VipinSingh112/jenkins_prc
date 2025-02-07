/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgriculturePoultryService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultryService
 * @generated
 */
public class AgriculturePoultryServiceWrapper
	implements AgriculturePoultryService,
			   ServiceWrapper<AgriculturePoultryService> {

	public AgriculturePoultryServiceWrapper() {
		this(null);
	}

	public AgriculturePoultryServiceWrapper(
		AgriculturePoultryService agriculturePoultryService) {

		_agriculturePoultryService = agriculturePoultryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriculturePoultryService.getOSGiServiceIdentifier();
	}

	@Override
	public AgriculturePoultryService getWrappedService() {
		return _agriculturePoultryService;
	}

	@Override
	public void setWrappedService(
		AgriculturePoultryService agriculturePoultryService) {

		_agriculturePoultryService = agriculturePoultryService;
	}

	private AgriculturePoultryService _agriculturePoultryService;

}