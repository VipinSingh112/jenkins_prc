/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolDataVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerificationService
 * @generated
 */
public class OsiInsolDataVerificationServiceWrapper
	implements OsiInsolDataVerificationService,
			   ServiceWrapper<OsiInsolDataVerificationService> {

	public OsiInsolDataVerificationServiceWrapper() {
		this(null);
	}

	public OsiInsolDataVerificationServiceWrapper(
		OsiInsolDataVerificationService osiInsolDataVerificationService) {

		_osiInsolDataVerificationService = osiInsolDataVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolDataVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolDataVerificationService getWrappedService() {
		return _osiInsolDataVerificationService;
	}

	@Override
	public void setWrappedService(
		OsiInsolDataVerificationService osiInsolDataVerificationService) {

		_osiInsolDataVerificationService = osiInsolDataVerificationService;
	}

	private OsiInsolDataVerificationService _osiInsolDataVerificationService;

}