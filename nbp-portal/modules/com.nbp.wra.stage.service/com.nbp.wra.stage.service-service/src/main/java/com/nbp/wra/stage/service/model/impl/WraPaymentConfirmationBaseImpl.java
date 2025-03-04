/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.nbp.wra.stage.service.model.WraPaymentConfirmation;
import com.nbp.wra.stage.service.service.WraPaymentConfirmationLocalServiceUtil;

/**
 * The extended model base implementation for the WraPaymentConfirmation service. Represents a row in the &quot;nbp_wra_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WraPaymentConfirmationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationImpl
 * @see WraPaymentConfirmation
 * @generated
 */
public abstract class WraPaymentConfirmationBaseImpl
	extends WraPaymentConfirmationModelImpl implements WraPaymentConfirmation {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wra payment confirmation model instance should use the <code>WraPaymentConfirmation</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			WraPaymentConfirmationLocalServiceUtil.addWraPaymentConfirmation(
				this);
		}
		else {
			WraPaymentConfirmationLocalServiceUtil.updateWraPaymentConfirmation(
				this);
		}
	}

}