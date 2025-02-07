/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireDraftAgreementService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreementService
 * @generated
 */
public class AcquireDraftAgreementServiceWrapper
	implements AcquireDraftAgreementService,
			   ServiceWrapper<AcquireDraftAgreementService> {

	public AcquireDraftAgreementServiceWrapper() {
		this(null);
	}

	public AcquireDraftAgreementServiceWrapper(
		AcquireDraftAgreementService acquireDraftAgreementService) {

		_acquireDraftAgreementService = acquireDraftAgreementService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDraftAgreementService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireDraftAgreementService getWrappedService() {
		return _acquireDraftAgreementService;
	}

	@Override
	public void setWrappedService(
		AcquireDraftAgreementService acquireDraftAgreementService) {

		_acquireDraftAgreementService = acquireDraftAgreementService;
	}

	private AcquireDraftAgreementService _acquireDraftAgreementService;

}