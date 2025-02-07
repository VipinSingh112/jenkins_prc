/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabMedicalPhysicalSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSecService
 * @generated
 */
public class AddLabMedicalPhysicalSecServiceWrapper
	implements AddLabMedicalPhysicalSecService,
			   ServiceWrapper<AddLabMedicalPhysicalSecService> {

	public AddLabMedicalPhysicalSecServiceWrapper() {
		this(null);
	}

	public AddLabMedicalPhysicalSecServiceWrapper(
		AddLabMedicalPhysicalSecService addLabMedicalPhysicalSecService) {

		_addLabMedicalPhysicalSecService = addLabMedicalPhysicalSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalPhysicalSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabMedicalPhysicalSecService getWrappedService() {
		return _addLabMedicalPhysicalSecService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalPhysicalSecService addLabMedicalPhysicalSecService) {

		_addLabMedicalPhysicalSecService = addLabMedicalPhysicalSecService;
	}

	private AddLabMedicalPhysicalSecService _addLabMedicalPhysicalSecService;

}