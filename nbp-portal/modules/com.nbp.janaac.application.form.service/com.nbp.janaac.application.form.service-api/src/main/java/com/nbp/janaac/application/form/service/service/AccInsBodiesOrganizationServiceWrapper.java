/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccInsBodiesOrganizationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationService
 * @generated
 */
public class AccInsBodiesOrganizationServiceWrapper
	implements AccInsBodiesOrganizationService,
			   ServiceWrapper<AccInsBodiesOrganizationService> {

	public AccInsBodiesOrganizationServiceWrapper() {
		this(null);
	}

	public AccInsBodiesOrganizationServiceWrapper(
		AccInsBodiesOrganizationService accInsBodiesOrganizationService) {

		_accInsBodiesOrganizationService = accInsBodiesOrganizationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesOrganizationService.getOSGiServiceIdentifier();
	}

	@Override
	public AccInsBodiesOrganizationService getWrappedService() {
		return _accInsBodiesOrganizationService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesOrganizationService accInsBodiesOrganizationService) {

		_accInsBodiesOrganizationService = accInsBodiesOrganizationService;
	}

	private AccInsBodiesOrganizationService _accInsBodiesOrganizationService;

}