/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezConsultancyInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionService
 * @generated
 */
public class SezConsultancyInspectionServiceWrapper
	implements ServiceWrapper<SezConsultancyInspectionService>,
			   SezConsultancyInspectionService {

	public SezConsultancyInspectionServiceWrapper() {
		this(null);
	}

	public SezConsultancyInspectionServiceWrapper(
		SezConsultancyInspectionService sezConsultancyInspectionService) {

		_sezConsultancyInspectionService = sezConsultancyInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezConsultancyInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public SezConsultancyInspectionService getWrappedService() {
		return _sezConsultancyInspectionService;
	}

	@Override
	public void setWrappedService(
		SezConsultancyInspectionService sezConsultancyInspectionService) {

		_sezConsultancyInspectionService = sezConsultancyInspectionService;
	}

	private SezConsultancyInspectionService _sezConsultancyInspectionService;

}