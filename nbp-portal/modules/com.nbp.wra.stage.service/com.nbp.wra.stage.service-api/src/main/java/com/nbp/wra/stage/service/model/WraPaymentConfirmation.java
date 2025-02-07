/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WraPaymentConfirmation service. Represents a row in the &quot;nbp_wra_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationImpl"
)
@ProviderType
public interface WraPaymentConfirmation
	extends PersistedModel, WraPaymentConfirmationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WraPaymentConfirmation, Long>
		WRA_PAYMENT_CONFIRMATION_ID_ACCESSOR =
			new Accessor<WraPaymentConfirmation, Long>() {

				@Override
				public Long get(WraPaymentConfirmation wraPaymentConfirmation) {
					return wraPaymentConfirmation.getWraPaymentConfirmationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<WraPaymentConfirmation> getTypeClass() {
					return WraPaymentConfirmation.class;
				}

			};

}