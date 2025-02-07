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
 * The extended model interface for the OgtClaimantDetail service. Represents a row in the &quot;nbp_ogt_claimant_detail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetailModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailImpl"
)
@ProviderType
public interface OgtClaimantDetail
	extends OgtClaimantDetailModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OgtClaimantDetail, Long>
		OGT_CLAIMANT_DETAIL_ID_ACCESSOR =
			new Accessor<OgtClaimantDetail, Long>() {

				@Override
				public Long get(OgtClaimantDetail ogtClaimantDetail) {
					return ogtClaimantDetail.getOgtClaimantDetailId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OgtClaimantDetail> getTypeClass() {
					return OgtClaimantDetail.class;
				}

			};

}