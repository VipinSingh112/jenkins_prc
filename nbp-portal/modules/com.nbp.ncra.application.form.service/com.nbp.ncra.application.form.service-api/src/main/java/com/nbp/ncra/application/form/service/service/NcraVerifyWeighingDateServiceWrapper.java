/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraVerifyWeighingDateService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDateService
 * @generated
 */
public class NcraVerifyWeighingDateServiceWrapper
	implements NcraVerifyWeighingDateService,
			   ServiceWrapper<NcraVerifyWeighingDateService> {

	public NcraVerifyWeighingDateServiceWrapper() {
		this(null);
	}

	public NcraVerifyWeighingDateServiceWrapper(
		NcraVerifyWeighingDateService ncraVerifyWeighingDateService) {

		_ncraVerifyWeighingDateService = ncraVerifyWeighingDateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraVerifyWeighingDateService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraVerifyWeighingDateService getWrappedService() {
		return _ncraVerifyWeighingDateService;
	}

	@Override
	public void setWrappedService(
		NcraVerifyWeighingDateService ncraVerifyWeighingDateService) {

		_ncraVerifyWeighingDateService = ncraVerifyWeighingDateService;
	}

	private NcraVerifyWeighingDateService _ncraVerifyWeighingDateService;

}