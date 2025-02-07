/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;
import com.nbp.explosives.competency.application.form.service.service.ExplosiveAppPaymentLocalServiceUtil;

/**
 * The extended model base implementation for the ExplosiveAppPayment service. Represents a row in the &quot;nbp_explosive_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExplosiveAppPaymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentImpl
 * @see ExplosiveAppPayment
 * @generated
 */
public abstract class ExplosiveAppPaymentBaseImpl
	extends ExplosiveAppPaymentModelImpl implements ExplosiveAppPayment {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a explosive app payment model instance should use the <code>ExplosiveAppPayment</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ExplosiveAppPaymentLocalServiceUtil.addExplosiveAppPayment(this);
		}
		else {
			ExplosiveAppPaymentLocalServiceUtil.updateExplosiveAppPayment(this);
		}
	}

}