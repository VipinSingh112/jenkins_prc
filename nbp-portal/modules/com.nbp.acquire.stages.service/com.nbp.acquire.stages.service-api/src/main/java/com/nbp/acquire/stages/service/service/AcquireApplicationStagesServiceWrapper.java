/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationStagesService
 * @generated
 */
public class AcquireApplicationStagesServiceWrapper
	implements AcquireApplicationStagesService,
			   ServiceWrapper<AcquireApplicationStagesService> {

	public AcquireApplicationStagesServiceWrapper() {
		this(null);
	}

	public AcquireApplicationStagesServiceWrapper(
		AcquireApplicationStagesService acquireApplicationStagesService) {

		_acquireApplicationStagesService = acquireApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireApplicationStagesService getWrappedService() {
		return _acquireApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationStagesService acquireApplicationStagesService) {

		_acquireApplicationStagesService = acquireApplicationStagesService;
	}

	private AcquireApplicationStagesService _acquireApplicationStagesService;

}