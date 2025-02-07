/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryGeneralInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformationService
 * @generated
 */
public class QuarryGeneralInformationServiceWrapper
	implements QuarryGeneralInformationService,
			   ServiceWrapper<QuarryGeneralInformationService> {

	public QuarryGeneralInformationServiceWrapper() {
		this(null);
	}

	public QuarryGeneralInformationServiceWrapper(
		QuarryGeneralInformationService quarryGeneralInformationService) {

		_quarryGeneralInformationService = quarryGeneralInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryGeneralInformationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryGeneralInformationService getWrappedService() {
		return _quarryGeneralInformationService;
	}

	@Override
	public void setWrappedService(
		QuarryGeneralInformationService quarryGeneralInformationService) {

		_quarryGeneralInformationService = quarryGeneralInformationService;
	}

	private QuarryGeneralInformationService _quarryGeneralInformationService;

}