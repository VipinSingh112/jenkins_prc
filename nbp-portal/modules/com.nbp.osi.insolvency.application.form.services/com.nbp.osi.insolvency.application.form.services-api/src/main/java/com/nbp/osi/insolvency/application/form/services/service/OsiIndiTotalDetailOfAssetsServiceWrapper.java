/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiIndiTotalDetailOfAssetsService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssetsService
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsServiceWrapper
	implements OsiIndiTotalDetailOfAssetsService,
			   ServiceWrapper<OsiIndiTotalDetailOfAssetsService> {

	public OsiIndiTotalDetailOfAssetsServiceWrapper() {
		this(null);
	}

	public OsiIndiTotalDetailOfAssetsServiceWrapper(
		OsiIndiTotalDetailOfAssetsService osiIndiTotalDetailOfAssetsService) {

		_osiIndiTotalDetailOfAssetsService = osiIndiTotalDetailOfAssetsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiIndiTotalDetailOfAssetsService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiIndiTotalDetailOfAssetsService getWrappedService() {
		return _osiIndiTotalDetailOfAssetsService;
	}

	@Override
	public void setWrappedService(
		OsiIndiTotalDetailOfAssetsService osiIndiTotalDetailOfAssetsService) {

		_osiIndiTotalDetailOfAssetsService = osiIndiTotalDetailOfAssetsService;
	}

	private OsiIndiTotalDetailOfAssetsService
		_osiIndiTotalDetailOfAssetsService;

}