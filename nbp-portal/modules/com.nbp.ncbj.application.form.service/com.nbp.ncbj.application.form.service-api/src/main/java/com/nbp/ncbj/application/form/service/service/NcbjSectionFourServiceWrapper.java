/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionFourService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourService
 * @generated
 */
public class NcbjSectionFourServiceWrapper
	implements NcbjSectionFourService, ServiceWrapper<NcbjSectionFourService> {

	public NcbjSectionFourServiceWrapper() {
		this(null);
	}

	public NcbjSectionFourServiceWrapper(
		NcbjSectionFourService ncbjSectionFourService) {

		_ncbjSectionFourService = ncbjSectionFourService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionFourService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionFourService getWrappedService() {
		return _ncbjSectionFourService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionFourService ncbjSectionFourService) {

		_ncbjSectionFourService = ncbjSectionFourService;
	}

	private NcbjSectionFourService _ncbjSectionFourService;

}