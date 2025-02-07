/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicPayment service. Represents a row in the &quot;nbp_miic_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.application.form.services.model.impl.MiicPaymentImpl"
)
@ProviderType
public interface MiicPayment extends MiicPaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.application.form.services.model.impl.MiicPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicPayment, Long> MIIC_PAYMENT_ID_ACCESSOR =
		new Accessor<MiicPayment, Long>() {

			@Override
			public Long get(MiicPayment miicPayment) {
				return miicPayment.getMiicPaymentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MiicPayment> getTypeClass() {
				return MiicPayment.class;
			}

		};

}