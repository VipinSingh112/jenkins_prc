/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabTestStructuralReqSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabTestStructuralReqSecService
 * @generated
 */
public class AddLabTestStructuralReqSecServiceWrapper
	implements AddLabTestStructuralReqSecService,
			   ServiceWrapper<AddLabTestStructuralReqSecService> {

	public AddLabTestStructuralReqSecServiceWrapper() {
		this(null);
	}

	public AddLabTestStructuralReqSecServiceWrapper(
		AddLabTestStructuralReqSecService addLabTestStructuralReqSecService) {

		_addLabTestStructuralReqSecService = addLabTestStructuralReqSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabTestStructuralReqSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabTestStructuralReqSecService getWrappedService() {
		return _addLabTestStructuralReqSecService;
	}

	@Override
	public void setWrappedService(
		AddLabTestStructuralReqSecService addLabTestStructuralReqSecService) {

		_addLabTestStructuralReqSecService = addLabTestStructuralReqSecService;
	}

	private AddLabTestStructuralReqSecService
		_addLabTestStructuralReqSecService;

}