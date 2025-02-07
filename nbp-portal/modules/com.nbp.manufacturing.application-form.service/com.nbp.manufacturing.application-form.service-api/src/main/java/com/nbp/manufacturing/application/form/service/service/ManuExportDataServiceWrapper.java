/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuExportDataService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportDataService
 * @generated
 */
public class ManuExportDataServiceWrapper
	implements ManuExportDataService, ServiceWrapper<ManuExportDataService> {

	public ManuExportDataServiceWrapper() {
		this(null);
	}

	public ManuExportDataServiceWrapper(
		ManuExportDataService manuExportDataService) {

		_manuExportDataService = manuExportDataService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuExportDataService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuExportDataService getWrappedService() {
		return _manuExportDataService;
	}

	@Override
	public void setWrappedService(ManuExportDataService manuExportDataService) {
		_manuExportDataService = manuExportDataService;
	}

	private ManuExportDataService _manuExportDataService;

}