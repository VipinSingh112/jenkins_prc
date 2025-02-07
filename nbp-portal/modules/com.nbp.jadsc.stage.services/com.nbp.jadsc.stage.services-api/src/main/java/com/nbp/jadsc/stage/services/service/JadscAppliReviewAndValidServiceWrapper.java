/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscAppliReviewAndValidService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidService
 * @generated
 */
public class JadscAppliReviewAndValidServiceWrapper
	implements JadscAppliReviewAndValidService,
			   ServiceWrapper<JadscAppliReviewAndValidService> {

	public JadscAppliReviewAndValidServiceWrapper() {
		this(null);
	}

	public JadscAppliReviewAndValidServiceWrapper(
		JadscAppliReviewAndValidService jadscAppliReviewAndValidService) {

		_jadscAppliReviewAndValidService = jadscAppliReviewAndValidService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliReviewAndValidService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscAppliReviewAndValidService getWrappedService() {
		return _jadscAppliReviewAndValidService;
	}

	@Override
	public void setWrappedService(
		JadscAppliReviewAndValidService jadscAppliReviewAndValidService) {

		_jadscAppliReviewAndValidService = jadscAppliReviewAndValidService;
	}

	private JadscAppliReviewAndValidService _jadscAppliReviewAndValidService;

}