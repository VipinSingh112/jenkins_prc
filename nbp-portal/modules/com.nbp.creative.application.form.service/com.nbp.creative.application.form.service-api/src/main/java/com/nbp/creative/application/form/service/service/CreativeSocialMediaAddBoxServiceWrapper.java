/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeSocialMediaAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBoxService
 * @generated
 */
public class CreativeSocialMediaAddBoxServiceWrapper
	implements CreativeSocialMediaAddBoxService,
			   ServiceWrapper<CreativeSocialMediaAddBoxService> {

	public CreativeSocialMediaAddBoxServiceWrapper() {
		this(null);
	}

	public CreativeSocialMediaAddBoxServiceWrapper(
		CreativeSocialMediaAddBoxService creativeSocialMediaAddBoxService) {

		_creativeSocialMediaAddBoxService = creativeSocialMediaAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeSocialMediaAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeSocialMediaAddBoxService getWrappedService() {
		return _creativeSocialMediaAddBoxService;
	}

	@Override
	public void setWrappedService(
		CreativeSocialMediaAddBoxService creativeSocialMediaAddBoxService) {

		_creativeSocialMediaAddBoxService = creativeSocialMediaAddBoxService;
	}

	private CreativeSocialMediaAddBoxService _creativeSocialMediaAddBoxService;

}