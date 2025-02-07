/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionOneAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAddService
 * @generated
 */
public class NcbjSectionOneAddServiceWrapper
	implements NcbjSectionOneAddService,
			   ServiceWrapper<NcbjSectionOneAddService> {

	public NcbjSectionOneAddServiceWrapper() {
		this(null);
	}

	public NcbjSectionOneAddServiceWrapper(
		NcbjSectionOneAddService ncbjSectionOneAddService) {

		_ncbjSectionOneAddService = ncbjSectionOneAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionOneAddService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionOneAddService getWrappedService() {
		return _ncbjSectionOneAddService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionOneAddService ncbjSectionOneAddService) {

		_ncbjSectionOneAddService = ncbjSectionOneAddService;
	}

	private NcbjSectionOneAddService _ncbjSectionOneAddService;

}