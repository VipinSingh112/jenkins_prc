/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiAssesmentDetailsOfAsset service. Represents a row in the &quot;nbp_osi_insolvecy_det_asset&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAssetModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetImpl"
)
@ProviderType
public interface OsiAssesmentDetailsOfAsset
	extends OsiAssesmentDetailsOfAssetModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiAssesmentDetailsOfAsset, Long>
		OSI_ASSET_DETAILS_ID_ACCESSOR =
			new Accessor<OsiAssesmentDetailsOfAsset, Long>() {

				@Override
				public Long get(
					OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

					return osiAssesmentDetailsOfAsset.getOsiAssetDetailsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiAssesmentDetailsOfAsset> getTypeClass() {
					return OsiAssesmentDetailsOfAsset.class;
				}

			};

}