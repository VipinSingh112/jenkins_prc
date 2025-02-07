/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SourcesDetailAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddService
 * @generated
 */
public class SourcesDetailAddServiceWrapper
	implements ServiceWrapper<SourcesDetailAddService>,
			   SourcesDetailAddService {

	public SourcesDetailAddServiceWrapper() {
		this(null);
	}

	public SourcesDetailAddServiceWrapper(
		SourcesDetailAddService sourcesDetailAddService) {

		_sourcesDetailAddService = sourcesDetailAddService;
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SourcesDetailAdd> getHsraById(
			long hsraApplicationId) {

		return _sourcesDetailAddService.getHsraById(hsraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sourcesDetailAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SourcesDetailAddService getWrappedService() {
		return _sourcesDetailAddService;
	}

	@Override
	public void setWrappedService(
		SourcesDetailAddService sourcesDetailAddService) {

		_sourcesDetailAddService = sourcesDetailAddService;
	}

	private SourcesDetailAddService _sourcesDetailAddService;

}