/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiAssessmentSignatureService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignatureService
 * @generated
 */
public class OsiAssessmentSignatureServiceWrapper
	implements OsiAssessmentSignatureService,
			   ServiceWrapper<OsiAssessmentSignatureService> {

	public OsiAssessmentSignatureServiceWrapper() {
		this(null);
	}

	public OsiAssessmentSignatureServiceWrapper(
		OsiAssessmentSignatureService osiAssessmentSignatureService) {

		_osiAssessmentSignatureService = osiAssessmentSignatureService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiAssessmentSignatureService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiAssessmentSignatureService getWrappedService() {
		return _osiAssessmentSignatureService;
	}

	@Override
	public void setWrappedService(
		OsiAssessmentSignatureService osiAssessmentSignatureService) {

		_osiAssessmentSignatureService = osiAssessmentSignatureService;
	}

	private OsiAssessmentSignatureService _osiAssessmentSignatureService;

}