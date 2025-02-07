/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgriDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerificationService
 * @generated
 */
public class AgriDeskVerificationServiceWrapper
	implements AgriDeskVerificationService,
			   ServiceWrapper<AgriDeskVerificationService> {

	public AgriDeskVerificationServiceWrapper() {
		this(null);
	}

	public AgriDeskVerificationServiceWrapper(
		AgriDeskVerificationService agriDeskVerificationService) {

		_agriDeskVerificationService = agriDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public AgriDeskVerificationService getWrappedService() {
		return _agriDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		AgriDeskVerificationService agriDeskVerificationService) {

		_agriDeskVerificationService = agriDeskVerificationService;
	}

	private AgriDeskVerificationService _agriDeskVerificationService;

}