/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GeneralDelarationsService}.
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarationsService
 * @generated
 */
public class GeneralDelarationsServiceWrapper
	implements GeneralDelarationsService,
			   ServiceWrapper<GeneralDelarationsService> {

	public GeneralDelarationsServiceWrapper() {
		this(null);
	}

	public GeneralDelarationsServiceWrapper(
		GeneralDelarationsService generalDelarationsService) {

		_generalDelarationsService = generalDelarationsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _generalDelarationsService.getOSGiServiceIdentifier();
	}

	@Override
	public GeneralDelarationsService getWrappedService() {
		return _generalDelarationsService;
	}

	@Override
	public void setWrappedService(
		GeneralDelarationsService generalDelarationsService) {

		_generalDelarationsService = generalDelarationsService;
	}

	private GeneralDelarationsService _generalDelarationsService;

}