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
 * The extended model interface for the OgtInsolventPersonDetail service. Represents a row in the &quot;nbp_ogt_insolvent_person_det&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailImpl"
)
@ProviderType
public interface OgtInsolventPersonDetail
	extends OgtInsolventPersonDetailModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OgtInsolventPersonDetail, Long>
		OGT_INSOLVENT_PERSON_DETAIL_ID_ACCESSOR =
			new Accessor<OgtInsolventPersonDetail, Long>() {

				@Override
				public Long get(
					OgtInsolventPersonDetail ogtInsolventPersonDetail) {

					return ogtInsolventPersonDetail.
						getOgtInsolventPersonDetailId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OgtInsolventPersonDetail> getTypeClass() {
					return OgtInsolventPersonDetail.class;
				}

			};

}