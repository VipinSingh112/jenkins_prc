/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabMedicalOrganFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganFirstService
 * @generated
 */
public class AddLabMedicalOrganFirstServiceWrapper
	implements AddLabMedicalOrganFirstService,
			   ServiceWrapper<AddLabMedicalOrganFirstService> {

	public AddLabMedicalOrganFirstServiceWrapper() {
		this(null);
	}

	public AddLabMedicalOrganFirstServiceWrapper(
		AddLabMedicalOrganFirstService addLabMedicalOrganFirstService) {

		_addLabMedicalOrganFirstService = addLabMedicalOrganFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalOrganFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabMedicalOrganFirstService getWrappedService() {
		return _addLabMedicalOrganFirstService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalOrganFirstService addLabMedicalOrganFirstService) {

		_addLabMedicalOrganFirstService = addLabMedicalOrganFirstService;
	}

	private AddLabMedicalOrganFirstService _addLabMedicalOrganFirstService;

}