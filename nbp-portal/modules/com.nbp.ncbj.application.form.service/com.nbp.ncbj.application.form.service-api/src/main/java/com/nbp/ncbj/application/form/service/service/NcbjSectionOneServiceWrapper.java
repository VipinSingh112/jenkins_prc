/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionOneService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneService
 * @generated
 */
public class NcbjSectionOneServiceWrapper
	implements NcbjSectionOneService, ServiceWrapper<NcbjSectionOneService> {

	public NcbjSectionOneServiceWrapper() {
		this(null);
	}

	public NcbjSectionOneServiceWrapper(
		NcbjSectionOneService ncbjSectionOneService) {

		_ncbjSectionOneService = ncbjSectionOneService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionOneService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionOneService getWrappedService() {
		return _ncbjSectionOneService;
	}

	@Override
	public void setWrappedService(NcbjSectionOneService ncbjSectionOneService) {
		_ncbjSectionOneService = ncbjSectionOneService;
	}

	private NcbjSectionOneService _ncbjSectionOneService;

}