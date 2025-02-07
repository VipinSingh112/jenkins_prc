/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionGenDeclareInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoService
 * @generated
 */
public class AttractionGenDeclareInfoServiceWrapper
	implements AttractionGenDeclareInfoService,
			   ServiceWrapper<AttractionGenDeclareInfoService> {

	public AttractionGenDeclareInfoServiceWrapper() {
		this(null);
	}

	public AttractionGenDeclareInfoServiceWrapper(
		AttractionGenDeclareInfoService attractionGenDeclareInfoService) {

		_attractionGenDeclareInfoService = attractionGenDeclareInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionGenDeclareInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionGenDeclareInfoService getWrappedService() {
		return _attractionGenDeclareInfoService;
	}

	@Override
	public void setWrappedService(
		AttractionGenDeclareInfoService attractionGenDeclareInfoService) {

		_attractionGenDeclareInfoService = attractionGenDeclareInfoService;
	}

	private AttractionGenDeclareInfoService _attractionGenDeclareInfoService;

}