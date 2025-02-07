/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesService
 * @generated
 */
public class NcbjApplicationStagesServiceWrapper
	implements NcbjApplicationStagesService,
			   ServiceWrapper<NcbjApplicationStagesService> {

	public NcbjApplicationStagesServiceWrapper() {
		this(null);
	}

	public NcbjApplicationStagesServiceWrapper(
		NcbjApplicationStagesService ncbjApplicationStagesService) {

		_ncbjApplicationStagesService = ncbjApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjApplicationStagesService getWrappedService() {
		return _ncbjApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationStagesService ncbjApplicationStagesService) {

		_ncbjApplicationStagesService = ncbjApplicationStagesService;
	}

	private NcbjApplicationStagesService _ncbjApplicationStagesService;

}