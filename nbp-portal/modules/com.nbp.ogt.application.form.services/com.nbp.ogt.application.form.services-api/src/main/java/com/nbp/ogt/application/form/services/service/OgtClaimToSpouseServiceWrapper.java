/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtClaimToSpouseService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouseService
 * @generated
 */
public class OgtClaimToSpouseServiceWrapper
	implements OgtClaimToSpouseService,
			   ServiceWrapper<OgtClaimToSpouseService> {

	public OgtClaimToSpouseServiceWrapper() {
		this(null);
	}

	public OgtClaimToSpouseServiceWrapper(
		OgtClaimToSpouseService ogtClaimToSpouseService) {

		_ogtClaimToSpouseService = ogtClaimToSpouseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimToSpouseService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtClaimToSpouseService getWrappedService() {
		return _ogtClaimToSpouseService;
	}

	@Override
	public void setWrappedService(
		OgtClaimToSpouseService ogtClaimToSpouseService) {

		_ogtClaimToSpouseService = ogtClaimToSpouseService;
	}

	private OgtClaimToSpouseService _ogtClaimToSpouseService;

}