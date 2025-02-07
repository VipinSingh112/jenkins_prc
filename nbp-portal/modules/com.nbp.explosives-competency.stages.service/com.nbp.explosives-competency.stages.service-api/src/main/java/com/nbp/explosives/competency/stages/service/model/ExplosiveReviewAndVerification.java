/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosiveReviewAndVerification service. Represents a row in the &quot;nbp_explosive_rev_ver&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationImpl"
)
@ProviderType
public interface ExplosiveReviewAndVerification
	extends ExplosiveReviewAndVerificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosiveReviewAndVerification, Long>
		ISSUANCE_ID_ACCESSOR =
			new Accessor<ExplosiveReviewAndVerification, Long>() {

				@Override
				public Long get(
					ExplosiveReviewAndVerification
						explosiveReviewAndVerification) {

					return explosiveReviewAndVerification.getIssuanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosiveReviewAndVerification> getTypeClass() {
					return ExplosiveReviewAndVerification.class;
				}

			};

}