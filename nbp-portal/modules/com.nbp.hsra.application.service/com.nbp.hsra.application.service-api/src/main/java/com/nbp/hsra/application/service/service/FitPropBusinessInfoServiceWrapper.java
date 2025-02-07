/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FitPropBusinessInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfoService
 * @generated
 */
public class FitPropBusinessInfoServiceWrapper
	implements FitPropBusinessInfoService,
			   ServiceWrapper<FitPropBusinessInfoService> {

	public FitPropBusinessInfoServiceWrapper() {
		this(null);
	}

	public FitPropBusinessInfoServiceWrapper(
		FitPropBusinessInfoService fitPropBusinessInfoService) {

		_fitPropBusinessInfoService = fitPropBusinessInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropBusinessInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FitPropBusinessInfoService getWrappedService() {
		return _fitPropBusinessInfoService;
	}

	@Override
	public void setWrappedService(
		FitPropBusinessInfoService fitPropBusinessInfoService) {

		_fitPropBusinessInfoService = fitPropBusinessInfoService;
	}

	private FitPropBusinessInfoService _fitPropBusinessInfoService;

}