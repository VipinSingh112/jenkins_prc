/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.module.service.Snapshot;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;

/**
 * Provides the remote service utility for OsiServicesTrusteeCompanyinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeCompanyinfoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoService
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeCompanyinfoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OsiServicesTrusteeCompanyinfo
			getOsiServicesTrusteeCompanyinfoById(long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeCompanyinfoException {

		return getService().getOsiServicesTrusteeCompanyinfoById(applicationId);
	}

	public static OsiServicesTrusteeCompanyinfoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServicesTrusteeCompanyinfoService>
		_serviceSnapshot = new Snapshot<>(
			OsiServicesTrusteeCompanyinfoServiceUtil.class,
			OsiServicesTrusteeCompanyinfoService.class);

}