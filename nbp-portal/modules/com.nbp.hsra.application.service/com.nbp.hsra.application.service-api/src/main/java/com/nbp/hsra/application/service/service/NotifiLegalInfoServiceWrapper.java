/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotifiLegalInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfoService
 * @generated
 */
public class NotifiLegalInfoServiceWrapper
	implements NotifiLegalInfoService, ServiceWrapper<NotifiLegalInfoService> {

	public NotifiLegalInfoServiceWrapper() {
		this(null);
	}

	public NotifiLegalInfoServiceWrapper(
		NotifiLegalInfoService notifiLegalInfoService) {

		_notifiLegalInfoService = notifiLegalInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _notifiLegalInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public NotifiLegalInfoService getWrappedService() {
		return _notifiLegalInfoService;
	}

	@Override
	public void setWrappedService(
		NotifiLegalInfoService notifiLegalInfoService) {

		_notifiLegalInfoService = notifiLegalInfoService;
	}

	private NotifiLegalInfoService _notifiLegalInfoService;

}