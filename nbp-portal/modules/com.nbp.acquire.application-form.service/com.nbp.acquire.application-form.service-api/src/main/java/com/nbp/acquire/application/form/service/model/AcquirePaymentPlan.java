/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AcquirePaymentPlan service. Represents a row in the &quot;nbp_acquire_payment_plan&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanImpl"
)
@ProviderType
public interface AcquirePaymentPlan
	extends AcquirePaymentPlanModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquirePaymentPlan, Long>
		ACQUIRE_PAYMENT_PLAN_ID_ACCESSOR =
			new Accessor<AcquirePaymentPlan, Long>() {

				@Override
				public Long get(AcquirePaymentPlan acquirePaymentPlan) {
					return acquirePaymentPlan.getAcquirePaymentPlanId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquirePaymentPlan> getTypeClass() {
					return AcquirePaymentPlan.class;
				}

			};

}