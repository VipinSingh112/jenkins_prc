/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationService
 * @generated
 */
public class EntityInformationServiceWrapper
	implements EntityInformationService,
			   ServiceWrapper<EntityInformationService> {

	public EntityInformationServiceWrapper() {
		this(null);
	}

	public EntityInformationServiceWrapper(
		EntityInformationService entityInformationService) {

		_entityInformationService = entityInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entityInformationService.getOSGiServiceIdentifier();
	}

	@Override
	public EntityInformationService getWrappedService() {
		return _entityInformationService;
	}

	@Override
	public void setWrappedService(
		EntityInformationService entityInformationService) {

		_entityInformationService = entityInformationService;
	}

	private EntityInformationService _entityInformationService;

}