/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShareholdersHoldingsService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldingsService
 * @generated
 */
public class ShareholdersHoldingsServiceWrapper
	implements ServiceWrapper<ShareholdersHoldingsService>,
			   ShareholdersHoldingsService {

	public ShareholdersHoldingsServiceWrapper() {
		this(null);
	}

	public ShareholdersHoldingsServiceWrapper(
		ShareholdersHoldingsService shareholdersHoldingsService) {

		_shareholdersHoldingsService = shareholdersHoldingsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shareholdersHoldingsService.getOSGiServiceIdentifier();
	}

	@Override
	public ShareholdersHoldingsService getWrappedService() {
		return _shareholdersHoldingsService;
	}

	@Override
	public void setWrappedService(
		ShareholdersHoldingsService shareholdersHoldingsService) {

		_shareholdersHoldingsService = shareholdersHoldingsService;
	}

	private ShareholdersHoldingsService _shareholdersHoldingsService;

}