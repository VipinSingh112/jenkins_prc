/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UnsecuredCreditorService}.
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditorService
 * @generated
 */
public class UnsecuredCreditorServiceWrapper
	implements ServiceWrapper<UnsecuredCreditorService>,
			   UnsecuredCreditorService {

	public UnsecuredCreditorServiceWrapper() {
		this(null);
	}

	public UnsecuredCreditorServiceWrapper(
		UnsecuredCreditorService unsecuredCreditorService) {

		_unsecuredCreditorService = unsecuredCreditorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _unsecuredCreditorService.getOSGiServiceIdentifier();
	}

	@Override
	public UnsecuredCreditorService getWrappedService() {
		return _unsecuredCreditorService;
	}

	@Override
	public void setWrappedService(
		UnsecuredCreditorService unsecuredCreditorService) {

		_unsecuredCreditorService = unsecuredCreditorService;
	}

	private UnsecuredCreditorService _unsecuredCreditorService;

}