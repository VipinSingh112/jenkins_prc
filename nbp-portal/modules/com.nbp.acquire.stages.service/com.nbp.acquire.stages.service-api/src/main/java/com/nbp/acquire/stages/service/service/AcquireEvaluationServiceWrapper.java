/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireEvaluationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluationService
 * @generated
 */
public class AcquireEvaluationServiceWrapper
	implements AcquireEvaluationService,
			   ServiceWrapper<AcquireEvaluationService> {

	public AcquireEvaluationServiceWrapper() {
		this(null);
	}

	public AcquireEvaluationServiceWrapper(
		AcquireEvaluationService acquireEvaluationService) {

		_acquireEvaluationService = acquireEvaluationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireEvaluationService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireEvaluationService getWrappedService() {
		return _acquireEvaluationService;
	}

	@Override
	public void setWrappedService(
		AcquireEvaluationService acquireEvaluationService) {

		_acquireEvaluationService = acquireEvaluationService;
	}

	private AcquireEvaluationService _acquireEvaluationService;

}