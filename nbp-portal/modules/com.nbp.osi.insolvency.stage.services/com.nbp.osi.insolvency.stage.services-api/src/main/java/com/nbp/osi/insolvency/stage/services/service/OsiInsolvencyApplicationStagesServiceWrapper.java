/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationStagesService
 * @generated
 */
public class OsiInsolvencyApplicationStagesServiceWrapper
	implements OsiInsolvencyApplicationStagesService,
			   ServiceWrapper<OsiInsolvencyApplicationStagesService> {

	public OsiInsolvencyApplicationStagesServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationStagesServiceWrapper(
		OsiInsolvencyApplicationStagesService
			osiInsolvencyApplicationStagesService) {

		_osiInsolvencyApplicationStagesService =
			osiInsolvencyApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationStagesService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolvencyApplicationStagesService getWrappedService() {
		return _osiInsolvencyApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationStagesService
			osiInsolvencyApplicationStagesService) {

		_osiInsolvencyApplicationStagesService =
			osiInsolvencyApplicationStagesService;
	}

	private OsiInsolvencyApplicationStagesService
		_osiInsolvencyApplicationStagesService;

}