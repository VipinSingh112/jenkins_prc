/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualityDeclarationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfoService
 * @generated
 */
public class QualityDeclarationInfoServiceWrapper
	implements QualityDeclarationInfoService,
			   ServiceWrapper<QualityDeclarationInfoService> {

	public QualityDeclarationInfoServiceWrapper() {
		this(null);
	}

	public QualityDeclarationInfoServiceWrapper(
		QualityDeclarationInfoService qualityDeclarationInfoService) {

		_qualityDeclarationInfoService = qualityDeclarationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityDeclarationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public QualityDeclarationInfoService getWrappedService() {
		return _qualityDeclarationInfoService;
	}

	@Override
	public void setWrappedService(
		QualityDeclarationInfoService qualityDeclarationInfoService) {

		_qualityDeclarationInfoService = qualityDeclarationInfoService;
	}

	private QualityDeclarationInfoService _qualityDeclarationInfoService;

}