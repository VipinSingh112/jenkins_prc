/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaRecallFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallFormService
 * @generated
 */
public class PharmaRecallFormServiceWrapper
	implements PharmaRecallFormService,
			   ServiceWrapper<PharmaRecallFormService> {

	public PharmaRecallFormServiceWrapper() {
		this(null);
	}

	public PharmaRecallFormServiceWrapper(
		PharmaRecallFormService pharmaRecallFormService) {

		_pharmaRecallFormService = pharmaRecallFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaRecallFormService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaRecallFormService getWrappedService() {
		return _pharmaRecallFormService;
	}

	@Override
	public void setWrappedService(
		PharmaRecallFormService pharmaRecallFormService) {

		_pharmaRecallFormService = pharmaRecallFormService;
	}

	private PharmaRecallFormService _pharmaRecallFormService;

}