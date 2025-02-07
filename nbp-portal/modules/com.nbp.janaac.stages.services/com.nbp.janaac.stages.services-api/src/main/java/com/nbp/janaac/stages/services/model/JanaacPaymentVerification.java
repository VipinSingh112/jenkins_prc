/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JanaacPaymentVerification service. Represents a row in the &quot;nbp_janaac_payment_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationImpl"
)
@ProviderType
public interface JanaacPaymentVerification
	extends JanaacPaymentVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JanaacPaymentVerification, Long>
		JANAAC_PAYMENT_VERIFICATION_ID_ACCESSOR =
			new Accessor<JanaacPaymentVerification, Long>() {

				@Override
				public Long get(
					JanaacPaymentVerification janaacPaymentVerification) {

					return janaacPaymentVerification.
						getJanaacPaymentVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JanaacPaymentVerification> getTypeClass() {
					return JanaacPaymentVerification.class;
				}

			};

}