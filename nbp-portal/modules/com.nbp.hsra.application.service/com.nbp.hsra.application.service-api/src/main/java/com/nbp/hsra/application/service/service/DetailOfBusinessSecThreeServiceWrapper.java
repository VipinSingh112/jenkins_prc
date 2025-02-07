/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DetailOfBusinessSecThreeService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreeService
 * @generated
 */
public class DetailOfBusinessSecThreeServiceWrapper
	implements DetailOfBusinessSecThreeService,
			   ServiceWrapper<DetailOfBusinessSecThreeService> {

	public DetailOfBusinessSecThreeServiceWrapper() {
		this(null);
	}

	public DetailOfBusinessSecThreeServiceWrapper(
		DetailOfBusinessSecThreeService detailOfBusinessSecThreeService) {

		_detailOfBusinessSecThreeService = detailOfBusinessSecThreeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfBusinessSecThreeService.getOSGiServiceIdentifier();
	}

	@Override
	public DetailOfBusinessSecThreeService getWrappedService() {
		return _detailOfBusinessSecThreeService;
	}

	@Override
	public void setWrappedService(
		DetailOfBusinessSecThreeService detailOfBusinessSecThreeService) {

		_detailOfBusinessSecThreeService = detailOfBusinessSecThreeService;
	}

	private DetailOfBusinessSecThreeService _detailOfBusinessSecThreeService;

}