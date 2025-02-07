/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeIndividualDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsService
 * @generated
 */
public class CreativeIndividualDetailsServiceWrapper
	implements CreativeIndividualDetailsService,
			   ServiceWrapper<CreativeIndividualDetailsService> {

	public CreativeIndividualDetailsServiceWrapper() {
		this(null);
	}

	public CreativeIndividualDetailsServiceWrapper(
		CreativeIndividualDetailsService creativeIndividualDetailsService) {

		_creativeIndividualDetailsService = creativeIndividualDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeIndividualDetailsService getWrappedService() {
		return _creativeIndividualDetailsService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualDetailsService creativeIndividualDetailsService) {

		_creativeIndividualDetailsService = creativeIndividualDetailsService;
	}

	private CreativeIndividualDetailsService _creativeIndividualDetailsService;

}