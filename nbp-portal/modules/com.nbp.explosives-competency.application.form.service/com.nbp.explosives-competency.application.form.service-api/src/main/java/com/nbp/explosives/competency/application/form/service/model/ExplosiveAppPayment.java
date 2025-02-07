/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosiveAppPayment service. Represents a row in the &quot;nbp_explosive_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentImpl"
)
@ProviderType
public interface ExplosiveAppPayment
	extends ExplosiveAppPaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosiveAppPayment, Long>
		EXPLOSIVE_APP_PAYMENT_ID_ACCESSOR =
			new Accessor<ExplosiveAppPayment, Long>() {

				@Override
				public Long get(ExplosiveAppPayment explosiveAppPayment) {
					return explosiveAppPayment.getExplosiveAppPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosiveAppPayment> getTypeClass() {
					return ExplosiveAppPayment.class;
				}

			};

}