/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionDetailAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddService
 * @generated
 */
public class NcbjSectionDetailAddServiceWrapper
	implements NcbjSectionDetailAddService,
			   ServiceWrapper<NcbjSectionDetailAddService> {

	public NcbjSectionDetailAddServiceWrapper() {
		this(null);
	}

	public NcbjSectionDetailAddServiceWrapper(
		NcbjSectionDetailAddService ncbjSectionDetailAddService) {

		_ncbjSectionDetailAddService = ncbjSectionDetailAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionDetailAddService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionDetailAddService getWrappedService() {
		return _ncbjSectionDetailAddService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionDetailAddService ncbjSectionDetailAddService) {

		_ncbjSectionDetailAddService = ncbjSectionDetailAddService;
	}

	private NcbjSectionDetailAddService _ncbjSectionDetailAddService;

}