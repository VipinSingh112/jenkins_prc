/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjPaymentConfirmation service. Represents a row in the &quot;nbp_ncbj_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationImpl"
)
@ProviderType
public interface NcbjPaymentConfirmation
	extends NcbjPaymentConfirmationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjPaymentConfirmation, Long>
		NCBJ_PAYMENT_CONFIRMATION_ID_ACCESSOR =
			new Accessor<NcbjPaymentConfirmation, Long>() {

				@Override
				public Long get(
					NcbjPaymentConfirmation ncbjPaymentConfirmation) {

					return ncbjPaymentConfirmation.
						getNcbjPaymentConfirmationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjPaymentConfirmation> getTypeClass() {
					return NcbjPaymentConfirmation.class;
				}

			};

}