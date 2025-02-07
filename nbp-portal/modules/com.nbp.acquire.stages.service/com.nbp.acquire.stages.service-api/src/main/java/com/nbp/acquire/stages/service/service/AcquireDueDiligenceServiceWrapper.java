/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligenceService
 * @generated
 */
public class AcquireDueDiligenceServiceWrapper
	implements AcquireDueDiligenceService,
			   ServiceWrapper<AcquireDueDiligenceService> {

	public AcquireDueDiligenceServiceWrapper() {
		this(null);
	}

	public AcquireDueDiligenceServiceWrapper(
		AcquireDueDiligenceService acquireDueDiligenceService) {

		_acquireDueDiligenceService = acquireDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireDueDiligenceService getWrappedService() {
		return _acquireDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		AcquireDueDiligenceService acquireDueDiligenceService) {

		_acquireDueDiligenceService = acquireDueDiligenceService;
	}

	private AcquireDueDiligenceService _acquireDueDiligenceService;

}