/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for AgricultureAquaculture. This utility wraps
 * <code>com.agriculture.application.form.service.service.impl.AgricultureAquacultureServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureService
 * @generated
 */
public class AgricultureAquacultureServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.agriculture.application.form.service.service.impl.AgricultureAquacultureServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AgricultureAquacultureService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureAquacultureService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureAquacultureServiceUtil.class,
			AgricultureAquacultureService.class);

}