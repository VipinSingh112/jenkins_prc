/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthCareApplicationPayment service. Represents a row in the &quot;nbp_healthcare_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentImpl"
)
@ProviderType
public interface HealthCareApplicationPayment
	extends HealthCareApplicationPaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareApplicationPayment, Long>
		HEALTH_CARE_APPLICATION_PAYMENT_ID_ACCESSOR =
			new Accessor<HealthCareApplicationPayment, Long>() {

				@Override
				public Long get(
					HealthCareApplicationPayment healthCareApplicationPayment) {

					return healthCareApplicationPayment.
						getHealthCareApplicationPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareApplicationPayment> getTypeClass() {
					return HealthCareApplicationPayment.class;
				}

			};

}