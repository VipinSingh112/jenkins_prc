/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryMaterialInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationService
 * @generated
 */
public class QuarryMaterialInformationServiceWrapper
	implements QuarryMaterialInformationService,
			   ServiceWrapper<QuarryMaterialInformationService> {

	public QuarryMaterialInformationServiceWrapper() {
		this(null);
	}

	public QuarryMaterialInformationServiceWrapper(
		QuarryMaterialInformationService quarryMaterialInformationService) {

		_quarryMaterialInformationService = quarryMaterialInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryMaterialInformationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryMaterialInformationService getWrappedService() {
		return _quarryMaterialInformationService;
	}

	@Override
	public void setWrappedService(
		QuarryMaterialInformationService quarryMaterialInformationService) {

		_quarryMaterialInformationService = quarryMaterialInformationService;
	}

	private QuarryMaterialInformationService _quarryMaterialInformationService;

}