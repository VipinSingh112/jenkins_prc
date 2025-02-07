/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStageService
 * @generated
 */
public class CreativeApplicationCurrentStageServiceWrapper
	implements CreativeApplicationCurrentStageService,
			   ServiceWrapper<CreativeApplicationCurrentStageService> {

	public CreativeApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public CreativeApplicationCurrentStageServiceWrapper(
		CreativeApplicationCurrentStageService
			creativeApplicationCurrentStageService) {

		_creativeApplicationCurrentStageService =
			creativeApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeApplicationCurrentStageService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeApplicationCurrentStageService getWrappedService() {
		return _creativeApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		CreativeApplicationCurrentStageService
			creativeApplicationCurrentStageService) {

		_creativeApplicationCurrentStageService =
			creativeApplicationCurrentStageService;
	}

	private CreativeApplicationCurrentStageService
		_creativeApplicationCurrentStageService;

}