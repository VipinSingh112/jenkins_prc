/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerificationService
 * @generated
 */
public class OsiDeskVerificationServiceWrapper
	implements OsiDeskVerificationService,
			   ServiceWrapper<OsiDeskVerificationService> {

	public OsiDeskVerificationServiceWrapper() {
		this(null);
	}

	public OsiDeskVerificationServiceWrapper(
		OsiDeskVerificationService osiDeskVerificationService) {

		_osiDeskVerificationService = osiDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiDeskVerificationService getWrappedService() {
		return _osiDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		OsiDeskVerificationService osiDeskVerificationService) {

		_osiDeskVerificationService = osiDeskVerificationService;
	}

	private OsiDeskVerificationService _osiDeskVerificationService;

}