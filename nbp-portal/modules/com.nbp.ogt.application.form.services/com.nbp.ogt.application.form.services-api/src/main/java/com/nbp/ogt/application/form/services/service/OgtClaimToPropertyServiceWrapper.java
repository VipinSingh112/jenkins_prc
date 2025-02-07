/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtClaimToPropertyService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToPropertyService
 * @generated
 */
public class OgtClaimToPropertyServiceWrapper
	implements OgtClaimToPropertyService,
			   ServiceWrapper<OgtClaimToPropertyService> {

	public OgtClaimToPropertyServiceWrapper() {
		this(null);
	}

	public OgtClaimToPropertyServiceWrapper(
		OgtClaimToPropertyService ogtClaimToPropertyService) {

		_ogtClaimToPropertyService = ogtClaimToPropertyService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimToPropertyService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtClaimToPropertyService getWrappedService() {
		return _ogtClaimToPropertyService;
	}

	@Override
	public void setWrappedService(
		OgtClaimToPropertyService ogtClaimToPropertyService) {

		_ogtClaimToPropertyService = ogtClaimToPropertyService;
	}

	private OgtClaimToPropertyService _ogtClaimToPropertyService;

}