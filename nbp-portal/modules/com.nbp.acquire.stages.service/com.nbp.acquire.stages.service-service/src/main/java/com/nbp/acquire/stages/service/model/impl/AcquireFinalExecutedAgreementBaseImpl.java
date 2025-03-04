/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;
import com.nbp.acquire.stages.service.service.AcquireFinalExecutedAgreementLocalServiceUtil;

/**
 * The extended model base implementation for the AcquireFinalExecutedAgreement service. Represents a row in the &quot;nbp_acquire_executed_agree&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquireFinalExecutedAgreementImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementImpl
 * @see AcquireFinalExecutedAgreement
 * @generated
 */
public abstract class AcquireFinalExecutedAgreementBaseImpl
	extends AcquireFinalExecutedAgreementModelImpl
	implements AcquireFinalExecutedAgreement {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire final executed agreement model instance should use the <code>AcquireFinalExecutedAgreement</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AcquireFinalExecutedAgreementLocalServiceUtil.
				addAcquireFinalExecutedAgreement(this);
		}
		else {
			AcquireFinalExecutedAgreementLocalServiceUtil.
				updateAcquireFinalExecutedAgreement(this);
		}
	}

}