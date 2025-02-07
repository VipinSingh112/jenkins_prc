/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesService
 * @generated
 */
public class OsiApplicationStagesServiceWrapper
	implements OsiApplicationStagesService,
			   ServiceWrapper<OsiApplicationStagesService> {

	public OsiApplicationStagesServiceWrapper() {
		this(null);
	}

	public OsiApplicationStagesServiceWrapper(
		OsiApplicationStagesService osiApplicationStagesService) {

		_osiApplicationStagesService = osiApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiApplicationStagesService getWrappedService() {
		return _osiApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		OsiApplicationStagesService osiApplicationStagesService) {

		_osiApplicationStagesService = osiApplicationStagesService;
	}

	private OsiApplicationStagesService _osiApplicationStagesService;

}