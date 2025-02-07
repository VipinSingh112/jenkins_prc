/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireExecutionService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecutionService
 * @generated
 */
public class AcquireExecutionServiceWrapper
	implements AcquireExecutionService,
			   ServiceWrapper<AcquireExecutionService> {

	public AcquireExecutionServiceWrapper() {
		this(null);
	}

	public AcquireExecutionServiceWrapper(
		AcquireExecutionService acquireExecutionService) {

		_acquireExecutionService = acquireExecutionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireExecutionService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireExecutionService getWrappedService() {
		return _acquireExecutionService;
	}

	@Override
	public void setWrappedService(
		AcquireExecutionService acquireExecutionService) {

		_acquireExecutionService = acquireExecutionService;
	}

	private AcquireExecutionService _acquireExecutionService;

}