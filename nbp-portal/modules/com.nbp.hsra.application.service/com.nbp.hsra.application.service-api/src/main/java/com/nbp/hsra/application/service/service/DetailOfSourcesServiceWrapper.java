/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DetailOfSourcesService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSourcesService
 * @generated
 */
public class DetailOfSourcesServiceWrapper
	implements DetailOfSourcesService, ServiceWrapper<DetailOfSourcesService> {

	public DetailOfSourcesServiceWrapper() {
		this(null);
	}

	public DetailOfSourcesServiceWrapper(
		DetailOfSourcesService detailOfSourcesService) {

		_detailOfSourcesService = detailOfSourcesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfSourcesService.getOSGiServiceIdentifier();
	}

	@Override
	public DetailOfSourcesService getWrappedService() {
		return _detailOfSourcesService;
	}

	@Override
	public void setWrappedService(
		DetailOfSourcesService detailOfSourcesService) {

		_detailOfSourcesService = detailOfSourcesService;
	}

	private DetailOfSourcesService _detailOfSourcesService;

}