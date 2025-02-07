/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualityProficiencyDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetailService
 * @generated
 */
public class QualityProficiencyDetailServiceWrapper
	implements QualityProficiencyDetailService,
			   ServiceWrapper<QualityProficiencyDetailService> {

	public QualityProficiencyDetailServiceWrapper() {
		this(null);
	}

	public QualityProficiencyDetailServiceWrapper(
		QualityProficiencyDetailService qualityProficiencyDetailService) {

		_qualityProficiencyDetailService = qualityProficiencyDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityProficiencyDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public QualityProficiencyDetailService getWrappedService() {
		return _qualityProficiencyDetailService;
	}

	@Override
	public void setWrappedService(
		QualityProficiencyDetailService qualityProficiencyDetailService) {

		_qualityProficiencyDetailService = qualityProficiencyDetailService;
	}

	private QualityProficiencyDetailService _qualityProficiencyDetailService;

}