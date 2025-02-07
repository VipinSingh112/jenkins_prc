/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbAddCraftApplicantInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfoService
 * @generated
 */
public class JtbAddCraftApplicantInfoServiceWrapper
	implements JtbAddCraftApplicantInfoService,
			   ServiceWrapper<JtbAddCraftApplicantInfoService> {

	public JtbAddCraftApplicantInfoServiceWrapper() {
		this(null);
	}

	public JtbAddCraftApplicantInfoServiceWrapper(
		JtbAddCraftApplicantInfoService jtbAddCraftApplicantInfoService) {

		_jtbAddCraftApplicantInfoService = jtbAddCraftApplicantInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddCraftApplicantInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbAddCraftApplicantInfoService getWrappedService() {
		return _jtbAddCraftApplicantInfoService;
	}

	@Override
	public void setWrappedService(
		JtbAddCraftApplicantInfoService jtbAddCraftApplicantInfoService) {

		_jtbAddCraftApplicantInfoService = jtbAddCraftApplicantInfoService;
	}

	private JtbAddCraftApplicantInfoService _jtbAddCraftApplicantInfoService;

}