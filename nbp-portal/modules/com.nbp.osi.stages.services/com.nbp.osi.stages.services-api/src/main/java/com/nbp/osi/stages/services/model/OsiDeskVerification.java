/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiDeskVerification service. Represents a row in the &quot;nbp_osi_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.stages.services.model.impl.OsiDeskVerificationImpl"
)
@ProviderType
public interface OsiDeskVerification
	extends OsiDeskVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.stages.services.model.impl.OsiDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiDeskVerification, Long>
		OSI_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<OsiDeskVerification, Long>() {

				@Override
				public Long get(OsiDeskVerification osiDeskVerification) {
					return osiDeskVerification.getOsiDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiDeskVerification> getTypeClass() {
					return OsiDeskVerification.class;
				}

			};

}