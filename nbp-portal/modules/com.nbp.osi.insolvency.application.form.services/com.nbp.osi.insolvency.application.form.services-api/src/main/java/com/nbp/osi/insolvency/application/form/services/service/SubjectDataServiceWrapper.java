/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubjectDataService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubjectDataService
 * @generated
 */
public class SubjectDataServiceWrapper
	implements ServiceWrapper<SubjectDataService>, SubjectDataService {

	public SubjectDataServiceWrapper() {
		this(null);
	}

	public SubjectDataServiceWrapper(SubjectDataService subjectDataService) {
		_subjectDataService = subjectDataService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subjectDataService.getOSGiServiceIdentifier();
	}

	@Override
	public SubjectDataService getWrappedService() {
		return _subjectDataService;
	}

	@Override
	public void setWrappedService(SubjectDataService subjectDataService) {
		_subjectDataService = subjectDataService;
	}

	private SubjectDataService _subjectDataService;

}