/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil;

/**
 * The extended model base implementation for the SezStatusAppPayment service. Represents a row in the &quot;nbp_sez_status_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusAppPaymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusAppPaymentImpl
 * @see SezStatusAppPayment
 * @generated
 */
public abstract class SezStatusAppPaymentBaseImpl
	extends SezStatusAppPaymentModelImpl implements SezStatusAppPayment {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status app payment model instance should use the <code>SezStatusAppPayment</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezStatusAppPaymentLocalServiceUtil.addSezStatusAppPayment(this);
		}
		else {
			SezStatusAppPaymentLocalServiceUtil.updateSezStatusAppPayment(this);
		}
	}

}