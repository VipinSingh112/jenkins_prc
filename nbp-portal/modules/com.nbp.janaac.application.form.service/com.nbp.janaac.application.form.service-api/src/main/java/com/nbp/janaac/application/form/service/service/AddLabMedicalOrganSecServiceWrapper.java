/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabMedicalOrganSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSecService
 * @generated
 */
public class AddLabMedicalOrganSecServiceWrapper
	implements AddLabMedicalOrganSecService,
			   ServiceWrapper<AddLabMedicalOrganSecService> {

	public AddLabMedicalOrganSecServiceWrapper() {
		this(null);
	}

	public AddLabMedicalOrganSecServiceWrapper(
		AddLabMedicalOrganSecService addLabMedicalOrganSecService) {

		_addLabMedicalOrganSecService = addLabMedicalOrganSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalOrganSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabMedicalOrganSecService getWrappedService() {
		return _addLabMedicalOrganSecService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalOrganSecService addLabMedicalOrganSecService) {

		_addLabMedicalOrganSecService = addLabMedicalOrganSecService;
	}

	private AddLabMedicalOrganSecService _addLabMedicalOrganSecService;

}