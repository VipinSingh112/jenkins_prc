/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSectionThreeService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThreeService
 * @generated
 */
public class NcbjSectionThreeServiceWrapper
	implements NcbjSectionThreeService,
			   ServiceWrapper<NcbjSectionThreeService> {

	public NcbjSectionThreeServiceWrapper() {
		this(null);
	}

	public NcbjSectionThreeServiceWrapper(
		NcbjSectionThreeService ncbjSectionThreeService) {

		_ncbjSectionThreeService = ncbjSectionThreeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionThreeService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSectionThreeService getWrappedService() {
		return _ncbjSectionThreeService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionThreeService ncbjSectionThreeService) {

		_ncbjSectionThreeService = ncbjSectionThreeService;
	}

	private NcbjSectionThreeService _ncbjSectionThreeService;

}