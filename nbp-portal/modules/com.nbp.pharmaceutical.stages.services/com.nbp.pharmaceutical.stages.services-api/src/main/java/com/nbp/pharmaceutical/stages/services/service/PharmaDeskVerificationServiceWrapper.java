/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationService
 * @generated
 */
public class PharmaDeskVerificationServiceWrapper
	implements PharmaDeskVerificationService,
			   ServiceWrapper<PharmaDeskVerificationService> {

	public PharmaDeskVerificationServiceWrapper() {
		this(null);
	}

	public PharmaDeskVerificationServiceWrapper(
		PharmaDeskVerificationService pharmaDeskVerificationService) {

		_pharmaDeskVerificationService = pharmaDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaDeskVerificationService getWrappedService() {
		return _pharmaDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		PharmaDeskVerificationService pharmaDeskVerificationService) {

		_pharmaDeskVerificationService = pharmaDeskVerificationService;
	}

	private PharmaDeskVerificationService _pharmaDeskVerificationService;

}