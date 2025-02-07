/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JTBPaymentMethod service. Represents a row in the &quot;nbp_jtb_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodImpl"
)
@ProviderType
public interface JTBPaymentMethod
	extends JTBPaymentMethodModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JTBPaymentMethod, Long>
		J_TB_PAYMENT_METHOD_ID_ACCESSOR =
			new Accessor<JTBPaymentMethod, Long>() {

				@Override
				public Long get(JTBPaymentMethod jtbPaymentMethod) {
					return jtbPaymentMethod.getJTBPaymentMethodId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JTBPaymentMethod> getTypeClass() {
					return JTBPaymentMethod.class;
				}

			};

}