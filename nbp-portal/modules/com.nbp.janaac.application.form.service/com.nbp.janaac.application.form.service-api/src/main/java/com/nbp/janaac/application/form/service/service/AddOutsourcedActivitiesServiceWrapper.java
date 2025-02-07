/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddOutsourcedActivitiesService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivitiesService
 * @generated
 */
public class AddOutsourcedActivitiesServiceWrapper
	implements AddOutsourcedActivitiesService,
			   ServiceWrapper<AddOutsourcedActivitiesService> {

	public AddOutsourcedActivitiesServiceWrapper() {
		this(null);
	}

	public AddOutsourcedActivitiesServiceWrapper(
		AddOutsourcedActivitiesService addOutsourcedActivitiesService) {

		_addOutsourcedActivitiesService = addOutsourcedActivitiesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addOutsourcedActivitiesService.getOSGiServiceIdentifier();
	}

	@Override
	public AddOutsourcedActivitiesService getWrappedService() {
		return _addOutsourcedActivitiesService;
	}

	@Override
	public void setWrappedService(
		AddOutsourcedActivitiesService addOutsourcedActivitiesService) {

		_addOutsourcedActivitiesService = addOutsourcedActivitiesService;
	}

	private AddOutsourcedActivitiesService _addOutsourcedActivitiesService;

}