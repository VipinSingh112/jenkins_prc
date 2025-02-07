/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccCerBodyApplicantInfo service. Represents a row in the &quot;nbp_janaac_acc_cer_app_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccCerBodyApplicantInfoImpl"
)
@ProviderType
public interface AccCerBodyApplicantInfo
	extends AccCerBodyApplicantInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyApplicantInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccCerBodyApplicantInfo, Long>
		ACC_CER_BODY_APPLICANT_INFO_ID_ACCESSOR =
			new Accessor<AccCerBodyApplicantInfo, Long>() {

				@Override
				public Long get(
					AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

					return accCerBodyApplicantInfo.
						getAccCerBodyApplicantInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccCerBodyApplicantInfo> getTypeClass() {
					return AccCerBodyApplicantInfo.class;
				}

			};

}