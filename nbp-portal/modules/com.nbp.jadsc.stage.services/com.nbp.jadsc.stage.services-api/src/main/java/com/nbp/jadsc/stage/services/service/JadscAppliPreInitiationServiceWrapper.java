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

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscAppliPreInitiationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreInitiationService
 * @generated
 */
public class JadscAppliPreInitiationServiceWrapper
	implements JadscAppliPreInitiationService,
			   ServiceWrapper<JadscAppliPreInitiationService> {

	public JadscAppliPreInitiationServiceWrapper() {
		this(null);
	}

	public JadscAppliPreInitiationServiceWrapper(
		JadscAppliPreInitiationService jadscAppliPreInitiationService) {

		_jadscAppliPreInitiationService = jadscAppliPreInitiationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliPreInitiationService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscAppliPreInitiationService getWrappedService() {
		return _jadscAppliPreInitiationService;
	}

	@Override
	public void setWrappedService(
		JadscAppliPreInitiationService jadscAppliPreInitiationService) {

		_jadscAppliPreInitiationService = jadscAppliPreInitiationService;
	}

	private JadscAppliPreInitiationService _jadscAppliPreInitiationService;

}