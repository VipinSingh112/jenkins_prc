/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeDirectorListinAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBoxService
 * @generated
 */
public class CreativeDirectorListinAddBoxServiceWrapper
	implements CreativeDirectorListinAddBoxService,
			   ServiceWrapper<CreativeDirectorListinAddBoxService> {

	public CreativeDirectorListinAddBoxServiceWrapper() {
		this(null);
	}

	public CreativeDirectorListinAddBoxServiceWrapper(
		CreativeDirectorListinAddBoxService
			creativeDirectorListinAddBoxService) {

		_creativeDirectorListinAddBoxService =
			creativeDirectorListinAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeDirectorListinAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeDirectorListinAddBoxService getWrappedService() {
		return _creativeDirectorListinAddBoxService;
	}

	@Override
	public void setWrappedService(
		CreativeDirectorListinAddBoxService
			creativeDirectorListinAddBoxService) {

		_creativeDirectorListinAddBoxService =
			creativeDirectorListinAddBoxService;
	}

	private CreativeDirectorListinAddBoxService
		_creativeDirectorListinAddBoxService;

}