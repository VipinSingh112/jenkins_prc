/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualityApplicantDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetailService
 * @generated
 */
public class QualityApplicantDetailServiceWrapper
	implements QualityApplicantDetailService,
			   ServiceWrapper<QualityApplicantDetailService> {

	public QualityApplicantDetailServiceWrapper() {
		this(null);
	}

	public QualityApplicantDetailServiceWrapper(
		QualityApplicantDetailService qualityApplicantDetailService) {

		_qualityApplicantDetailService = qualityApplicantDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityApplicantDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public QualityApplicantDetailService getWrappedService() {
		return _qualityApplicantDetailService;
	}

	@Override
	public void setWrappedService(
		QualityApplicantDetailService qualityApplicantDetailService) {

		_qualityApplicantDetailService = qualityApplicantDetailService;
	}

	private QualityApplicantDetailService _qualityApplicantDetailService;

}