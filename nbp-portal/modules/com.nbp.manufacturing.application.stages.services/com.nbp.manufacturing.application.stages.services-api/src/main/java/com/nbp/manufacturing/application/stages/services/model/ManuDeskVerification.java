/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManuDeskVerification service. Represents a row in the &quot;nbp_manu_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl"
)
@ProviderType
public interface ManuDeskVerification
	extends ManuDeskVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuDeskVerification, Long>
		MANU_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<ManuDeskVerification, Long>() {

				@Override
				public Long get(ManuDeskVerification manuDeskVerification) {
					return manuDeskVerification.getManuDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManuDeskVerification> getTypeClass() {
					return ManuDeskVerification.class;
				}

			};

}