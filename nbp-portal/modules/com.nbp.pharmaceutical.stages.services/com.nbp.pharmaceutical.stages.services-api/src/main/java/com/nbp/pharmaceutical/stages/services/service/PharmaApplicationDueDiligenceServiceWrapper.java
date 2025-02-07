/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligenceService
 * @generated
 */
public class PharmaApplicationDueDiligenceServiceWrapper
	implements PharmaApplicationDueDiligenceService,
			   ServiceWrapper<PharmaApplicationDueDiligenceService> {

	public PharmaApplicationDueDiligenceServiceWrapper() {
		this(null);
	}

	public PharmaApplicationDueDiligenceServiceWrapper(
		PharmaApplicationDueDiligenceService
			pharmaApplicationDueDiligenceService) {

		_pharmaApplicationDueDiligenceService =
			pharmaApplicationDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationDueDiligenceService getWrappedService() {
		return _pharmaApplicationDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationDueDiligenceService
			pharmaApplicationDueDiligenceService) {

		_pharmaApplicationDueDiligenceService =
			pharmaApplicationDueDiligenceService;
	}

	private PharmaApplicationDueDiligenceService
		_pharmaApplicationDueDiligenceService;

}