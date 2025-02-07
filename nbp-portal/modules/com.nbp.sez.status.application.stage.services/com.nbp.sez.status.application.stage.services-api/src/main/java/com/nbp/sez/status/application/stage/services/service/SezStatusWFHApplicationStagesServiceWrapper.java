/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusWFHApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesService
 * @generated
 */
public class SezStatusWFHApplicationStagesServiceWrapper
	implements ServiceWrapper<SezStatusWFHApplicationStagesService>,
			   SezStatusWFHApplicationStagesService {

	public SezStatusWFHApplicationStagesServiceWrapper() {
		this(null);
	}

	public SezStatusWFHApplicationStagesServiceWrapper(
		SezStatusWFHApplicationStagesService
			sezStatusWFHApplicationStagesService) {

		_sezStatusWFHApplicationStagesService =
			sezStatusWFHApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWFHApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusWFHApplicationStagesService getWrappedService() {
		return _sezStatusWFHApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		SezStatusWFHApplicationStagesService
			sezStatusWFHApplicationStagesService) {

		_sezStatusWFHApplicationStagesService =
			sezStatusWFHApplicationStagesService;
	}

	private SezStatusWFHApplicationStagesService
		_sezStatusWFHApplicationStagesService;

}