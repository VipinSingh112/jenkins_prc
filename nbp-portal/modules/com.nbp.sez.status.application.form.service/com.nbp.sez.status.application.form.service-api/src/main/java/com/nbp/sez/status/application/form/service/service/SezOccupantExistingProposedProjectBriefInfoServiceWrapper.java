/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantExistingProposedProjectBriefInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfoService
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoServiceWrapper
	implements ServiceWrapper
		<SezOccupantExistingProposedProjectBriefInfoService>,
			   SezOccupantExistingProposedProjectBriefInfoService {

	public SezOccupantExistingProposedProjectBriefInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantExistingProposedProjectBriefInfoServiceWrapper(
		SezOccupantExistingProposedProjectBriefInfoService
			sezOccupantExistingProposedProjectBriefInfoService) {

		_sezOccupantExistingProposedProjectBriefInfoService =
			sezOccupantExistingProposedProjectBriefInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantExistingProposedProjectBriefInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantExistingProposedProjectBriefInfoService
		getWrappedService() {

		return _sezOccupantExistingProposedProjectBriefInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantExistingProposedProjectBriefInfoService
			sezOccupantExistingProposedProjectBriefInfoService) {

		_sezOccupantExistingProposedProjectBriefInfoService =
			sezOccupantExistingProposedProjectBriefInfoService;
	}

	private SezOccupantExistingProposedProjectBriefInfoService
		_sezOccupantExistingProposedProjectBriefInfoService;

}