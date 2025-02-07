/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureAquacultureService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureService
 * @generated
 */
public class AgricultureAquacultureServiceWrapper
	implements AgricultureAquacultureService,
			   ServiceWrapper<AgricultureAquacultureService> {

	public AgricultureAquacultureServiceWrapper() {
		this(null);
	}

	public AgricultureAquacultureServiceWrapper(
		AgricultureAquacultureService agricultureAquacultureService) {

		_agricultureAquacultureService = agricultureAquacultureService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureAquacultureService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureAquacultureService getWrappedService() {
		return _agricultureAquacultureService;
	}

	@Override
	public void setWrappedService(
		AgricultureAquacultureService agricultureAquacultureService) {

		_agricultureAquacultureService = agricultureAquacultureService;
	}

	private AgricultureAquacultureService _agricultureAquacultureService;

}