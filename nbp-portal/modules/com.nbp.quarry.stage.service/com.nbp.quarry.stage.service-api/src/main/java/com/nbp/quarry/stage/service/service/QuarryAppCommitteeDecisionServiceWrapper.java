/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryAppCommitteeDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecisionService
 * @generated
 */
public class QuarryAppCommitteeDecisionServiceWrapper
	implements QuarryAppCommitteeDecisionService,
			   ServiceWrapper<QuarryAppCommitteeDecisionService> {

	public QuarryAppCommitteeDecisionServiceWrapper() {
		this(null);
	}

	public QuarryAppCommitteeDecisionServiceWrapper(
		QuarryAppCommitteeDecisionService quarryAppCommitteeDecisionService) {

		_quarryAppCommitteeDecisionService = quarryAppCommitteeDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryAppCommitteeDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryAppCommitteeDecisionService getWrappedService() {
		return _quarryAppCommitteeDecisionService;
	}

	@Override
	public void setWrappedService(
		QuarryAppCommitteeDecisionService quarryAppCommitteeDecisionService) {

		_quarryAppCommitteeDecisionService = quarryAppCommitteeDecisionService;
	}

	private QuarryAppCommitteeDecisionService
		_quarryAppCommitteeDecisionService;

}