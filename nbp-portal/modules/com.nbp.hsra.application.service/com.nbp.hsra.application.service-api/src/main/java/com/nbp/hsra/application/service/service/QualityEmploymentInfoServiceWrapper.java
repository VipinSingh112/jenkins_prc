/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualityEmploymentInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfoService
 * @generated
 */
public class QualityEmploymentInfoServiceWrapper
	implements QualityEmploymentInfoService,
			   ServiceWrapper<QualityEmploymentInfoService> {

	public QualityEmploymentInfoServiceWrapper() {
		this(null);
	}

	public QualityEmploymentInfoServiceWrapper(
		QualityEmploymentInfoService qualityEmploymentInfoService) {

		_qualityEmploymentInfoService = qualityEmploymentInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityEmploymentInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public QualityEmploymentInfoService getWrappedService() {
		return _qualityEmploymentInfoService;
	}

	@Override
	public void setWrappedService(
		QualityEmploymentInfoService qualityEmploymentInfoService) {

		_qualityEmploymentInfoService = qualityEmploymentInfoService;
	}

	private QualityEmploymentInfoService _qualityEmploymentInfoService;

}