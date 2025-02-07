/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneProposedProjectInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfoService
 * @generated
 */
public class SezZoneProposedProjectInfoServiceWrapper
	implements ServiceWrapper<SezZoneProposedProjectInfoService>,
			   SezZoneProposedProjectInfoService {

	public SezZoneProposedProjectInfoServiceWrapper() {
		this(null);
	}

	public SezZoneProposedProjectInfoServiceWrapper(
		SezZoneProposedProjectInfoService sezZoneProposedProjectInfoService) {

		_sezZoneProposedProjectInfoService = sezZoneProposedProjectInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneProposedProjectInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneProposedProjectInfoService getWrappedService() {
		return _sezZoneProposedProjectInfoService;
	}

	@Override
	public void setWrappedService(
		SezZoneProposedProjectInfoService sezZoneProposedProjectInfoService) {

		_sezZoneProposedProjectInfoService = sezZoneProposedProjectInfoService;
	}

	private SezZoneProposedProjectInfoService
		_sezZoneProposedProjectInfoService;

}