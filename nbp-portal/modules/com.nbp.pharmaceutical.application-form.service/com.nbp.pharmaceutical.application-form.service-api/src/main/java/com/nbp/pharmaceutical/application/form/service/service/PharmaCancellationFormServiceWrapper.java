/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaCancellationFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationFormService
 * @generated
 */
public class PharmaCancellationFormServiceWrapper
	implements PharmaCancellationFormService,
			   ServiceWrapper<PharmaCancellationFormService> {

	public PharmaCancellationFormServiceWrapper() {
		this(null);
	}

	public PharmaCancellationFormServiceWrapper(
		PharmaCancellationFormService pharmaCancellationFormService) {

		_pharmaCancellationFormService = pharmaCancellationFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaCancellationFormService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaCancellationFormService getWrappedService() {
		return _pharmaCancellationFormService;
	}

	@Override
	public void setWrappedService(
		PharmaCancellationFormService pharmaCancellationFormService) {

		_pharmaCancellationFormService = pharmaCancellationFormService;
	}

	private PharmaCancellationFormService _pharmaCancellationFormService;

}