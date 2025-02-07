/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HSRAApplicationDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationDueDiligenceService
 * @generated
 */
public class HSRAApplicationDueDiligenceServiceWrapper
	implements HSRAApplicationDueDiligenceService,
			   ServiceWrapper<HSRAApplicationDueDiligenceService> {

	public HSRAApplicationDueDiligenceServiceWrapper() {
		this(null);
	}

	public HSRAApplicationDueDiligenceServiceWrapper(
		HSRAApplicationDueDiligenceService hsraApplicationDueDiligenceService) {

		_hsraApplicationDueDiligenceService =
			hsraApplicationDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public HSRAApplicationDueDiligenceService getWrappedService() {
		return _hsraApplicationDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		HSRAApplicationDueDiligenceService hsraApplicationDueDiligenceService) {

		_hsraApplicationDueDiligenceService =
			hsraApplicationDueDiligenceService;
	}

	private HSRAApplicationDueDiligenceService
		_hsraApplicationDueDiligenceService;

}