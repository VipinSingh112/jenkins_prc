/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil;

/**
 * The extended model base implementation for the OsiServicesAppPayment service. Represents a row in the &quot;nbp_osi_services_fee_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServicesAppPaymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPaymentImpl
 * @see OsiServicesAppPayment
 * @generated
 */
public abstract class OsiServicesAppPaymentBaseImpl
	extends OsiServicesAppPaymentModelImpl implements OsiServicesAppPayment {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services app payment model instance should use the <code>OsiServicesAppPayment</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiServicesAppPaymentLocalServiceUtil.addOsiServicesAppPayment(
				this);
		}
		else {
			OsiServicesAppPaymentLocalServiceUtil.updateOsiServicesAppPayment(
				this);
		}
	}

}