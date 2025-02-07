/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SealedSourcesAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAddService
 * @generated
 */
public class SealedSourcesAddServiceWrapper
	implements SealedSourcesAddService,
			   ServiceWrapper<SealedSourcesAddService> {

	public SealedSourcesAddServiceWrapper() {
		this(null);
	}

	public SealedSourcesAddServiceWrapper(
		SealedSourcesAddService sealedSourcesAddService) {

		_sealedSourcesAddService = sealedSourcesAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sealedSourcesAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SealedSourcesAddService getWrappedService() {
		return _sealedSourcesAddService;
	}

	@Override
	public void setWrappedService(
		SealedSourcesAddService sealedSourcesAddService) {

		_sealedSourcesAddService = sealedSourcesAddService;
	}

	private SealedSourcesAddService _sealedSourcesAddService;

}