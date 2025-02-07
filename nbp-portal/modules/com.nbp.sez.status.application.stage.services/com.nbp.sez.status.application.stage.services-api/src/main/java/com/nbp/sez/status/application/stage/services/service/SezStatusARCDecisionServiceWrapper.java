/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusARCDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecisionService
 * @generated
 */
public class SezStatusARCDecisionServiceWrapper
	implements ServiceWrapper<SezStatusARCDecisionService>,
			   SezStatusARCDecisionService {

	public SezStatusARCDecisionServiceWrapper() {
		this(null);
	}

	public SezStatusARCDecisionServiceWrapper(
		SezStatusARCDecisionService sezStatusARCDecisionService) {

		_sezStatusARCDecisionService = sezStatusARCDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusARCDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusARCDecisionService getWrappedService() {
		return _sezStatusARCDecisionService;
	}

	@Override
	public void setWrappedService(
		SezStatusARCDecisionService sezStatusARCDecisionService) {

		_sezStatusARCDecisionService = sezStatusARCDecisionService;
	}

	private SezStatusARCDecisionService _sezStatusARCDecisionService;

}