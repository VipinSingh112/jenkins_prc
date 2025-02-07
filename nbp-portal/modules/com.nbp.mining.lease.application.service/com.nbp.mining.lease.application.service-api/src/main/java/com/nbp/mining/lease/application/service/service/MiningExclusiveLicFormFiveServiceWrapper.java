/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningExclusiveLicFormFiveService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFiveService
 * @generated
 */
public class MiningExclusiveLicFormFiveServiceWrapper
	implements MiningExclusiveLicFormFiveService,
			   ServiceWrapper<MiningExclusiveLicFormFiveService> {

	public MiningExclusiveLicFormFiveServiceWrapper() {
		this(null);
	}

	public MiningExclusiveLicFormFiveServiceWrapper(
		MiningExclusiveLicFormFiveService miningExclusiveLicFormFiveService) {

		_miningExclusiveLicFormFiveService = miningExclusiveLicFormFiveService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningExclusiveLicFormFiveService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningExclusiveLicFormFiveService getWrappedService() {
		return _miningExclusiveLicFormFiveService;
	}

	@Override
	public void setWrappedService(
		MiningExclusiveLicFormFiveService miningExclusiveLicFormFiveService) {

		_miningExclusiveLicFormFiveService = miningExclusiveLicFormFiveService;
	}

	private MiningExclusiveLicFormFiveService
		_miningExclusiveLicFormFiveService;

}