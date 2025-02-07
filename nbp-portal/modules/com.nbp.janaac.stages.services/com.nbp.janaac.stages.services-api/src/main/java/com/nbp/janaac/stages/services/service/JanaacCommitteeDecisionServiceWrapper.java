/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacCommitteeDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecisionService
 * @generated
 */
public class JanaacCommitteeDecisionServiceWrapper
	implements JanaacCommitteeDecisionService,
			   ServiceWrapper<JanaacCommitteeDecisionService> {

	public JanaacCommitteeDecisionServiceWrapper() {
		this(null);
	}

	public JanaacCommitteeDecisionServiceWrapper(
		JanaacCommitteeDecisionService janaacCommitteeDecisionService) {

		_janaacCommitteeDecisionService = janaacCommitteeDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacCommitteeDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacCommitteeDecisionService getWrappedService() {
		return _janaacCommitteeDecisionService;
	}

	@Override
	public void setWrappedService(
		JanaacCommitteeDecisionService janaacCommitteeDecisionService) {

		_janaacCommitteeDecisionService = janaacCommitteeDecisionService;
	}

	private JanaacCommitteeDecisionService _janaacCommitteeDecisionService;

}