/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativePermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitService
 * @generated
 */
public class CreativePermitServiceWrapper
	implements CreativePermitService, ServiceWrapper<CreativePermitService> {

	public CreativePermitServiceWrapper() {
		this(null);
	}

	public CreativePermitServiceWrapper(
		CreativePermitService creativePermitService) {

		_creativePermitService = creativePermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativePermitService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativePermitService getWrappedService() {
		return _creativePermitService;
	}

	@Override
	public void setWrappedService(CreativePermitService creativePermitService) {
		_creativePermitService = creativePermitService;
	}

	private CreativePermitService _creativePermitService;

}