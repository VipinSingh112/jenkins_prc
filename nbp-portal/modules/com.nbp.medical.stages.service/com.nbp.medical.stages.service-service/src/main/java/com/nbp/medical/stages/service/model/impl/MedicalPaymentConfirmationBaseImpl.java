/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

import com.nbp.medical.stages.service.model.MedicalPaymentConfirmation;
import com.nbp.medical.stages.service.service.MedicalPaymentConfirmationLocalServiceUtil;

/**
 * The extended model base implementation for the MedicalPaymentConfirmation service. Represents a row in the &quot;nbp_medical_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalPaymentConfirmationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationImpl
 * @see MedicalPaymentConfirmation
 * @generated
 */
public abstract class MedicalPaymentConfirmationBaseImpl
	extends MedicalPaymentConfirmationModelImpl
	implements MedicalPaymentConfirmation {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical payment confirmation model instance should use the <code>MedicalPaymentConfirmation</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MedicalPaymentConfirmationLocalServiceUtil.
				addMedicalPaymentConfirmation(this);
		}
		else {
			MedicalPaymentConfirmationLocalServiceUtil.
				updateMedicalPaymentConfirmation(this);
		}
	}

}