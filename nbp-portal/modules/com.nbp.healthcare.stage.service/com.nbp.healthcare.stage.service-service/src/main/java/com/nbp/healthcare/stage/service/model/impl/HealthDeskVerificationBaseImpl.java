/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

import com.nbp.healthcare.stage.service.model.HealthDeskVerification;
import com.nbp.healthcare.stage.service.service.HealthDeskVerificationLocalServiceUtil;

/**
 * The extended model base implementation for the HealthDeskVerification service. Represents a row in the &quot;nbp_health_desk_verifica&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HealthDeskVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationImpl
 * @see HealthDeskVerification
 * @generated
 */
public abstract class HealthDeskVerificationBaseImpl
	extends HealthDeskVerificationModelImpl implements HealthDeskVerification {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a health desk verification model instance should use the <code>HealthDeskVerification</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			HealthDeskVerificationLocalServiceUtil.addHealthDeskVerification(
				this);
		}
		else {
			HealthDeskVerificationLocalServiceUtil.updateHealthDeskVerification(
				this);
		}
	}

}