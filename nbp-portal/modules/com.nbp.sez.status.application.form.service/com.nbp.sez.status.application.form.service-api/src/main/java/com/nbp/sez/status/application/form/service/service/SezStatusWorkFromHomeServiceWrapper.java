/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusWorkFromHomeService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHomeService
 * @generated
 */
public class SezStatusWorkFromHomeServiceWrapper
	implements ServiceWrapper<SezStatusWorkFromHomeService>,
			   SezStatusWorkFromHomeService {

	public SezStatusWorkFromHomeServiceWrapper() {
		this(null);
	}

	public SezStatusWorkFromHomeServiceWrapper(
		SezStatusWorkFromHomeService sezStatusWorkFromHomeService) {

		_sezStatusWorkFromHomeService = sezStatusWorkFromHomeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWorkFromHomeService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusWorkFromHomeService getWrappedService() {
		return _sezStatusWorkFromHomeService;
	}

	@Override
	public void setWrappedService(
		SezStatusWorkFromHomeService sezStatusWorkFromHomeService) {

		_sezStatusWorkFromHomeService = sezStatusWorkFromHomeService;
	}

	private SezStatusWorkFromHomeService _sezStatusWorkFromHomeService;

}