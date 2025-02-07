/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;
import com.nbp.osi.insolvency.stage.services.service.OsiInsolvencyPaymentConfirmationLocalServiceUtil;

/**
 * The extended model base implementation for the OsiInsolvencyPaymentConfirmation service. Represents a row in the &quot;nbp_osi_inso_payment_con&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiInsolvencyPaymentConfirmationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationImpl
 * @see OsiInsolvencyPaymentConfirmation
 * @generated
 */
public abstract class OsiInsolvencyPaymentConfirmationBaseImpl
	extends OsiInsolvencyPaymentConfirmationModelImpl
	implements OsiInsolvencyPaymentConfirmation {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi insolvency payment confirmation model instance should use the <code>OsiInsolvencyPaymentConfirmation</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiInsolvencyPaymentConfirmationLocalServiceUtil.
				addOsiInsolvencyPaymentConfirmation(this);
		}
		else {
			OsiInsolvencyPaymentConfirmationLocalServiceUtil.
				updateOsiInsolvencyPaymentConfirmation(this);
		}
	}

}