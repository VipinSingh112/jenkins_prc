/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JadscAppliReviewAndValid service. Represents a row in the &quot;nbp_jadsc_appli_review_veri&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidImpl"
)
@ProviderType
public interface JadscAppliReviewAndValid
	extends JadscAppliReviewAndValidModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JadscAppliReviewAndValid, Long>
		JADSC_APPLI_REVIEW_AND_VALID_ID_ACCESSOR =
			new Accessor<JadscAppliReviewAndValid, Long>() {

				@Override
				public Long get(
					JadscAppliReviewAndValid jadscAppliReviewAndValid) {

					return jadscAppliReviewAndValid.
						getJadscAppliReviewAndValidId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JadscAppliReviewAndValid> getTypeClass() {
					return JadscAppliReviewAndValid.class;
				}

			};

}