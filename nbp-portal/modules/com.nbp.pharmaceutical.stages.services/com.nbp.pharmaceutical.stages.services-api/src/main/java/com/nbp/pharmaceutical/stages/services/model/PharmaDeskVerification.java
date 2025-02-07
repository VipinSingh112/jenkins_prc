/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaDeskVerification service. Represents a row in the &quot;nbp_pharma_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationImpl"
)
@ProviderType
public interface PharmaDeskVerification
	extends PersistedModel, PharmaDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaDeskVerification, Long>
		PHARMA_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<PharmaDeskVerification, Long>() {

				@Override
				public Long get(PharmaDeskVerification pharmaDeskVerification) {
					return pharmaDeskVerification.getPharmaDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<PharmaDeskVerification> getTypeClass() {
					return PharmaDeskVerification.class;
				}

			};

}