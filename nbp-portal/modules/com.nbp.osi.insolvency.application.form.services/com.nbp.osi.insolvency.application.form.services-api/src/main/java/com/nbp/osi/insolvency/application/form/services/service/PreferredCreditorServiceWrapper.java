/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PreferredCreditorService}.
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditorService
 * @generated
 */
public class PreferredCreditorServiceWrapper
	implements PreferredCreditorService,
			   ServiceWrapper<PreferredCreditorService> {

	public PreferredCreditorServiceWrapper() {
		this(null);
	}

	public PreferredCreditorServiceWrapper(
		PreferredCreditorService preferredCreditorService) {

		_preferredCreditorService = preferredCreditorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _preferredCreditorService.getOSGiServiceIdentifier();
	}

	@Override
	public PreferredCreditorService getWrappedService() {
		return _preferredCreditorService;
	}

	@Override
	public void setWrappedService(
		PreferredCreditorService preferredCreditorService) {

		_preferredCreditorService = preferredCreditorService;
	}

	private PreferredCreditorService _preferredCreditorService;

}