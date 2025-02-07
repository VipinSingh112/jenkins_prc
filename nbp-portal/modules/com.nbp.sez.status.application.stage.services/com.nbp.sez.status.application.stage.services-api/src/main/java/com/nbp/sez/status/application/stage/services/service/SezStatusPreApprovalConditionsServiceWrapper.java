/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusPreApprovalConditionsService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsService
 * @generated
 */
public class SezStatusPreApprovalConditionsServiceWrapper
	implements ServiceWrapper<SezStatusPreApprovalConditionsService>,
			   SezStatusPreApprovalConditionsService {

	public SezStatusPreApprovalConditionsServiceWrapper() {
		this(null);
	}

	public SezStatusPreApprovalConditionsServiceWrapper(
		SezStatusPreApprovalConditionsService
			sezStatusPreApprovalConditionsService) {

		_sezStatusPreApprovalConditionsService =
			sezStatusPreApprovalConditionsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusPreApprovalConditionsService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusPreApprovalConditionsService getWrappedService() {
		return _sezStatusPreApprovalConditionsService;
	}

	@Override
	public void setWrappedService(
		SezStatusPreApprovalConditionsService
			sezStatusPreApprovalConditionsService) {

		_sezStatusPreApprovalConditionsService =
			sezStatusPreApprovalConditionsService;
	}

	private SezStatusPreApprovalConditionsService
		_sezStatusPreApprovalConditionsService;

}