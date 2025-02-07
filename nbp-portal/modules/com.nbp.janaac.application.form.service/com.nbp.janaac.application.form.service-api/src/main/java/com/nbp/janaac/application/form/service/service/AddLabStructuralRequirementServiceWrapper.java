/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabStructuralRequirementService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirementService
 * @generated
 */
public class AddLabStructuralRequirementServiceWrapper
	implements AddLabStructuralRequirementService,
			   ServiceWrapper<AddLabStructuralRequirementService> {

	public AddLabStructuralRequirementServiceWrapper() {
		this(null);
	}

	public AddLabStructuralRequirementServiceWrapper(
		AddLabStructuralRequirementService addLabStructuralRequirementService) {

		_addLabStructuralRequirementService =
			addLabStructuralRequirementService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabStructuralRequirementService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabStructuralRequirementService getWrappedService() {
		return _addLabStructuralRequirementService;
	}

	@Override
	public void setWrappedService(
		AddLabStructuralRequirementService addLabStructuralRequirementService) {

		_addLabStructuralRequirementService =
			addLabStructuralRequirementService;
	}

	private AddLabStructuralRequirementService
		_addLabStructuralRequirementService;

}