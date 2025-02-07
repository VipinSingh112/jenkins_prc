/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualifedExpertAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAddService
 * @generated
 */
public class QualifedExpertAddServiceWrapper
	implements QualifedExpertAddService,
			   ServiceWrapper<QualifedExpertAddService> {

	public QualifedExpertAddServiceWrapper() {
		this(null);
	}

	public QualifedExpertAddServiceWrapper(
		QualifedExpertAddService qualifedExpertAddService) {

		_qualifedExpertAddService = qualifedExpertAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualifedExpertAddService.getOSGiServiceIdentifier();
	}

	@Override
	public QualifedExpertAddService getWrappedService() {
		return _qualifedExpertAddService;
	}

	@Override
	public void setWrappedService(
		QualifedExpertAddService qualifedExpertAddService) {

		_qualifedExpertAddService = qualifedExpertAddService;
	}

	private QualifedExpertAddService _qualifedExpertAddService;

}