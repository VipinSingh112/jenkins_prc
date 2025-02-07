/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiComTotalLiabilityService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiabilityService
 * @generated
 */
public class OsiComTotalLiabilityServiceWrapper
	implements OsiComTotalLiabilityService,
			   ServiceWrapper<OsiComTotalLiabilityService> {

	public OsiComTotalLiabilityServiceWrapper() {
		this(null);
	}

	public OsiComTotalLiabilityServiceWrapper(
		OsiComTotalLiabilityService osiComTotalLiabilityService) {

		_osiComTotalLiabilityService = osiComTotalLiabilityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiComTotalLiabilityService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiComTotalLiabilityService getWrappedService() {
		return _osiComTotalLiabilityService;
	}

	@Override
	public void setWrappedService(
		OsiComTotalLiabilityService osiComTotalLiabilityService) {

		_osiComTotalLiabilityService = osiComTotalLiabilityService;
	}

	private OsiComTotalLiabilityService _osiComTotalLiabilityService;

}