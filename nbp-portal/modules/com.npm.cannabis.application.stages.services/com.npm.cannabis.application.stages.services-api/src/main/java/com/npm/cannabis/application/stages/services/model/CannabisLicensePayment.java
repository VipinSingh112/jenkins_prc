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
 * The extended model interface for the CannabisLicensePayment service. Represents a row in the &quot;nbp_cannabis_license_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentImpl"
)
@ProviderType
public interface CannabisLicensePayment
	extends CannabisLicensePaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisLicensePayment, Long>
		CANNABIS_LICENSE_PAYMENT_ID_ACCESSOR =
			new Accessor<CannabisLicensePayment, Long>() {

				@Override
				public Long get(CannabisLicensePayment cannabisLicensePayment) {
					return cannabisLicensePayment.getCannabisLicensePaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisLicensePayment> getTypeClass() {
					return CannabisLicensePayment.class;
				}

			};

}