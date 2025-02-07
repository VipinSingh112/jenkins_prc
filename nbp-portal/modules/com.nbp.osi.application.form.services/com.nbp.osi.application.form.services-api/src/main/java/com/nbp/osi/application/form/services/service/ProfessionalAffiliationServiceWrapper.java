/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProfessionalAffiliationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliationService
 * @generated
 */
public class ProfessionalAffiliationServiceWrapper
	implements ProfessionalAffiliationService,
			   ServiceWrapper<ProfessionalAffiliationService> {

	public ProfessionalAffiliationServiceWrapper() {
		this(null);
	}

	public ProfessionalAffiliationServiceWrapper(
		ProfessionalAffiliationService professionalAffiliationService) {

		_professionalAffiliationService = professionalAffiliationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _professionalAffiliationService.getOSGiServiceIdentifier();
	}

	@Override
	public ProfessionalAffiliationService getWrappedService() {
		return _professionalAffiliationService;
	}

	@Override
	public void setWrappedService(
		ProfessionalAffiliationService professionalAffiliationService) {

		_professionalAffiliationService = professionalAffiliationService;
	}

	private ProfessionalAffiliationService _professionalAffiliationService;

}