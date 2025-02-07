/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneEmpInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmpInfoService
 * @generated
 */
public class SezZoneEmpInfoServiceWrapper
	implements ServiceWrapper<SezZoneEmpInfoService>, SezZoneEmpInfoService {

	public SezZoneEmpInfoServiceWrapper() {
		this(null);
	}

	public SezZoneEmpInfoServiceWrapper(
		SezZoneEmpInfoService sezZoneEmpInfoService) {

		_sezZoneEmpInfoService = sezZoneEmpInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneEmpInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneEmpInfoService getWrappedService() {
		return _sezZoneEmpInfoService;
	}

	@Override
	public void setWrappedService(SezZoneEmpInfoService sezZoneEmpInfoService) {
		_sezZoneEmpInfoService = sezZoneEmpInfoService;
	}

	private SezZoneEmpInfoService _sezZoneEmpInfoService;

}