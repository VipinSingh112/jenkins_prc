/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryPaymentConfirmation service. Represents a row in the &quot;nbp_quarry_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationImpl"
)
@ProviderType
public interface QuarryPaymentConfirmation
	extends PersistedModel, QuarryPaymentConfirmationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryPaymentConfirmation, Long>
		QUARRY_PAYMENT_CONFIRMATION_ID_ACCESSOR =
			new Accessor<QuarryPaymentConfirmation, Long>() {

				@Override
				public Long get(
					QuarryPaymentConfirmation quarryPaymentConfirmation) {

					return quarryPaymentConfirmation.
						getQuarryPaymentConfirmationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryPaymentConfirmation> getTypeClass() {
					return QuarryPaymentConfirmation.class;
				}

			};

}