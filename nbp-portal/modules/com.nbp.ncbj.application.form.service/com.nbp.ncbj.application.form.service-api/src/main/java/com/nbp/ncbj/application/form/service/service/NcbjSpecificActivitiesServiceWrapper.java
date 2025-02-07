/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjSpecificActivitiesService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivitiesService
 * @generated
 */
public class NcbjSpecificActivitiesServiceWrapper
	implements NcbjSpecificActivitiesService,
			   ServiceWrapper<NcbjSpecificActivitiesService> {

	public NcbjSpecificActivitiesServiceWrapper() {
		this(null);
	}

	public NcbjSpecificActivitiesServiceWrapper(
		NcbjSpecificActivitiesService ncbjSpecificActivitiesService) {

		_ncbjSpecificActivitiesService = ncbjSpecificActivitiesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSpecificActivitiesService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjSpecificActivitiesService getWrappedService() {
		return _ncbjSpecificActivitiesService;
	}

	@Override
	public void setWrappedService(
		NcbjSpecificActivitiesService ncbjSpecificActivitiesService) {

		_ncbjSpecificActivitiesService = ncbjSpecificActivitiesService;
	}

	private NcbjSpecificActivitiesService _ncbjSpecificActivitiesService;

}