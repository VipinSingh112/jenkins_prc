/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BlasterCompetencyFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyFormService
 * @generated
 */
public class BlasterCompetencyFormServiceWrapper
	implements BlasterCompetencyFormService,
			   ServiceWrapper<BlasterCompetencyFormService> {

	public BlasterCompetencyFormServiceWrapper() {
		this(null);
	}

	public BlasterCompetencyFormServiceWrapper(
		BlasterCompetencyFormService blasterCompetencyFormService) {

		_blasterCompetencyFormService = blasterCompetencyFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _blasterCompetencyFormService.getOSGiServiceIdentifier();
	}

	@Override
	public BlasterCompetencyFormService getWrappedService() {
		return _blasterCompetencyFormService;
	}

	@Override
	public void setWrappedService(
		BlasterCompetencyFormService blasterCompetencyFormService) {

		_blasterCompetencyFormService = blasterCompetencyFormService;
	}

	private BlasterCompetencyFormService _blasterCompetencyFormService;

}