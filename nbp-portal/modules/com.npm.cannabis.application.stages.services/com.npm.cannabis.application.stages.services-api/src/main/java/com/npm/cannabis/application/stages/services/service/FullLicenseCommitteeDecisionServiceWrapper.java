/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FullLicenseCommitteeDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionService
 * @generated
 */
public class FullLicenseCommitteeDecisionServiceWrapper
	implements FullLicenseCommitteeDecisionService,
			   ServiceWrapper<FullLicenseCommitteeDecisionService> {

	public FullLicenseCommitteeDecisionServiceWrapper() {
		this(null);
	}

	public FullLicenseCommitteeDecisionServiceWrapper(
		FullLicenseCommitteeDecisionService
			fullLicenseCommitteeDecisionService) {

		_fullLicenseCommitteeDecisionService =
			fullLicenseCommitteeDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fullLicenseCommitteeDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public FullLicenseCommitteeDecisionService getWrappedService() {
		return _fullLicenseCommitteeDecisionService;
	}

	@Override
	public void setWrappedService(
		FullLicenseCommitteeDecisionService
			fullLicenseCommitteeDecisionService) {

		_fullLicenseCommitteeDecisionService =
			fullLicenseCommitteeDecisionService;
	}

	private FullLicenseCommitteeDecisionService
		_fullLicenseCommitteeDecisionService;

}