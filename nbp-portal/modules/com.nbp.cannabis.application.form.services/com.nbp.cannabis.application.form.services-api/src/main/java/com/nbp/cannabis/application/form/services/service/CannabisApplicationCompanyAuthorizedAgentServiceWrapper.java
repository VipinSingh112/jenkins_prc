/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyAuthorizedAgentService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgentService
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentServiceWrapper
	implements CannabisApplicationCompanyAuthorizedAgentService,
			   ServiceWrapper
				   <CannabisApplicationCompanyAuthorizedAgentService> {

	public CannabisApplicationCompanyAuthorizedAgentServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyAuthorizedAgentServiceWrapper(
		CannabisApplicationCompanyAuthorizedAgentService
			cannabisApplicationCompanyAuthorizedAgentService) {

		_cannabisApplicationCompanyAuthorizedAgentService =
			cannabisApplicationCompanyAuthorizedAgentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyAuthorizedAgentService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationCompanyAuthorizedAgentService
		getWrappedService() {

		return _cannabisApplicationCompanyAuthorizedAgentService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyAuthorizedAgentService
			cannabisApplicationCompanyAuthorizedAgentService) {

		_cannabisApplicationCompanyAuthorizedAgentService =
			cannabisApplicationCompanyAuthorizedAgentService;
	}

	private CannabisApplicationCompanyAuthorizedAgentService
		_cannabisApplicationCompanyAuthorizedAgentService;

}