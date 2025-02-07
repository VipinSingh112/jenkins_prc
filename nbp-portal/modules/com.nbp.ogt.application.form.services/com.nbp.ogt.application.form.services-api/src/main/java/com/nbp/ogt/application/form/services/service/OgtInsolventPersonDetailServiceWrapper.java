/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtInsolventPersonDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailService
 * @generated
 */
public class OgtInsolventPersonDetailServiceWrapper
	implements OgtInsolventPersonDetailService,
			   ServiceWrapper<OgtInsolventPersonDetailService> {

	public OgtInsolventPersonDetailServiceWrapper() {
		this(null);
	}

	public OgtInsolventPersonDetailServiceWrapper(
		OgtInsolventPersonDetailService ogtInsolventPersonDetailService) {

		_ogtInsolventPersonDetailService = ogtInsolventPersonDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtInsolventPersonDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtInsolventPersonDetailService getWrappedService() {
		return _ogtInsolventPersonDetailService;
	}

	@Override
	public void setWrappedService(
		OgtInsolventPersonDetailService ogtInsolventPersonDetailService) {

		_ogtInsolventPersonDetailService = ogtInsolventPersonDetailService;
	}

	private OgtInsolventPersonDetailService _ogtInsolventPersonDetailService;

}