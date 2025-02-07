/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryInformaationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaationService
 * @generated
 */
public class QuarryInformaationServiceWrapper
	implements QuarryInformaationService,
			   ServiceWrapper<QuarryInformaationService> {

	public QuarryInformaationServiceWrapper() {
		this(null);
	}

	public QuarryInformaationServiceWrapper(
		QuarryInformaationService quarryInformaationService) {

		_quarryInformaationService = quarryInformaationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryInformaationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryInformaationService getWrappedService() {
		return _quarryInformaationService;
	}

	@Override
	public void setWrappedService(
		QuarryInformaationService quarryInformaationService) {

		_quarryInformaationService = quarryInformaationService;
	}

	private QuarryInformaationService _quarryInformaationService;

}