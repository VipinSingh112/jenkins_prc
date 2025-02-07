/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OgtClaimToSpouse service. Represents a row in the &quot;nbp_ogt_claim_to_spouse&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouseModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseImpl"
)
@ProviderType
public interface OgtClaimToSpouse
	extends OgtClaimToSpouseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OgtClaimToSpouse, Long>
		OGT_CLAIM_TO_SPOUSE_ID_ACCESSOR =
			new Accessor<OgtClaimToSpouse, Long>() {

				@Override
				public Long get(OgtClaimToSpouse ogtClaimToSpouse) {
					return ogtClaimToSpouse.getOgtClaimToSpouseId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OgtClaimToSpouse> getTypeClass() {
					return OgtClaimToSpouse.class;
				}

			};

}