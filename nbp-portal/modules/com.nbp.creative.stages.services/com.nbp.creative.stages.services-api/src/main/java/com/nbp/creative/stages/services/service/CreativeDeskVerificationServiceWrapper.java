/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerificationService
 * @generated
 */
public class CreativeDeskVerificationServiceWrapper
	implements CreativeDeskVerificationService,
			   ServiceWrapper<CreativeDeskVerificationService> {

	public CreativeDeskVerificationServiceWrapper() {
		this(null);
	}

	public CreativeDeskVerificationServiceWrapper(
		CreativeDeskVerificationService creativeDeskVerificationService) {

		_creativeDeskVerificationService = creativeDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeDeskVerificationService getWrappedService() {
		return _creativeDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		CreativeDeskVerificationService creativeDeskVerificationService) {

		_creativeDeskVerificationService = creativeDeskVerificationService;
	}

	private CreativeDeskVerificationService _creativeDeskVerificationService;

}