/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaApplicationPayment service. Represents a row in the &quot;nbp_pharma_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentImpl"
)
@ProviderType
public interface PharmaApplicationPayment
	extends PersistedModel, PharmaApplicationPaymentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaApplicationPayment, Long>
		PHARMA_APPLICATION_PAYMENT_ID_ACCESSOR =
			new Accessor<PharmaApplicationPayment, Long>() {

				@Override
				public Long get(
					PharmaApplicationPayment pharmaApplicationPayment) {

					return pharmaApplicationPayment.
						getPharmaApplicationPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<PharmaApplicationPayment> getTypeClass() {
					return PharmaApplicationPayment.class;
				}

			};

}