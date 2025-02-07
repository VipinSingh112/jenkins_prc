/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryApplicatntInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformationService
 * @generated
 */
public class QuarryApplicatntInformationServiceWrapper
	implements QuarryApplicatntInformationService,
			   ServiceWrapper<QuarryApplicatntInformationService> {

	public QuarryApplicatntInformationServiceWrapper() {
		this(null);
	}

	public QuarryApplicatntInformationServiceWrapper(
		QuarryApplicatntInformationService quarryApplicatntInformationService) {

		_quarryApplicatntInformationService =
			quarryApplicatntInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicatntInformationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryApplicatntInformationService getWrappedService() {
		return _quarryApplicatntInformationService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicatntInformationService quarryApplicatntInformationService) {

		_quarryApplicatntInformationService =
			quarryApplicatntInformationService;
	}

	private QuarryApplicatntInformationService
		_quarryApplicatntInformationService;

}