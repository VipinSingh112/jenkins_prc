/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.module.service.Snapshot;

import com.nbp.hsra.application.service.model.SourcesDetailAdd;

import java.util.List;

/**
 * Provides the remote service utility for SourcesDetailAdd. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.SourcesDetailAddServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddService
 * @generated
 */
public class SourcesDetailAddServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.SourcesDetailAddServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static List<SourcesDetailAdd> getHsraById(long hsraApplicationId) {
		return getService().getHsraById(hsraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static SourcesDetailAddService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SourcesDetailAddService> _serviceSnapshot =
		new Snapshot<>(
			SourcesDetailAddServiceUtil.class, SourcesDetailAddService.class);

}