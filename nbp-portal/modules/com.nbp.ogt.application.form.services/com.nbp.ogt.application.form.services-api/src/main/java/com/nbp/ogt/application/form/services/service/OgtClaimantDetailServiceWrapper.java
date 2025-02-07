/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtClaimantDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetailService
 * @generated
 */
public class OgtClaimantDetailServiceWrapper
	implements OgtClaimantDetailService,
			   ServiceWrapper<OgtClaimantDetailService> {

	public OgtClaimantDetailServiceWrapper() {
		this(null);
	}

	public OgtClaimantDetailServiceWrapper(
		OgtClaimantDetailService ogtClaimantDetailService) {

		_ogtClaimantDetailService = ogtClaimantDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimantDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtClaimantDetailService getWrappedService() {
		return _ogtClaimantDetailService;
	}

	@Override
	public void setWrappedService(
		OgtClaimantDetailService ogtClaimantDetailService) {

		_ogtClaimantDetailService = ogtClaimantDetailService;
	}

	private OgtClaimantDetailService _ogtClaimantDetailService;

}