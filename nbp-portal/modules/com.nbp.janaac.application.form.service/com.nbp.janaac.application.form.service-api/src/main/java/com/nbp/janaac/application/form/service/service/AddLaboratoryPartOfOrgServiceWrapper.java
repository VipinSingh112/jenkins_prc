/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLaboratoryPartOfOrgService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrgService
 * @generated
 */
public class AddLaboratoryPartOfOrgServiceWrapper
	implements AddLaboratoryPartOfOrgService,
			   ServiceWrapper<AddLaboratoryPartOfOrgService> {

	public AddLaboratoryPartOfOrgServiceWrapper() {
		this(null);
	}

	public AddLaboratoryPartOfOrgServiceWrapper(
		AddLaboratoryPartOfOrgService addLaboratoryPartOfOrgService) {

		_addLaboratoryPartOfOrgService = addLaboratoryPartOfOrgService;
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg>
			getJanaacByAppId(long janaacApplicationId) {

		return _addLaboratoryPartOfOrgService.getJanaacByAppId(
			janaacApplicationId);
	}

	@Override
	public AddLaboratoryPartOfOrgService getWrappedService() {
		return _addLaboratoryPartOfOrgService;
	}

	@Override
	public void setWrappedService(
		AddLaboratoryPartOfOrgService addLaboratoryPartOfOrgService) {

		_addLaboratoryPartOfOrgService = addLaboratoryPartOfOrgService;
	}

	private AddLaboratoryPartOfOrgService _addLaboratoryPartOfOrgService;

}