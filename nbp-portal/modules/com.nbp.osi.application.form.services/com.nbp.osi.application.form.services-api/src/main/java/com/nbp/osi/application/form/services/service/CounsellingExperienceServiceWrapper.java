/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CounsellingExperienceService}.
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperienceService
 * @generated
 */
public class CounsellingExperienceServiceWrapper
	implements CounsellingExperienceService,
			   ServiceWrapper<CounsellingExperienceService> {

	public CounsellingExperienceServiceWrapper() {
		this(null);
	}

	public CounsellingExperienceServiceWrapper(
		CounsellingExperienceService counsellingExperienceService) {

		_counsellingExperienceService = counsellingExperienceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _counsellingExperienceService.getOSGiServiceIdentifier();
	}

	@Override
	public CounsellingExperienceService getWrappedService() {
		return _counsellingExperienceService;
	}

	@Override
	public void setWrappedService(
		CounsellingExperienceService counsellingExperienceService) {

		_counsellingExperienceService = counsellingExperienceService;
	}

	private CounsellingExperienceService _counsellingExperienceService;

}