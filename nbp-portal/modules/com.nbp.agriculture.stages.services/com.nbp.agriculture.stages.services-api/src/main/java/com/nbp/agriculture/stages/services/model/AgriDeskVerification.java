/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgriDeskVerification service. Represents a row in the &quot;nbp_agri_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationImpl"
)
@ProviderType
public interface AgriDeskVerification
	extends AgriDeskVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgriDeskVerification, Long>
		AGRI_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<AgriDeskVerification, Long>() {

				@Override
				public Long get(AgriDeskVerification agriDeskVerification) {
					return agriDeskVerification.getAgriDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgriDeskVerification> getTypeClass() {
					return AgriDeskVerification.class;
				}

			};

}