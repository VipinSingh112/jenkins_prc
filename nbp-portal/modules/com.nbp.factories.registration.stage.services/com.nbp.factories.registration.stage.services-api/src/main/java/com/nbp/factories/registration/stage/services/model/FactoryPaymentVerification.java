/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoryPaymentVerification service. Represents a row in the &quot;nbp_factory_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationImpl"
)
@ProviderType
public interface FactoryPaymentVerification
	extends FactoryPaymentVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoryPaymentVerification, Long>
		FACTORY_PAYMENT_VERIFICATION_ID_ACCESSOR =
			new Accessor<FactoryPaymentVerification, Long>() {

				@Override
				public Long get(
					FactoryPaymentVerification factoryPaymentVerification) {

					return factoryPaymentVerification.
						getFactoryPaymentVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoryPaymentVerification> getTypeClass() {
					return FactoryPaymentVerification.class;
				}

			};

}