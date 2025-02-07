/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsService
 * @generated
 */
public class CreativeCompanyDetailsServiceWrapper
	implements CreativeCompanyDetailsService,
			   ServiceWrapper<CreativeCompanyDetailsService> {

	public CreativeCompanyDetailsServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDetailsServiceWrapper(
		CreativeCompanyDetailsService creativeCompanyDetailsService) {

		_creativeCompanyDetailsService = creativeCompanyDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyDetailsService getWrappedService() {
		return _creativeCompanyDetailsService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDetailsService creativeCompanyDetailsService) {

		_creativeCompanyDetailsService = creativeCompanyDetailsService;
	}

	private CreativeCompanyDetailsService _creativeCompanyDetailsService;

}