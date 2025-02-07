/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.module.service.Snapshot;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import java.util.List;

/**
 * Provides the remote service utility for ManufacturingApplicationStages. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingApplicationStagesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesService
 * @generated
 */
public class ManufacturingApplicationStagesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingApplicationStagesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static List<ManufacturingApplicationStages>
		getManufacturingApplicationStagesBy_StageName(String stageName) {

		return getService().getManufacturingApplicationStagesBy_StageName(
			stageName);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ManufacturingApplicationStagesService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManufacturingApplicationStagesService>
		_serviceSnapshot = new Snapshot<>(
			ManufacturingApplicationStagesServiceUtil.class,
			ManufacturingApplicationStagesService.class);

}