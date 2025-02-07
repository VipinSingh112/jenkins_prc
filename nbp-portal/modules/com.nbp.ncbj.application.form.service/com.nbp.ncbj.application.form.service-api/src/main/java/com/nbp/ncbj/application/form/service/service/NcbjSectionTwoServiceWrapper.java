/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionTwoService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionTwoService
 * @generated
 */
public class NcbjSectionTwoServiceWrapper
	implements NcbjSectionTwoService, ServiceWrapper<NcbjSectionTwoService> {

	public NcbjSectionTwoServiceWrapper() {
		this(null);
	}

	public NcbjSectionTwoServiceWrapper(
		NcbjSectionTwoService ncbjSectionTwoService) {

		_ncbjSectionTwoService = ncbjSectionTwoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionTwoService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionTwoService getWrappedService() {
		return _ncbjSectionTwoService;
	}

	@Override
	public void setWrappedService(NcbjSectionTwoService ncbjSectionTwoService) {
		_ncbjSectionTwoService = ncbjSectionTwoService;
	}

	private NcbjSectionTwoService _ncbjSectionTwoService;

}