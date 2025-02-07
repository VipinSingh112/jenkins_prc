/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManufacturingApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesService
 * @generated
 */
public class ManufacturingApplicationStagesServiceWrapper
	implements ManufacturingApplicationStagesService,
			   ServiceWrapper<ManufacturingApplicationStagesService> {

	public ManufacturingApplicationStagesServiceWrapper() {
		this(null);
	}

	public ManufacturingApplicationStagesServiceWrapper(
		ManufacturingApplicationStagesService
			manufacturingApplicationStagesService) {

		_manufacturingApplicationStagesService =
			manufacturingApplicationStagesService;
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingApplicationStages>
				getManufacturingApplicationStagesBy_StageName(
					String stageName) {

		return _manufacturingApplicationStagesService.
			getManufacturingApplicationStagesBy_StageName(stageName);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingApplicationStagesService.
			getOSGiServiceIdentifier();
	}

	@Override
	public ManufacturingApplicationStagesService getWrappedService() {
		return _manufacturingApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		ManufacturingApplicationStagesService
			manufacturingApplicationStagesService) {

		_manufacturingApplicationStagesService =
			manufacturingApplicationStagesService;
	}

	private ManufacturingApplicationStagesService
		_manufacturingApplicationStagesService;

}