/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthDeskVerification service. Represents a row in the &quot;nbp_health_desk_verifica&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationImpl"
)
@ProviderType
public interface HealthDeskVerification
	extends HealthDeskVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthDeskVerification, Long>
		HEALTH_DESK_VERIFICATION_ID_ACCESSOR =
			new Accessor<HealthDeskVerification, Long>() {

				@Override
				public Long get(HealthDeskVerification healthDeskVerification) {
					return healthDeskVerification.getHealthDeskVerificationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthDeskVerification> getTypeClass() {
					return HealthDeskVerification.class;
				}

			};

}