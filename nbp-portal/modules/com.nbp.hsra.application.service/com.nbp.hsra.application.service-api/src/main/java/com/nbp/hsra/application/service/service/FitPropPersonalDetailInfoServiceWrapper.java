/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FitPropPersonalDetailInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfoService
 * @generated
 */
public class FitPropPersonalDetailInfoServiceWrapper
	implements FitPropPersonalDetailInfoService,
			   ServiceWrapper<FitPropPersonalDetailInfoService> {

	public FitPropPersonalDetailInfoServiceWrapper() {
		this(null);
	}

	public FitPropPersonalDetailInfoServiceWrapper(
		FitPropPersonalDetailInfoService fitPropPersonalDetailInfoService) {

		_fitPropPersonalDetailInfoService = fitPropPersonalDetailInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropPersonalDetailInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FitPropPersonalDetailInfoService getWrappedService() {
		return _fitPropPersonalDetailInfoService;
	}

	@Override
	public void setWrappedService(
		FitPropPersonalDetailInfoService fitPropPersonalDetailInfoService) {

		_fitPropPersonalDetailInfoService = fitPropPersonalDetailInfoService;
	}

	private FitPropPersonalDetailInfoService _fitPropPersonalDetailInfoService;

}