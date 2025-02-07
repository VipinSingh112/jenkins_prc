/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.module.service.Snapshot;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;

import java.util.List;

/**
 * Provides the remote service utility for CannabisApplicationStages. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesService
 * @generated
 */
public class CannabisApplicationStagesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static List<CannabisApplicationStages> getCannabisApplicationStages(
			String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStages(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static CannabisApplicationStages updateCannabisApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().updateCannabisApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static CannabisApplicationStagesService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationStagesService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationStagesServiceUtil.class,
			CannabisApplicationStagesService.class);

}