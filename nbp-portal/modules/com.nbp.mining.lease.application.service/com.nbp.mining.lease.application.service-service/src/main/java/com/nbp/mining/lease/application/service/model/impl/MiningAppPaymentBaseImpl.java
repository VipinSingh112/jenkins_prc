/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;

/**
 * The extended model base implementation for the MiningAppPayment service. Represents a row in the &quot;nbp_mining_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiningAppPaymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppPaymentImpl
 * @see MiningAppPayment
 * @generated
 */
public abstract class MiningAppPaymentBaseImpl
	extends MiningAppPaymentModelImpl implements MiningAppPayment {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mining app payment model instance should use the <code>MiningAppPayment</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MiningAppPaymentLocalServiceUtil.addMiningAppPayment(this);
		}
		else {
			MiningAppPaymentLocalServiceUtil.updateMiningAppPayment(this);
		}
	}

}