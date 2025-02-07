/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.module.service.Snapshot;

import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;

import java.util.List;

/**
 * Provides the remote service utility for AddLaboratoryPartOfOrg. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLaboratoryPartOfOrgServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrgService
 * @generated
 */
public class AddLaboratoryPartOfOrgServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLaboratoryPartOfOrgServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static List<AddLaboratoryPartOfOrg> getJanaacByAppId(
		long janaacApplicationId) {

		return getService().getJanaacByAppId(janaacApplicationId);
	}

	public static AddLaboratoryPartOfOrgService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLaboratoryPartOfOrgService>
		_serviceSnapshot = new Snapshot<>(
			AddLaboratoryPartOfOrgServiceUtil.class,
			AddLaboratoryPartOfOrgService.class);

}