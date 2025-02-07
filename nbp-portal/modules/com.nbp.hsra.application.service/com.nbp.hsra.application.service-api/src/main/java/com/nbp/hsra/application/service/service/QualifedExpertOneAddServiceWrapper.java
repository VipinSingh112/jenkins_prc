/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualifedExpertOneAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddService
 * @generated
 */
public class QualifedExpertOneAddServiceWrapper
	implements QualifedExpertOneAddService,
			   ServiceWrapper<QualifedExpertOneAddService> {

	public QualifedExpertOneAddServiceWrapper() {
		this(null);
	}

	public QualifedExpertOneAddServiceWrapper(
		QualifedExpertOneAddService qualifedExpertOneAddService) {

		_qualifedExpertOneAddService = qualifedExpertOneAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualifedExpertOneAddService.getOSGiServiceIdentifier();
	}

	@Override
	public QualifedExpertOneAddService getWrappedService() {
		return _qualifedExpertOneAddService;
	}

	@Override
	public void setWrappedService(
		QualifedExpertOneAddService qualifedExpertOneAddService) {

		_qualifedExpertOneAddService = qualifedExpertOneAddService;
	}

	private QualifedExpertOneAddService _qualifedExpertOneAddService;

}