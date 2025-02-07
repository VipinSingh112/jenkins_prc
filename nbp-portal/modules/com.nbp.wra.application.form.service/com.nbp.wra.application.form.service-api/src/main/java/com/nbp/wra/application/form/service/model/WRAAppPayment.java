/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WRAAppPayment service. Represents a row in the &quot;nbp_wra_app_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.application.form.service.model.impl.WRAAppPaymentImpl"
)
@ProviderType
public interface WRAAppPayment extends PersistedModel, WRAAppPaymentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.application.form.service.model.impl.WRAAppPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WRAAppPayment, Long>
		WRA_APP_PAYMENT_ID_ACCESSOR = new Accessor<WRAAppPayment, Long>() {

			@Override
			public Long get(WRAAppPayment wraAppPayment) {
				return wraAppPayment.getWraAppPaymentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<WRAAppPayment> getTypeClass() {
				return WRAAppPayment.class;
			}

		};

}