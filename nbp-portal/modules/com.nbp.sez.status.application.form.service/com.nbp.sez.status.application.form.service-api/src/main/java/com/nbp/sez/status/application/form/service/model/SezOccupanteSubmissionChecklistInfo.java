/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezOccupanteSubmissionChecklistInfo service. Represents a row in the &quot;nbp_sez_occ_sub_check_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoImpl"
)
@ProviderType
public interface SezOccupanteSubmissionChecklistInfo
	extends PersistedModel, SezOccupanteSubmissionChecklistInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezOccupanteSubmissionChecklistInfo, Long>
		SEZ_OCC_CHECK_SUBMIT_ID_ACCESSOR =
			new Accessor<SezOccupanteSubmissionChecklistInfo, Long>() {

				@Override
				public Long get(
					SezOccupanteSubmissionChecklistInfo
						sezOccupanteSubmissionChecklistInfo) {

					return sezOccupanteSubmissionChecklistInfo.
						getSezOccCheckSubmitId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezOccupanteSubmissionChecklistInfo>
					getTypeClass() {

					return SezOccupanteSubmissionChecklistInfo.class;
				}

			};

}