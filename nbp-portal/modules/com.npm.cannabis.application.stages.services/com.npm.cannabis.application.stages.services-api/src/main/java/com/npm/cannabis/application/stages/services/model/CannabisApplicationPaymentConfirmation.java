/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisApplicationPaymentConfirmation service. Represents a row in the &quot;nbp_cannabis_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationImpl"
)
@ProviderType
public interface CannabisApplicationPaymentConfirmation
	extends CannabisApplicationPaymentConfirmationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisApplicationPaymentConfirmation, Long>
		CANNABIS_APPLI_PAYMENT_CONFIR_ID_ACCESSOR =
			new Accessor<CannabisApplicationPaymentConfirmation, Long>() {

				@Override
				public Long get(
					CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation) {

					return cannabisApplicationPaymentConfirmation.
						getCannabisAppliPaymentConfirId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisApplicationPaymentConfirmation>
					getTypeClass() {

					return CannabisApplicationPaymentConfirmation.class;
				}

			};

}