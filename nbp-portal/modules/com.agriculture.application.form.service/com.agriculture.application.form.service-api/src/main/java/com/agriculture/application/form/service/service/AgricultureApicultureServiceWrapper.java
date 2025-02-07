/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureApicultureService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApicultureService
 * @generated
 */
public class AgricultureApicultureServiceWrapper
	implements AgricultureApicultureService,
			   ServiceWrapper<AgricultureApicultureService> {

	public AgricultureApicultureServiceWrapper() {
		this(null);
	}

	public AgricultureApicultureServiceWrapper(
		AgricultureApicultureService agricultureApicultureService) {

		_agricultureApicultureService = agricultureApicultureService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApicultureService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureApicultureService getWrappedService() {
		return _agricultureApicultureService;
	}

	@Override
	public void setWrappedService(
		AgricultureApicultureService agricultureApicultureService) {

		_agricultureApicultureService = agricultureApicultureService;
	}

	private AgricultureApicultureService _agricultureApicultureService;

}