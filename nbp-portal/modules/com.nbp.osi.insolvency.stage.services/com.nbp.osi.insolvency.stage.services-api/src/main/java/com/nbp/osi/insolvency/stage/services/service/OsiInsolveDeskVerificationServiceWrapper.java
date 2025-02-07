/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolveDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerificationService
 * @generated
 */
public class OsiInsolveDeskVerificationServiceWrapper
	implements OsiInsolveDeskVerificationService,
			   ServiceWrapper<OsiInsolveDeskVerificationService> {

	public OsiInsolveDeskVerificationServiceWrapper() {
		this(null);
	}

	public OsiInsolveDeskVerificationServiceWrapper(
		OsiInsolveDeskVerificationService osiInsolveDeskVerificationService) {

		_osiInsolveDeskVerificationService = osiInsolveDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolveDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolveDeskVerificationService getWrappedService() {
		return _osiInsolveDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		OsiInsolveDeskVerificationService osiInsolveDeskVerificationService) {

		_osiInsolveDeskVerificationService = osiInsolveDeskVerificationService;
	}

	private OsiInsolveDeskVerificationService
		_osiInsolveDeskVerificationService;

}