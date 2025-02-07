/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaDrugInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfoService
 * @generated
 */
public class PharmaDrugInfoServiceWrapper
	implements PharmaDrugInfoService, ServiceWrapper<PharmaDrugInfoService> {

	public PharmaDrugInfoServiceWrapper() {
		this(null);
	}

	public PharmaDrugInfoServiceWrapper(
		PharmaDrugInfoService pharmaDrugInfoService) {

		_pharmaDrugInfoService = pharmaDrugInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDrugInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaDrugInfoService getWrappedService() {
		return _pharmaDrugInfoService;
	}

	@Override
	public void setWrappedService(PharmaDrugInfoService pharmaDrugInfoService) {
		_pharmaDrugInfoService = pharmaDrugInfoService;
	}

	private PharmaDrugInfoService _pharmaDrugInfoService;

}