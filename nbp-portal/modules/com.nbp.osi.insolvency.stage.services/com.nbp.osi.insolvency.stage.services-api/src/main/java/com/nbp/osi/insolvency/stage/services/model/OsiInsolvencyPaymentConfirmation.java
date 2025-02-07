/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiInsolvencyPaymentConfirmation service. Represents a row in the &quot;nbp_osi_inso_payment_con&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationImpl"
)
@ProviderType
public interface OsiInsolvencyPaymentConfirmation
	extends OsiInsolvencyPaymentConfirmationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiInsolvencyPaymentConfirmation, Long>
		OSI_IR_PAYMENT_ID_ACCESSOR =
			new Accessor<OsiInsolvencyPaymentConfirmation, Long>() {

				@Override
				public Long get(
					OsiInsolvencyPaymentConfirmation
						osiInsolvencyPaymentConfirmation) {

					return osiInsolvencyPaymentConfirmation.getOsiIRPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiInsolvencyPaymentConfirmation> getTypeClass() {
					return OsiInsolvencyPaymentConfirmation.class;
				}

			};

}