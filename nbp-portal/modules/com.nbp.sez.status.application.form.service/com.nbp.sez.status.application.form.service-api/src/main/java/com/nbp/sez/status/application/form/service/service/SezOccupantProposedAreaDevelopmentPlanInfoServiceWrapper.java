/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantProposedAreaDevelopmentPlanInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfoService
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoServiceWrapper
	implements ServiceWrapper
		<SezOccupantProposedAreaDevelopmentPlanInfoService>,
			   SezOccupantProposedAreaDevelopmentPlanInfoService {

	public SezOccupantProposedAreaDevelopmentPlanInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantProposedAreaDevelopmentPlanInfoServiceWrapper(
		SezOccupantProposedAreaDevelopmentPlanInfoService
			sezOccupantProposedAreaDevelopmentPlanInfoService) {

		_sezOccupantProposedAreaDevelopmentPlanInfoService =
			sezOccupantProposedAreaDevelopmentPlanInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantProposedAreaDevelopmentPlanInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfoService
		getWrappedService() {

		return _sezOccupantProposedAreaDevelopmentPlanInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantProposedAreaDevelopmentPlanInfoService
			sezOccupantProposedAreaDevelopmentPlanInfoService) {

		_sezOccupantProposedAreaDevelopmentPlanInfoService =
			sezOccupantProposedAreaDevelopmentPlanInfoService;
	}

	private SezOccupantProposedAreaDevelopmentPlanInfoService
		_sezOccupantProposedAreaDevelopmentPlanInfoService;

}