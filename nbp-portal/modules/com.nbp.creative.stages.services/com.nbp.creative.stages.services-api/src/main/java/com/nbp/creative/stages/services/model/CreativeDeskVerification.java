/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeDeskVerification service. Represents a row in the &quot;nbp_creative_desk_veri&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationImpl"
)
@ProviderType
public interface CreativeDeskVerification
	extends CreativeDeskVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeDeskVerification, Long>
		CREATIVE_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<CreativeDeskVerification, Long>() {

				@Override
				public Long get(
					CreativeDeskVerification creativeDeskVerification) {

					return creativeDeskVerification.
						getCreativeDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeDeskVerification> getTypeClass() {
					return CreativeDeskVerification.class;
				}

			};

}