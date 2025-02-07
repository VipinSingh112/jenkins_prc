/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeContactInfoAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxService
 * @generated
 */
public class CreativeContactInfoAddBoxServiceWrapper
	implements CreativeContactInfoAddBoxService,
			   ServiceWrapper<CreativeContactInfoAddBoxService> {

	public CreativeContactInfoAddBoxServiceWrapper() {
		this(null);
	}

	public CreativeContactInfoAddBoxServiceWrapper(
		CreativeContactInfoAddBoxService creativeContactInfoAddBoxService) {

		_creativeContactInfoAddBoxService = creativeContactInfoAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeContactInfoAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeContactInfoAddBoxService getWrappedService() {
		return _creativeContactInfoAddBoxService;
	}

	@Override
	public void setWrappedService(
		CreativeContactInfoAddBoxService creativeContactInfoAddBoxService) {

		_creativeContactInfoAddBoxService = creativeContactInfoAddBoxService;
	}

	private CreativeContactInfoAddBoxService _creativeContactInfoAddBoxService;

}