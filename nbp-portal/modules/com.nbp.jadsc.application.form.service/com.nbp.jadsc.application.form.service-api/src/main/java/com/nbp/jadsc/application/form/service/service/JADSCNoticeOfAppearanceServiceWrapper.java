/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCNoticeOfAppearanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearanceService
 * @generated
 */
public class JADSCNoticeOfAppearanceServiceWrapper
	implements JADSCNoticeOfAppearanceService,
			   ServiceWrapper<JADSCNoticeOfAppearanceService> {

	public JADSCNoticeOfAppearanceServiceWrapper() {
		this(null);
	}

	public JADSCNoticeOfAppearanceServiceWrapper(
		JADSCNoticeOfAppearanceService jadscNoticeOfAppearanceService) {

		_jadscNoticeOfAppearanceService = jadscNoticeOfAppearanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscNoticeOfAppearanceService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCNoticeOfAppearanceService getWrappedService() {
		return _jadscNoticeOfAppearanceService;
	}

	@Override
	public void setWrappedService(
		JADSCNoticeOfAppearanceService jadscNoticeOfAppearanceService) {

		_jadscNoticeOfAppearanceService = jadscNoticeOfAppearanceService;
	}

	private JADSCNoticeOfAppearanceService _jadscNoticeOfAppearanceService;

}