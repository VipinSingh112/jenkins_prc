/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationService
 * @generated
 */
public class OsiInsolvencyApplicationServiceWrapper
	implements OsiInsolvencyApplicationService,
			   ServiceWrapper<OsiInsolvencyApplicationService> {

	public OsiInsolvencyApplicationServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationServiceWrapper(
		OsiInsolvencyApplicationService osiInsolvencyApplicationService) {

		_osiInsolvencyApplicationService = osiInsolvencyApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolvencyApplicationService getWrappedService() {
		return _osiInsolvencyApplicationService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationService osiInsolvencyApplicationService) {

		_osiInsolvencyApplicationService = osiInsolvencyApplicationService;
	}

	private OsiInsolvencyApplicationService _osiInsolvencyApplicationService;

}