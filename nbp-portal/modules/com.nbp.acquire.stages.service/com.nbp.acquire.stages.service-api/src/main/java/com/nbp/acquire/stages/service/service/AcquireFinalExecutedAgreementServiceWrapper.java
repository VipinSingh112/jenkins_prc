/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireFinalExecutedAgreementService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementService
 * @generated
 */
public class AcquireFinalExecutedAgreementServiceWrapper
	implements AcquireFinalExecutedAgreementService,
			   ServiceWrapper<AcquireFinalExecutedAgreementService> {

	public AcquireFinalExecutedAgreementServiceWrapper() {
		this(null);
	}

	public AcquireFinalExecutedAgreementServiceWrapper(
		AcquireFinalExecutedAgreementService
			acquireFinalExecutedAgreementService) {

		_acquireFinalExecutedAgreementService =
			acquireFinalExecutedAgreementService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireFinalExecutedAgreementService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireFinalExecutedAgreementService getWrappedService() {
		return _acquireFinalExecutedAgreementService;
	}

	@Override
	public void setWrappedService(
		AcquireFinalExecutedAgreementService
			acquireFinalExecutedAgreementService) {

		_acquireFinalExecutedAgreementService =
			acquireFinalExecutedAgreementService;
	}

	private AcquireFinalExecutedAgreementService
		_acquireFinalExecutedAgreementService;

}