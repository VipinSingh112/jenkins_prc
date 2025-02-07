/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesService
 * @generated
 */
public class PharmaApplicationStagesServiceWrapper
	implements PharmaApplicationStagesService,
			   ServiceWrapper<PharmaApplicationStagesService> {

	public PharmaApplicationStagesServiceWrapper() {
		this(null);
	}

	public PharmaApplicationStagesServiceWrapper(
		PharmaApplicationStagesService pharmaApplicationStagesService) {

		_pharmaApplicationStagesService = pharmaApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationStagesService getWrappedService() {
		return _pharmaApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationStagesService pharmaApplicationStagesService) {

		_pharmaApplicationStagesService = pharmaApplicationStagesService;
	}

	private PharmaApplicationStagesService _pharmaApplicationStagesService;

}