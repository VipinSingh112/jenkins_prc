/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesService
 * @generated
 */
public class CreativeApplicationStagesServiceWrapper
	implements CreativeApplicationStagesService,
			   ServiceWrapper<CreativeApplicationStagesService> {

	public CreativeApplicationStagesServiceWrapper() {
		this(null);
	}

	public CreativeApplicationStagesServiceWrapper(
		CreativeApplicationStagesService creativeApplicationStagesService) {

		_creativeApplicationStagesService = creativeApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeApplicationStagesService getWrappedService() {
		return _creativeApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		CreativeApplicationStagesService creativeApplicationStagesService) {

		_creativeApplicationStagesService = creativeApplicationStagesService;
	}

	private CreativeApplicationStagesService _creativeApplicationStagesService;

}