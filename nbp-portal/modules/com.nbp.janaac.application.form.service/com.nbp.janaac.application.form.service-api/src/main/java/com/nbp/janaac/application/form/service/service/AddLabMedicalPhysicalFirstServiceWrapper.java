/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabMedicalPhysicalFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalFirstService
 * @generated
 */
public class AddLabMedicalPhysicalFirstServiceWrapper
	implements AddLabMedicalPhysicalFirstService,
			   ServiceWrapper<AddLabMedicalPhysicalFirstService> {

	public AddLabMedicalPhysicalFirstServiceWrapper() {
		this(null);
	}

	public AddLabMedicalPhysicalFirstServiceWrapper(
		AddLabMedicalPhysicalFirstService addLabMedicalPhysicalFirstService) {

		_addLabMedicalPhysicalFirstService = addLabMedicalPhysicalFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalPhysicalFirstService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabMedicalPhysicalFirstService getWrappedService() {
		return _addLabMedicalPhysicalFirstService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalPhysicalFirstService addLabMedicalPhysicalFirstService) {

		_addLabMedicalPhysicalFirstService = addLabMedicalPhysicalFirstService;
	}

	private AddLabMedicalPhysicalFirstService
		_addLabMedicalPhysicalFirstService;

}