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
 * The extended model interface for the SezStatusDeskVerification service. Represents a row in the &quot;nbp_sez_status_desk_verificat&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationImpl"
)
@ProviderType
public interface SezStatusDeskVerification
	extends PersistedModel, SezStatusDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusDeskVerification, Long>
		SEZ_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<SezStatusDeskVerification, Long>() {

				@Override
				public Long get(
					SezStatusDeskVerification sezStatusDeskVerification) {

					return sezStatusDeskVerification.getSezDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusDeskVerification> getTypeClass() {
					return SezStatusDeskVerification.class;
				}

			};

}