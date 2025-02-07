/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotUsedSecurityService}.
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurityService
 * @generated
 */
public class NotUsedSecurityServiceWrapper
	implements NotUsedSecurityService, ServiceWrapper<NotUsedSecurityService> {

	public NotUsedSecurityServiceWrapper() {
		this(null);
	}

	public NotUsedSecurityServiceWrapper(
		NotUsedSecurityService notUsedSecurityService) {

		_notUsedSecurityService = notUsedSecurityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _notUsedSecurityService.getOSGiServiceIdentifier();
	}

	@Override
	public NotUsedSecurityService getWrappedService() {
		return _notUsedSecurityService;
	}

	@Override
	public void setWrappedService(
		NotUsedSecurityService notUsedSecurityService) {

		_notUsedSecurityService = notUsedSecurityService;
	}

	private NotUsedSecurityService _notUsedSecurityService;

}