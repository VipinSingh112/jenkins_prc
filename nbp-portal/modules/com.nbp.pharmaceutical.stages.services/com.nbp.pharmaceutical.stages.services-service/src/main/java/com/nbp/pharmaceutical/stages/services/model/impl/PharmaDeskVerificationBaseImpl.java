/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;
import com.nbp.pharmaceutical.stages.services.service.PharmaDeskVerificationLocalServiceUtil;

/**
 * The extended model base implementation for the PharmaDeskVerification service. Represents a row in the &quot;nbp_pharma_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PharmaDeskVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationImpl
 * @see PharmaDeskVerification
 * @generated
 */
public abstract class PharmaDeskVerificationBaseImpl
	extends PharmaDeskVerificationModelImpl implements PharmaDeskVerification {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pharma desk verification model instance should use the <code>PharmaDeskVerification</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			PharmaDeskVerificationLocalServiceUtil.addPharmaDeskVerification(
				this);
		}
		else {
			PharmaDeskVerificationLocalServiceUtil.updatePharmaDeskVerification(
				this);
		}
	}

}