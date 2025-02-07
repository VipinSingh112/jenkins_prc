/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezStatusPaymentConfirmation service. Represents a row in the &quot;nbp_sez_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationImpl"
)
@ProviderType
public interface SezStatusPaymentConfirmation
	extends PersistedModel, SezStatusPaymentConfirmationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusPaymentConfirmation, Long>
		SEZ_PAYMENT_ID_ACCESSOR =
			new Accessor<SezStatusPaymentConfirmation, Long>() {

				@Override
				public Long get(
					SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

					return sezStatusPaymentConfirmation.getSezPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusPaymentConfirmation> getTypeClass() {
					return SezStatusPaymentConfirmation.class;
				}

			};

}