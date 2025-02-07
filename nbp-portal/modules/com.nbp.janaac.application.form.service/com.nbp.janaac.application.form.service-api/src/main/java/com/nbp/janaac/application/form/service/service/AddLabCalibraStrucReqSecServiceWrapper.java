/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddLabCalibraStrucReqSecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabCalibraStrucReqSecService
 * @generated
 */
public class AddLabCalibraStrucReqSecServiceWrapper
	implements AddLabCalibraStrucReqSecService,
			   ServiceWrapper<AddLabCalibraStrucReqSecService> {

	public AddLabCalibraStrucReqSecServiceWrapper() {
		this(null);
	}

	public AddLabCalibraStrucReqSecServiceWrapper(
		AddLabCalibraStrucReqSecService addLabCalibraStrucReqSecService) {

		_addLabCalibraStrucReqSecService = addLabCalibraStrucReqSecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabCalibraStrucReqSecService.getOSGiServiceIdentifier();
	}

	@Override
	public AddLabCalibraStrucReqSecService getWrappedService() {
		return _addLabCalibraStrucReqSecService;
	}

	@Override
	public void setWrappedService(
		AddLabCalibraStrucReqSecService addLabCalibraStrucReqSecService) {

		_addLabCalibraStrucReqSecService = addLabCalibraStrucReqSecService;
	}

	private AddLabCalibraStrucReqSecService _addLabCalibraStrucReqSecService;

}