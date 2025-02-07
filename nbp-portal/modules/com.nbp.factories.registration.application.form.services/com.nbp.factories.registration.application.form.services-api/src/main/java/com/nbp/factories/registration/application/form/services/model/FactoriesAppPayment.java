/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoriesAppPayment service. Represents a row in the &quot;nbp_factories_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentImpl"
)
@ProviderType
public interface FactoriesAppPayment
	extends FactoriesAppPaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesAppPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoriesAppPayment, Long>
		FACTORIES_APP_PAYMENT_ID_ACCESSOR =
			new Accessor<FactoriesAppPayment, Long>() {

				@Override
				public Long get(FactoriesAppPayment factoriesAppPayment) {
					return factoriesAppPayment.getFactoriesAppPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoriesAppPayment> getTypeClass() {
					return FactoriesAppPayment.class;
				}

			};

}