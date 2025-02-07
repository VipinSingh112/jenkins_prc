/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicApplicantDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetailsService
 * @generated
 */
public class MiicApplicantDetailsServiceWrapper
	implements MiicApplicantDetailsService,
			   ServiceWrapper<MiicApplicantDetailsService> {

	public MiicApplicantDetailsServiceWrapper() {
		this(null);
	}

	public MiicApplicantDetailsServiceWrapper(
		MiicApplicantDetailsService miicApplicantDetailsService) {

		_miicApplicantDetailsService = miicApplicantDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicantDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicApplicantDetailsService getWrappedService() {
		return _miicApplicantDetailsService;
	}

	@Override
	public void setWrappedService(
		MiicApplicantDetailsService miicApplicantDetailsService) {

		_miicApplicantDetailsService = miicApplicantDetailsService;
	}

	private MiicApplicantDetailsService _miicApplicantDetailsService;

}