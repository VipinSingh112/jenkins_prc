/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractDetailFormInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfoService
 * @generated
 */
public class AttractDetailFormInfoServiceWrapper
	implements AttractDetailFormInfoService,
			   ServiceWrapper<AttractDetailFormInfoService> {

	public AttractDetailFormInfoServiceWrapper() {
		this(null);
	}

	public AttractDetailFormInfoServiceWrapper(
		AttractDetailFormInfoService attractDetailFormInfoService) {

		_attractDetailFormInfoService = attractDetailFormInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractDetailFormInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractDetailFormInfoService getWrappedService() {
		return _attractDetailFormInfoService;
	}

	@Override
	public void setWrappedService(
		AttractDetailFormInfoService attractDetailFormInfoService) {

		_attractDetailFormInfoService = attractDetailFormInfoService;
	}

	private AttractDetailFormInfoService _attractDetailFormInfoService;

}