/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAddBranchDetailInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddBranchDetailInfoService
 * @generated
 */
public class JtbAddBranchDetailInfoServiceWrapper
	implements JtbAddBranchDetailInfoService,
			   ServiceWrapper<JtbAddBranchDetailInfoService> {

	public JtbAddBranchDetailInfoServiceWrapper() {
		this(null);
	}

	public JtbAddBranchDetailInfoServiceWrapper(
		JtbAddBranchDetailInfoService jtbAddBranchDetailInfoService) {

		_jtbAddBranchDetailInfoService = jtbAddBranchDetailInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddBranchDetailInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAddBranchDetailInfoService getWrappedService() {
		return _jtbAddBranchDetailInfoService;
	}

	@Override
	public void setWrappedService(
		JtbAddBranchDetailInfoService jtbAddBranchDetailInfoService) {

		_jtbAddBranchDetailInfoService = jtbAddBranchDetailInfoService;
	}

	private JtbAddBranchDetailInfoService _jtbAddBranchDetailInfoService;

}