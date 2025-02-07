/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryApplicationPayment service. Represents a row in the &quot;nbp_quarry_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentImpl"
)
@ProviderType
public interface QuarryApplicationPayment
	extends PersistedModel, QuarryApplicationPaymentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryApplicationPayment, Long>
		QUARRY_APPLICATION_PAYMENT_ID_ACCESSOR =
			new Accessor<QuarryApplicationPayment, Long>() {

				@Override
				public Long get(
					QuarryApplicationPayment quarryApplicationPayment) {

					return quarryApplicationPayment.
						getQuarryApplicationPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryApplicationPayment> getTypeClass() {
					return QuarryApplicationPayment.class;
				}

			};

}